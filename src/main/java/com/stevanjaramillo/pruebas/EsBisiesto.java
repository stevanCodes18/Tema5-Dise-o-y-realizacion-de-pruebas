package com.stevanjaramillo.pruebas;

public class EsBisiesto {
    public static boolean esBisiesto(int anyo){
        if(anyo % 400 == 0) return true;
        if(anyo % 100 == 0) return false;
        return anyo % 4 ==0;
    }
}
