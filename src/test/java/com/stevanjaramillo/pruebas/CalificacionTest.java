package com.stevanjaramillo.pruebas;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class CalificacionTest {
    @Test
    void notaInvalidaNegativa() {
        assertThrows(IllegalArgumentException.class, () -> Calificacion.calificacion(-1));
    }
    @Test
    void notaInvalidaMAyorDiez() {
        assertThrows(IllegalArgumentException.class, () -> Calificacion.calificacion(11));
    }

    @ParameterizedTest
    @ValueSource(ints={0,1,2,3,4})
    void Suspenso(int nota){
        assertEquals("SUSPENSO", Calificacion.calificacion(nota));
    }

    @Test
    void suficiente(){
        assertEquals("SUFICIENTE", Calificacion.calificacion(5));
    }

    @Test
    void bien(){
        assertEquals("BIEN", Calificacion.calificacion(6));
    }

    @ParameterizedTest
    @ValueSource(ints={7,8})
    void notable(int nota){
        assertEquals("NOTABLE", Calificacion.calificacion(nota));
    }

    @ParameterizedTest
    @ValueSource(ints={9,10})
    void sobresaliente(int nota){
        assertEquals("SOBRESALIENTE", Calificacion.calificacion(nota));
    }
}