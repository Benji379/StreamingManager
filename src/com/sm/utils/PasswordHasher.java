package com.sm.utils;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordHasher {

    public static String hashearPassword(String password) {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String hashedPassword = passwordEncoder.encode(password);

//        System.out.println("Contraseña en texto plano: " + password);
//        System.out.println("Contraseña hasheada: " + hashedPassword);
        return hashedPassword;
    }

    public static boolean deshashear(String passwordIngresado, String passwordHashed) {

        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        boolean isPasswordMatch = passwordEncoder.matches(passwordIngresado, passwordHashed);
//        System.out.println("¿La contraseña coincide?: " + isPasswordMatch);
        return isPasswordMatch;
    }

    public static void main(String[] args) {
        String pal = hashearPassword("BenjaminBen");
        String pal1 = hashearPassword("Benjamin");
        System.out.println(pal);
//        System.out.println(pal1);
//        if(deshashear("Benjamin", "$2a$10$8BUJV0OifbS8G1nf5eFrC.p2MXL/S.5pi0mRI9mmUjNUFtcltucgu")){
//            System.out.println("INGRESADO");
//        }else{
//            System.out.println("NO INGRESASTE");
//        }
        
        
//        
//        if(deshashear("Benjamin", "$2a$10$XEgkNJjqDUgj6VzGX5JBeud5saTdAQeqPaBRp742BUg1b16R9y1Ge")){
//            System.out.println("INGRESASTE");
//        }else{
//            System.out.println("ERROR NO INGRESASTE");
//        }
    }
}
