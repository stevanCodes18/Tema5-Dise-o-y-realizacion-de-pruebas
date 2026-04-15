package com.stevanjaramillo.pruebas;

public class PiedraPapelTijera {
    public  static String jugar(String jugador1,String jugador2){
        String[] validas={"PIEDRA","PAPEL","TIJERA"};
        if (!esValida(jugador1) || !esValida(jugador2)){
            throw  new IllegalArgumentException("La jugada no es valida");
        }
        if (jugador1.equals(jugador2))return "EMPATE";

        if ((jugador1.equals("PIEDRA") && jugador2.equals("TIJERA")) ||
                (jugador1.equals("TIJERA") && jugador2.equals("PAPEL")) ||
                (jugador1.equals("PAPEL") && jugador2.equals("PIEDRA"))) {
            return "GANA JUGADOR 1";
        }
        return "GANA JUGADOR 2";
    }

    private static boolean esValida(String jugada) {
        return jugada.equals("PIEDRA") || jugada.equals("PAPEL") || jugada.equals("TIJERA");
    }
}

