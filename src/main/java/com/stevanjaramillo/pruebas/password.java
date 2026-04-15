package com.stevanjaramillo.pruebas;

public class password {
    public static int evaluarPassword(String password){
        if (password==null || password.isEmpty()){
            return 0;
        }

        int puntos = 0;

        // +1 longitud
        if (password.length() >= 8) puntos++;

        // +1 mayúsculas
        if (password.matches(".*[A-Z].*")) puntos++;

        // +1 minúsculas
        if (password.matches(".*[a-z].*")) puntos++;

        // +1 números
        if (password.matches(".*\\d.*")) puntos++;

        // +1 símbolos
        if (password.matches(".*[!@#$%^&*()_+=\\-\\[\\]{};':\"\\\\|,.<>/?].*")) puntos++;

        return puntos;
    }
}
