package com.stevanjaramillo.pruebas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContarPositivosTest {
   @Test
    void Arrayvacio(){
       assertEquals(0,ContarPositivos.contarPositivos(new int[]{}));
   }
   @Test
    void ArrayConTodosNegativos(){
       int[] entrada={-5,0,-1};
       assertEquals(0,ContarPositivos.contarPositivos(entrada));
   }

   @Test
    void arrayCOnMezcla(){
    int[] entrada={-2,3,0,7,-1};
            assertEquals(2,ContarPositivos.contarPositivos(entrada));
   }
}