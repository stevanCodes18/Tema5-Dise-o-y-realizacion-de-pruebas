package com.stevanjaramillo.pruebas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClasificarEdadTest {

    @Test
    void TestEdadNegativa(){
        assertThrows(IllegalArgumentException.class, () -> ClasificarEdad.clasificarEdad(-1));
    }
    @Test
    void testInfanciaLimite(){
        assertEquals("Infancia", ClasificarEdad.clasificarEdad(0));
    }
    @Test
    void testinfancia(){
        assertEquals("Infancia", ClasificarEdad.clasificarEdad(5));
    }

    @Test
    void testniñezLimite(){
        assertEquals("Niñez", ClasificarEdad.clasificarEdad(6));
    }

    @Test
    void Niñez(){
        assertEquals("Niñez", ClasificarEdad.clasificarEdad(11));
    }
    @Test
    void AdolescenciaLimite(){
        assertEquals("Adolescencia", ClasificarEdad.clasificarEdad(12));
    }

    @Test
    void juventudLimite(){
        assertEquals("Juventud", ClasificarEdad.clasificarEdad(18));
    }

    @Test
    void adultezLimite(){
        assertEquals("Adultez", ClasificarEdad.clasificarEdad(25));
    }

    @Test
    void vejez(){
        assertEquals("Vejez", ClasificarEdad.clasificarEdad(60));
    }

}