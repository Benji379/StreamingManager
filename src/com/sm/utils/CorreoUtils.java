package com.sm.utils;

import java.awt.HeadlessException;
import java.io.File;
import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

public class CorreoUtils {

    public static boolean enviarCorreo(String correoRemitente, String contraseñaRemitente, String correoDestinatario, String asunto, String texto, String archivoAdjunto) {
        // Configura las propiedades del correo
        Properties propiedades = new Properties();
        propiedades.put("mail.smtp.host", "smtp.gmail.com");
        propiedades.put("mail.smtp.ssl.trust", "smtp.gmail.com");
        propiedades.setProperty("mail.smtp.starttls.enable", "true");
        propiedades.setProperty("mail.smtp.port", "587");
        propiedades.setProperty("mail.smtp.user", correoRemitente);
        propiedades.setProperty("mail.smtp.ssl.protocols", "TLSv1.2");
        propiedades.setProperty("mail.smtp.auth", "true");

        Session session = Session.getDefaultInstance(propiedades);

        try {
            // Crea un mensaje de correo
            MimeMessage correo = new MimeMessage(session);
            correo.setFrom(new InternetAddress(correoRemitente));
            correo.setRecipient(Message.RecipientType.TO, new InternetAddress(correoDestinatario));
            correo.setSubject(asunto);

            // Contenido del correo
            MimeBodyPart contenido = new MimeBodyPart();
            contenido.setContent(texto, "text/html; charset=utf-8");
            
            // Crea una parte multipart para combinar el contenido y el archivo adjunto
            MimeMultipart elementosCorreo = new MimeMultipart();
            elementosCorreo.addBodyPart(contenido);

            // Agrega archivo adjunto si no es null
            if (archivoAdjunto != null && !archivoAdjunto.trim().isEmpty()) {
                MimeBodyPart adjunto = new MimeBodyPart();
                adjunto.setDataHandler(new DataHandler(new FileDataSource(archivoAdjunto)));
                adjunto.setFileName(new File(archivoAdjunto).getName());
                elementosCorreo.addBodyPart(adjunto);
            }

            // Agrega los elementos al mensaje de correo
            correo.setContent(elementosCorreo);

            // Conecta y envía el correo
            Transport transport = session.getTransport("smtp");
            transport.connect(correoRemitente, contraseñaRemitente);
            transport.sendMessage(correo, correo.getRecipients(Message.RecipientType.TO));
            transport.close();
            System.out.println("Correo enviado");
            return true;
        } catch (HeadlessException | MessagingException ex) {
            System.out.println("ERROR: " + ex.getMessage());
        }
        return false;
    }
}
