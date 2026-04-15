package com.stevanjaramillo.pruebas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class esBisiestoTest {

    @Test
    void divisiblePor400(){
        assertTrue(EsBisiesto.esBisiesto(2000));
        assertTrue(EsBisiesto.esBisiesto(1600));
    }

    @Test
    void divisiblePor100PeroNoPor400(){
        assertFalse(EsBisiesto.esBisiesto(1900));
        assertFalse(EsBisiesto.esBisiesto(1800));
        assertFalse(EsBisiesto.esBisiesto(2100));
    }

    @Test
    void divisiblePor4PeroNoPor100(){
        assertTrue(EsBisiesto.esBisiesto(2024));
        assertTrue(EsBisiesto.esBisiesto(2028));
        assertTrue(EsBisiesto.esBisiesto(1996));
    }
    @Test
    void noEsdivisiblePor4(){
        assertFalse(EsBisiesto.esBisiesto(2023));
        assertFalse(EsBisiesto.esBisiesto(2025));
        assertFalse(EsBisiesto.esBisiesto(2001));
    }



}