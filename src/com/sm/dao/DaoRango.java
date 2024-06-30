package com.sm.dao;

import com.mysql.cj.jdbc.ConnectionImpl;
import com.sm.modelo.Rango;
import com.sm.utils.Action;
import java.sql.*;
import java.util.ArrayList;

public class DaoRango {

    public static ArrayList<Rango> listaRangos() {
        Connection conexion = null;
        PreparedStatement consulta = null;
        ResultSet resultado = null;
        ArrayList<Rango> listaRangos = new ArrayList<>();
        String sql = "SELECT * FROM opc_rango";
        try {
            conexion = new ConexionSQL().conexion();
            consulta = conexion.prepareStatement(sql);
            resultado = consulta.executeQuery();
            while (resultado.next()) {
                int idRango = resultado.getInt("idRango");
                String nombreRango = resultado.getString("nombreRango");
                Timestamp fecha = resultado.getTimestamp("fecha");
                boolean estado = resultado.getBoolean("estado");
                listaRangos.add(new Rango(idRango, nombreRango, fecha, estado));
            }
        } catch (SQLException e) {
            System.out.println("ERROR: " + e.getMessage());
        } catch (java.lang.NullPointerException e) {
            Action.mensajeError("Verifica tu conexion a internet");
        } finally {
            DaoUtils.cerrar(conexion);
            DaoUtils.cerrar(consulta);
            DaoUtils.cerrar(resultado);
        }
        return listaRangos;
    }

}
