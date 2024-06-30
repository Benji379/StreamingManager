package com.sm.controladores;

import com.sm.componet.FileChooserCustom;
import com.sm.frm.mdlEnvioCorreo;
import com.sm.utils.Action;
import com.sm.utils.CorreoUtils;
import com.sm.utils.Data;
import com.sm.utils.UIController;
import java.awt.Font;

public class CCorreo {

    mdlEnvioCorreo c;

    public CCorreo(mdlEnvioCorreo c) {
        this.c = c;
    }

    public void init() {
        UIController.transparentarTextField(c.txtAsunto, c.txtDestinatario);
        UIController.textAreaInivisible(c.txtContenido, c.jScrollPane1);
    }

    public void btnEnviarCorreo() {
        Font fn = c.btnEnviar.getFont();
        Action.cargar(() -> {
            if (enviarCorreo()) {
                UIController.ventanaEmergente("Correo enviado exitosamente", "Gmail", "/com/sm/img/gmail.png");
            } else {
                UIController.ventanaEmergente("Error de envio, verificar el token del correo o la direccion valida", "Gmail", "/com/sm/img/gmail.png");
            }
            limpiar();
            c.btnEnviar.setText("Enviar");
            c.btnEnviar.setFont(new Font(fn.getName(), 0, fn.getSize()));
        }, () -> {
            c.btnEnviar.setText("Enviando...");
            c.btnEnviar.setFont(new Font(fn.getName(), 1, fn.getSize()));
        });
    }

    private boolean enviarCorreo() {
        String correo = Data.leerDato("correo", "direccion");
        String password_token = Data.leerDato("correo", "token");
        String correoDestino = c.txtDestinatario.getText();
        String asunto = c.txtAsunto.getText();
        String texto = c.txtContenido.getText();
        boolean enviar = CorreoUtils.enviarCorreo(correo, password_token, correoDestino, asunto, texto, direccionArchivo);
        return enviar;
    }
    String direccionArchivo = "";

    public void btnCargarArchivo() {
        direccionArchivo = FileChooserCustom.FileChosserArchivo("", null, "Archivos");
    }
    
    private void limpiar(){
        direccionArchivo = "";
        c.txtAsunto.setText("");
        c.txtContenido.setText("");
        c.txtDestinatario.setText("");
    }
    
}
