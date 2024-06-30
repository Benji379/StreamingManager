package com.sm.dao;

import com.sm.modelo.Grupo;
import com.sm.modelo.Rango;
import com.sm.utils.Action;
import com.sm.utils.PasswordHasher;
import java.sql.Timestamp;
import java.util.Date;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DaoUtils {

    public static Timestamp obtenerFechaActual() {
        // Obtiene la fecha y hora actual del sistema
        Date fechaActual = new Date();
        // Crea un objeto Timestamp utilizando la fecha actual
        Timestamp timestamp = new Timestamp(fechaActual.getTime());
        return timestamp;
    }

    public static void cerrar(Connection conexion) {
        if (conexion != null) {
            try {
                conexion.close();
                System.out.println("Conexion cerrada");
            } catch (SQLException e) {
                System.out.println("ERROR: " + e.getMessage());
            }
        }
    }

    public static void cerrar(ResultSet resultado) {
        if (resultado != null) {
            try {
                resultado.close();
            } catch (SQLException e) {
                System.out.println("ERROR: " + e.getMessage());
            }
        }
    }

    public static void cerrar(PreparedStatement consulta) {
        if (consulta != null) {
            try {
                consulta.close();
            } catch (SQLException e) {
                System.out.println("ERROR: " + e.getMessage());
            }
        }
    }

    /***
     * 
     * @param nombreTabla nombre de la tabla dentro de la BD
     * @param nombreColumnaId nombre de la columna del ID del dato
     * @param id id especificado
     * @param nombreColumnaRetornar nombre de la columna del dato que voy a retornar
     * @return me retorna un unico dato teniendo en cuenta el la fila en donde esta el id y la columna especificada
     */
    public static Object getConsultarDatoConID(String nombreTabla, String nombreColumnaId, int id, String nombreColumnaRetornar) {
        Connection conexion = null;
        PreparedStatement consulta = null;
        ResultSet resultado = null;
        String sql = "SELECT * FROM " + nombreTabla + " WHERE " + nombreColumnaId + "=" + id;
        try {
            conexion = new ConexionSQL().conexion();
            consulta = conexion.prepareStatement(sql);
            resultado = consulta.executeQuery();

            if (resultado.next()) {
                return resultado.getObject(nombreColumnaRetornar);
            }
        } catch (SQLException e) {
            System.out.println("ERROR: " + e.getMessage());
        } finally {
            cerrar(conexion);
            cerrar(consulta);
            cerrar(resultado);
        }
        return null;
    }

    private static void registrarAdministrador(String nombre, String password, Timestamp fecha) {
        Connection conexion = null;
        PreparedStatement consulta = null;
        String sql = "INSERT INTO us_administrador (nombre,password,fecha) VALUES (?,?,?)";
        try {
            conexion = new ConexionSQL().conexion();
            consulta = conexion.prepareStatement(sql);
            consulta.setString(1, nombre);
            String hashPassword = PasswordHasher.hashearPassword(password);
            consulta.setString(2, hashPassword);
            consulta.setTimestamp(3, fecha);
            consulta.executeUpdate();
            System.out.println("EXITOSO");
        } catch (SQLException e) {
            System.out.println("ERROR: " + e.getMessage());
        } finally {
            cerrar(conexion);
            cerrar(consulta);
        }
    }

    private static void registrarGrupo(Grupo grupo) {
        Connection conexion = null;
        PreparedStatement consulta = null;
        String sql = "INSERT INTO us_grupo (nombregrupo, tokengrupo, fecha, \"idAdministrador\", estado) VALUES (?, ?, ?, ?, ?)";
        try {
            conexion = new ConexionSQL().conexion();
            consulta = conexion.prepareStatement(sql);
            consulta.setString(1, grupo.getNombre());
            String hashToken = PasswordHasher.hashearPassword(grupo.getTokenGrupo());
            consulta.setString(2, hashToken);
            consulta.setTimestamp(3, grupo.getFecha());
            consulta.setInt(4, grupo.getIdAdministrador());
            consulta.setBoolean(5, grupo.isEstado());
            consulta.executeUpdate();
            System.out.println("EXITOSO");
        } catch (SQLException e) {
            System.out.println("ERROR: " + e.getMessage());
        } finally {
            cerrar(conexion);
            cerrar(consulta);
        }
    }

    private static void registrarRango(Rango rango) {
        Connection conexion = null;
        PreparedStatement consulta = null;
        String sql = "INSERT INTO opc_rango (nombreRango, fecha, estado) VALUES (?,?,?)";
        try {
            conexion = new ConexionSQL().conexion();
            consulta = conexion.prepareStatement(sql);
            consulta.setString(1, rango.getNombre());
            consulta.setTimestamp(2, rango.getFecha());
            consulta.setBoolean(3, rango.isEstado());
            consulta.executeUpdate();
        } catch (SQLException e) {
            System.out.println("ERROR: " + e.getMessage());
        } finally {
            cerrar(conexion);
            cerrar(consulta);
        }
    }
    
    
    /***
     * 
     * @param tabla nombre de la tabla
     * @param nombreColumna nombre de la columna en la BD
     * @return me retorna la lista de datos dentro de la columna especificada de la tabla especificada
     */
    public static ArrayList<Object> getConsultarDatos(String tabla, String nombreColumna) {
        Connection conexion = null;
        PreparedStatement consulta = null;
        ResultSet resultado = null;
        String sql = "SELECT * FROM " + tabla;
        ArrayList<Object> listaDatos = new ArrayList<>();
        try {
            conexion = new ConexionSQL().conexion();
            consulta = conexion.prepareStatement(sql);
            resultado = consulta.executeQuery();
            while (resultado.next()) {
                listaDatos.add(resultado.getObject(nombreColumna));
            }
        } catch (SQLException e) {
            System.out.println("ERROR: " + e.getMessage());
        } finally {
            cerrar(conexion);
            cerrar(consulta);
            cerrar(resultado);
        }
        return listaDatos;
    }

    public static void main(String[] args) {
        String generarToken = Action.generarTokenRandom(20);
        ArrayList<Object> lis = getConsultarDatos("us_administrador", "idAdministrador");
        for(Object d : lis){
            System.out.println(d);
        }
        
    }

}
