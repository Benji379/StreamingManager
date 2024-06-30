package com.sm.utils;

import java.io.File;
import java.util.ArrayList;

public class NombresExcels {
    
    public static ArrayList<String> getExcelFileNames(String folderPath) {
        ArrayList<String> fileNames = new ArrayList<>();
        
        File folder = new File(folderPath);
        
        if (folder.exists() && folder.isDirectory()) {
            File[] files = folder.listFiles();
            
            for (File file : files) {
                if (file.isFile() && file.getName().toLowerCase().endsWith(".xlsx")) {
                    String fileName = file.getName().substring(0, file.getName().lastIndexOf('.'));
                    fileNames.add(fileName);
                }
            }
        } else {
            System.out.println("La carpeta no existe o no es una carpeta válida.");
        }
        
        return fileNames;
    }
}
