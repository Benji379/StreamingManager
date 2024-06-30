package com.sm.utils;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HitTabla {

    public static void convertirHitTabla(String text, JTable table) {
        String[] columnNames = {"#", "Data", "Type", "Config", "Wordlist", "RUT", "PASS", "Incluye", "Date"};
        DefaultTableModel model = new DefaultTableModel(columnNames, 0);

        String[] lines = text.split("\n");

        int rowCount = 0;
        for (String line : lines) {
            Matcher matcher = Pattern.compile("Data = (.*?)\\s*\\|\\s*Type = (.*?)\\s*\\|\\s*Config = (.*?)\\s*\\|\\s*Wordlist = (.*?)(?:\\s*\\|\\s*Proxy = )?\\s*\\|\\s*Date = (.*?)\\s*\\|\\s*CapturedData = RUTPASS = (.*?):(.*?)\\s*\\|\\s*Incluye = \\((.*?)\\)").matcher(line);
            if (matcher.find()) {
                rowCount++;
                String data = matcher.group(1).trim();
                String type = matcher.group(2).trim();
                String config = matcher.group(3).trim();
                String wordlist = matcher.group(4).trim();
                String rut = matcher.group(6).trim();
                String pass = matcher.group(7).trim();
                String incluye = matcher.group(8).trim();
                String date = matcher.group(5).trim();

                model.addRow(new String[]{String.valueOf(rowCount), data, type, config, wordlist, rut, pass, incluye, date});
            }
        }

        table.setModel(model);
    }

    public static DefaultTableModel convertirHitTabla(String text) {
        String[] columnNames = {"#", "Data", "Type", "Config", "Wordlist", "RUT", "PASS", "Incluye", "Date"};
        DefaultTableModel model = new DefaultTableModel(columnNames, 0);
        
        model.setRowCount(0);
        String[] lines = text.split("\n");

        int rowCount = 0;
        for (String line : lines) {
            Matcher matcher = Pattern.compile("Data = (.*?)\\s*\\|\\s*Type = (.*?)\\s*\\|\\s*Config = (.*?)\\s*\\|\\s*Wordlist = (.*?)(?:\\s*\\|\\s*Proxy = )?\\s*\\|\\s*Date = (.*?)\\s*\\|\\s*CapturedData = RUTPASS = (.*?):(.*?)\\s*\\|\\s*Incluye = \\((.*?)\\)").matcher(line);
            if (matcher.find()) {
                rowCount++;
                String data = matcher.group(1).trim();
                String type = matcher.group(2).trim();
                String config = matcher.group(3).trim();
                String wordlist = matcher.group(4).trim();
                String rut = matcher.group(6).trim();
                String pass = matcher.group(7).trim();
                String incluye = matcher.group(8).trim();
                String date = matcher.group(5).trim();

                model.addRow(new String[]{String.valueOf(rowCount), data, type, config, wordlist, rut, pass, incluye, date});
            }
        }

        return model;
    }
//
//    public static void main(String[] args) {
//        String text = "Data = ahead@astroramji.com:Sagar | Type = SUCCESS | Config = VTR GEN | Wordlist = MIX (7) | Proxy =  | Date = sábado, 20 de abril de 2024 | CapturedData = RUTPASS = 5048406-8:VTR5048 | Incluye = (Max, Prime Video, Universal+ Estándar, RiiviMega Go, Cindie, Edye, Atresplayer)\n"
//                + "Data = ahmad.mamdouh@ofacade.com:Facade | Type = SUCCESS | Config = VTR GEN | Wordlist = MIX (7) | Proxy =  | Date = sábado, 20 de abril de 2024 | CapturedData = RUTPASS = 4465328-1:VTR4465 | Incluye = (Max, Prime Video, Universal+ Estándar, RiiviMega Go, Cindie, Edye, Atresplayer)";
//
//        JTable table = new JTable();
//        convertTextToTable(text, table);
//    }
}
