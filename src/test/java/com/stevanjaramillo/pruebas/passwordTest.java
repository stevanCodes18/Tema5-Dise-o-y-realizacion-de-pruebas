package com.stevanjaramillo.pruebas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class passwordTest {
    @Test
    void testPasswordNula() {
        assertEquals(0, password.evaluarPassword(null));
    }

    @Test
    void testPasswordVacia() {
        assertEquals(0, password.evaluarPassword(""));
    }

    @Test
    void testDebil() {
        assertEquals(1, password.evaluarPassword("abc"));
        assertEquals(1, password.evaluarPassword("1234567"));
        assertEquals(1, password.evaluarPassword("!@#$"));
    }

    @Test
    void testMedia() {
        assertEquals(4, password.evaluarPassword("Abc123!"));
        assertEquals(4, password.evaluarPassword("Password123"));
    }

    @Test
    void testFuerte() {
        assertEquals(5, password.evaluarPassword("Abc123!Xy"));
        assertEquals(5, password.evaluarPassword("SecurePass123$"));
    }

    @Test
    void testSoloLongitud() {
        assertEquals(2, password.evaluarPassword("abcdefgh"));      // longitud + minúsculas
    }

    @Test
    void testSinSimbolos() {
        assertEquals(4, password.evaluarPassword("Password1234"));  // longitud + may + min + num
    }

}