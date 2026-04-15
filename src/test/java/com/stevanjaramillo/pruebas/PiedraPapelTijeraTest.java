package com.stevanjaramillo.pruebas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PiedraPapelTijeraTest {
    @Test
    void jugadaInvalida(){
        assertThrows(IllegalArgumentException.class, () -> PiedraPapelTijera.jugar("PIEDRA", "ROCK"));
        assertThrows(IllegalArgumentException.class, () -> PiedraPapelTijera.jugar("PAPEL", null));
        assertThrows(IllegalArgumentException.class, () -> PiedraPapelTijera.jugar("", "TIJERA"));
    }

    @Test
    void empate(){
        assertEquals("EMPATE",PiedraPapelTijera.jugar("PIEDRA", "PIEDRA"));
        assertEquals("EMPATE",PiedraPapelTijera.jugar("PAPEL", "PAPEL"));
        assertEquals("EMPATE",PiedraPapelTijera.jugar("TIJERA", "TIJERA"));
    }

    @Test
    void ganaJugador1(){
        assertEquals("GANA JUGADOR 1",PiedraPapelTijera.jugar("PIEDRA", "TIJERA"));
        assertEquals("GANA JUGADOR 1",PiedraPapelTijera.jugar("TIJERA", "PAPEL"));
        assertEquals("GANA JUGADOR 1",PiedraPapelTijera.jugar("PAPEL", "PIEDRA"));
    }
    @Test
    void ganaJugador2(){
        assertEquals("GANA JUGADOR 2",PiedraPapelTijera.jugar("TIJERA", "PIEDRA"));
        assertEquals("GANA JUGADOR 2",PiedraPapelTijera.jugar("PAPEL", "TIJERA"));
        assertEquals("GANA JUGADOR 2",PiedraPapelTijera.jugar("PIEDRA", "PAPEL"));
    }
}
