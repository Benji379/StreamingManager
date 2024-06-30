package com.sm.dao;

import com.sm.modelo.Usuario;
import com.sm.utils.PasswordHasher;
import java.sql.Timestamp;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import static com.sm.dao.DaoUtils.*;
import com.sm.modelo.SystemConfig;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class DaoUsuario {

    public DaoUsuario() {

    }

    public static boolean registrar(Usuario usuario) {
        Connection conexion = null;
        PreparedStatement consulta = null;
        String sql = "INSERT INTO us_usuario(nombre,password,correo,whatsapp,\"idGrupo\",\"idRango\",credito,estado,fecha) VALUES (?,?,?,?,?,?,?,?,?)";
        try {
            conexion = new ConexionSQL().conexion();
            consulta = conexion.prepareStatement(sql);
            consulta.setString(1, usuario.getNombre());
            String password = PasswordHasher.hashearPassword(usuario.getPassword());
            consulta.setString(2, password);
            consulta.setString(3, usuario.getCorreo());
            consulta.setString(4, usuario.getWhatsapp());
            consulta.setInt(5, usuario.getIdGrupo());
            consulta.setInt(6, usuario.getIdRango());
            consulta.setInt(7, usuario.getCredito());
            consulta.setBoolean(8, usuario.isEstado());
            consulta.setTimestamp(9, usuario.getFecha());
            if (consulta.executeUpdate() >= 0) {
                return true;
            }
        } catch (SQLException e) {
            System.out.println("ERROR: " + e.getMessage());
        } finally {
            cerrar(conexion);
            cerrar(consulta);
        }
        return false;
    }

    public static boolean editar(Usuario usuario) {
        Connection conexion = null;
        PreparedStatement consulta = null;
        String sql = "UPDATE us_usuario SET nombre=?, password=?, correo=?, whatsapp=?, \"idGrupo\"=?, \"idRango\"=?, credito=?, estado=?, fecha=? WHERE \"idUsuario\"=?";
        try {
            conexion = new ConexionSQL().conexion();
            consulta = conexion.prepareStatement(sql);
            consulta.setString(1, usuario.getNombre());
            String password = PasswordHasher.hashearPassword(usuario.getPassword());
            consulta.setString(2, password);
            consulta.setString(3, usuario.getCorreo());
            consulta.setString(4, usuario.getWhatsapp());
            consulta.setInt(5, usuario.getIdGrupo());
            consulta.setInt(6, usuario.getIdRango());
            consulta.setInt(7, usuario.getCredito());
            consulta.setBoolean(8, usuario.isEstado());
            consulta.setTimestamp(9, usuario.getFecha());
            consulta.setInt(10, usuario.getIdUsuario());
            if (consulta.executeUpdate() >= 0) {
                return true;
            }
        } catch (SQLException e) {
            System.out.println("ERROR: " + e.getMessage());
        } finally {
            cerrar(conexion);
            cerrar(consulta);
        }
        return false;
    }
    
    public static boolean eliminar(int idUsuario){
        Connection conexion = null;
        PreparedStatement consulta = null;
        String sql = "UPDATE us_usuario set estado=null WHERE \"idUsuario\"=?";
        try {
            conexion = new ConexionSQL().conexion();
            consulta = conexion.prepareStatement(sql);
            consulta.setInt(1, idUsuario);
            if (consulta.executeUpdate() >= 0) {
                return true;
            }
        } catch (SQLException e) {
            cerrar(conexion);
            cerrar(consulta);
        }
        return false;
    }
    
    public static ArrayList<Usuario> listaUsuarios() {
        Connection conexion = null;
        PreparedStatement consulta = null;
        ResultSet resultado = null;
        String sql = "SELECT * FROM us_usuario us INNER JOIN opc_rango ran ON us.\"idRango\" = ran.\"idRango\" WHERE us.\"idGrupo\" = ? AND us.estado IS NOT NULL ORDER BY \"nombre\" ASC;";
        ArrayList<Usuario> listaUsuarios = new ArrayList<>();
        try {
            conexion = new ConexionSQL().conexion();
            consulta = conexion.prepareStatement(sql);
            consulta.setInt(1, SystemConfig.ID_GRUPO);
            resultado = consulta.executeQuery();
            while (resultado.next()) {
                int idUsuario = resultado.getInt("idUsuario");
                String nombre = resultado.getString("nombre");
                String password = resultado.getString("password");
                String correo = resultado.getString("correo");
                String whatsapp = resultado.getString("whatsapp");
                int idGrupo = resultado.getInt("idGrupo");
                int idRango = resultado.getInt("idRango");
                int credito = resultado.getInt("credito");
                boolean estado = resultado.getBoolean("estado");
                Timestamp fecha = resultado.getTimestamp("fecha");
                String nombreRango = resultado.getString("nombreRango");
                Usuario us = new Usuario(nombre, password, correo, whatsapp, idRango, idGrupo, credito, estado, fecha);
                us.setIdUsuario(idUsuario);
                us.setNombreRango(nombreRango);
                listaUsuarios.add(us);
            }
        } catch (SQLException e) {
            System.out.println("ERROR: " + e.getMessage());
        } finally {
            cerrar(conexion);
            cerrar(consulta);
            cerrar(resultado);
        }
        return listaUsuarios;
    }

    public static DefaultTableModel consultar1(JTable tabla) {
        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
        modelo.setRowCount(0);
        Object datos[] = new Object[8];
        try {
            int idc = 0;
            for (Usuario us : listaUsuarios()) {
                idc++;
                datos[0] = idc;
                datos[1]  = us.getNombre();
                datos[2]  = us.getCorreo();
                datos[3] = us.getWhatsapp();
                datos[4]  = us.getNombreRango();
                datos[5]  = us.getCredito();
                datos[6]  = us.isEstado();
                datos[7]  = us.getFecha();
                modelo.addRow(datos);
            }
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }
        return modelo;
    }

    public static DefaultTableModel consultar(JTable tabla) {
        Connection conexion = null;
        PreparedStatement consulta = null;
        ResultSet resultado = null;
        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
        modelo.setRowCount(0);
        String sql = "SELECT * FROM us_usuario us INNER JOIN opc_rango ran ON us.\"idRango\" = ran.\"idRango\" WHERE us.\"idGrupo\" = ?";
        try {
            conexion = new ConexionSQL().conexion();
            consulta = conexion.prepareStatement(sql);
            consulta.setInt(1, SystemConfig.ID_GRUPO);
            resultado = consulta.executeQuery();
            int d = 0;
            Object datos[] = new Object[8];
            while (resultado.next()) {
                d++;
                datos[0] = d;
                datos[1] = resultado.getString("nombre");
                datos[2] = resultado.getString("correo");
                datos[3] = resultado.getString("whatsapp");
                datos[4] = resultado.getString("nombreRango");
                datos[5] = resultado.getInt("credito");
                datos[6] = resultado.getString("estado");
                datos[7] = resultado.getTimestamp("fecha");
                modelo.addRow(datos);
            }
        } catch (SQLException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
        return modelo;
    }

    public static void main(String[] args) {
        ArrayList<Usuario> listaUsuarios = DaoUsuario.listaUsuarios();

        for (Usuario us : listaUsuarios) {
            System.out.println(us.getCorreo());
        }
    }

}
