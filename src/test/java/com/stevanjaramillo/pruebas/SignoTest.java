package com.stevanjaramillo.pruebas;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SignoTest {


    @BeforeAll
    static void init() {
        System.out.println("Inicializando SignoTest");
    }

    @DisplayName("debe retornar 1 cuando el numero es positivo")
    @Test
    void signoPositivo(){
        assertEquals(1,Signo.signo(5));
    }

    @DisplayName("debe retornar -1 cuando el numero es negativo")
    @Test
    void signoNegativo(){
      assertEquals(-1,Signo.signo(-3));
    }

    @DisplayName("debe retornar o cuando ek numero es 0")
    @Test
    void signoCero(){
        assertEquals(0,Signo.signo(0));
    }

    @AfterAll
    static void end() {
        System.out.println("Finalizando SignoTest");
    }

}