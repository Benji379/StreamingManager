package com.sm.controladores;

import com.sm.dao.DaoRango;
import java.sql.Timestamp;
import com.sm.dao.DaoUsuario;
import com.sm.dao.DaoUtils;
import com.sm.frm.mdlUsuarios;
import com.sm.modelo.Rango;
import com.sm.modelo.SystemConfig;
import com.sm.modelo.Usuario;
import com.sm.utils.Action;
import com.sm.utils.FiltroTabla;
import com.sm.utils.UIController;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class CUsuarios {

    private final mdlUsuarios c;
    private Usuario usuarioMod;
    private int idUsuario;
    private String nombre;
    private String correo;
    private String whatsapp;
    private String password;
    private String selectRango;
    private String selectEstado;
    private String selectCredito;
    private Timestamp fecha;

    public CUsuarios(mdlUsuarios c) {
        this.c = c;
    }

    private DefaultTableModel modelo;
    private int filaSeleccionada = -1;
    private ArrayList<Usuario> listaUs;
    private ArrayList<Rango> listaRangos;

    public void init() {
        listaUs = new ArrayList<>();
        consultarDatos();
        limpiar();
        c.tabla.fixTable(c.scrollTabla);
        filtrar();
    }

    public void clickTabla() {
        filaSeleccionada = c.tabla.getSelectedRow();
        idUsuario = listaUs.get(filaSeleccionada).getIdUsuario();
        nombre = UIController.datoFilaColumna(modelo, filaSeleccionada, "nombre").toString();
        whatsapp = UIController.datoFilaColumna(modelo, filaSeleccionada, "whatsapp").toString();
        correo = UIController.datoFilaColumna(modelo, filaSeleccionada, "correo").toString();
        password = listaUs.get(filaSeleccionada).getPassword();
        selectCredito = UIController.datoFilaColumna(modelo, filaSeleccionada, "credito").toString();
        selectEstado = UIController.datoFilaColumna(modelo, filaSeleccionada, "estado").toString();
        selectRango = UIController.datoFilaColumna(modelo, filaSeleccionada, "rango").toString();
        System.out.println(idUsuario);
        c.txtNombre.setText(nombre);
        c.txtCorreo.setText(correo);
        c.txtWhatsApp.setText(whatsapp);
        c.txtPassword.setEnabled(false);
        c.txtCredito.setText(String.valueOf(selectCredito));
        c.comboEstado.setSelectedItem(selectEstado);
        c.comboRango.setSelectedItem(selectRango);
    }

    public void btnLimpiar() {
        limpiar();
    }

    public void consultarDatos() {
        consultaComboRango();
        listaUs = DaoUsuario.listaUsuarios();
        consultar();
    }

    private void limpiar() {
        filaSeleccionada = -1;
        c.txtCorreo.setText("");
        c.txtCredito.setText("");
        c.txtNombre.setText("");
        c.txtPassword.setText("");
        c.txtWhatsApp.setText("");
        c.comboEstado.setSelectedItem("");
        c.comboRango.setSelectedItem("");
        recogerDatos();
        c.txtPassword.setEnabled(true);
    }

    private void consultaComboRango() {
        listaRangos = new ArrayList<>();
        listaRangos = DaoRango.listaRangos();
        c.comboRango.removeAllItems();
        for (Rango ran : listaRangos) {
            boolean estadoRango = ran.isEstado();
            if (estadoRango) {
                c.comboRango.addItem(ran.getNombre());
            }
        }
    }

    private void consultar() {
        modelo = (DefaultTableModel) c.tabla.getModel();
        modelo.setRowCount(0);
        Object datos[] = new Object[8];
        try {
            int idc = 0;
            for (Usuario us : listaUs) {
                idc++;
                datos[0] = idc;
                datos[1] = us.getNombre();
                datos[2] = us.getCorreo();
                datos[3] = us.getWhatsapp();
                datos[4] = us.getNombreRango();
                datos[5] = us.getCredito();
                datos[6] = us.isEstado() ? "Disponible" : "Suspendido";
                datos[7] = us.getFecha();
                modelo.addRow(datos);
            }
            c.tabla.setModel(modelo);
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }

    private void recogerDatos() {
        try {
            nombre = c.txtNombre.getText();
            correo = c.txtCorreo.getText();
            whatsapp = c.txtWhatsApp.getText();
            password = c.txtPassword.getText();
            if (c.comboEstado.getSelectedItem() != null) {
                selectEstado = Action._Null(c.comboEstado.getSelectedItem());
            }else{
                selectEstado = "";
            }
            
            if (c.comboRango.getSelectedItem() != null) {
                selectRango = Action._Null(listaRangos.get(c.comboRango.getSelectedIndex()).getIdRango());
            }else{
                selectRango = "";
            }
            selectCredito = c.txtCredito.getText();
            fecha = DaoUtils.obtenerFechaActual();
        } catch (java.lang.IndexOutOfBoundsException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }
    
    public void registrar() {
        try {
            recogerDatos();
            if (Action.sinVacio(nombre, correo, whatsapp, password, selectEstado, selectRango, selectCredito)) {
                int idRango = Integer.parseInt(selectRango);
                int credito = Integer.parseInt(selectCredito);
                boolean estado = selectEstado.equalsIgnoreCase("Disponible");
                Usuario user = new Usuario(nombre, password, correo, whatsapp, idRango, SystemConfig.ID_GRUPO, credito, estado, fecha);
                user.setIdUsuario(idUsuario);
                Action.msjC(() -> {
                    Action.cargar(() -> {
                        boolean registro = DaoUsuario.registrar(user);
                        if (registro) {
                            limpiar();
                            consultarDatos();
                            Action.mensaje("Registro exitoso");
                        }
                    });
                }, "Confirmar accion");
            } else {
                Action.mensajeError("Completar todos los campos");
            }
        } catch (java.lang.IndexOutOfBoundsException e) {
            Action.mensajeError("Seleccionar items dentro del ComboBox");
        } catch (NullPointerException | NumberFormatException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }

    public void editar() {
        if (filaSeleccionada > -1) {
            try {
                recogerDatos();
                if (Action.sinVacio(nombre, correo, whatsapp, selectEstado, selectRango, selectCredito)) {
                    int idRango = Integer.parseInt(selectRango);
                    int credito = Integer.parseInt(selectCredito);
                    boolean estado = selectEstado.equalsIgnoreCase("activo");
                    Usuario user = new Usuario(nombre, password, correo, whatsapp, idRango, SystemConfig.ID_GRUPO, credito, estado, fecha);
                    user.setIdUsuario(idUsuario);
                    Action.msjC(() -> {
                        Action.cargar(() -> {
                            boolean editarDao = DaoUsuario.editar(user);
                            if (editarDao) {
                                limpiar();
                                consultarDatos();
                                Action.mensaje("Datos Actualizar");
                            }
                        });
                    }, "Confirmar accion");
                } else {
                    Action.mensajeError("Completar todos los campos");
                }
            } catch (java.lang.IndexOutOfBoundsException e) {
                Action.mensajeError("Seleccionar items dentro del ComboBox");
            } catch (NullPointerException | NumberFormatException e) {
                System.out.println("ERROR: " + e.getMessage());
            }
        } else {
            Action.mensajeError("Seleccione usuario");
        }
    }

    public void descargar() {
        Action.descargarExcel(c, "Lista Usuarios", modelo);
    }

    public void eliminar() {
        if (filaSeleccionada > -1) {
            Action.msjC(() -> {
                Action.cargar(() -> {
                    boolean eliminarDato = DaoUsuario.eliminar(idUsuario);
                    if (eliminarDato) {
                        limpiar();
                        consultarDatos();
                        Action.mensaje("Usuario Eliminado");
                    }
                });
            }, "Confirmar eliminacion");
        } else {
            Action.mensajeError("Completar todos los campos");
        }
    }

    public void filtrar() {
        recogerDatos();
        System.out.println(selectRango);
        String columnas[] = {"Nombre", "Correo", "WhatsApp", "Rango", "Credito", "Estado"};
        String datos[] = {nombre, correo, whatsapp, "", selectCredito, selectEstado};
        c.tabla.setModel(FiltroTabla.filterTable(modelo, datos, columnas));
    }

}
