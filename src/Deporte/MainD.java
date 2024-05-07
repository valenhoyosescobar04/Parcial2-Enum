package Deporte;

import Deporte.Deportes;

public class MainD {

        public static void main(String[] args) {
            System.out.println("Información de los deportes:\n");

            // Mostrar información de cada deporte
            for (Deportes deporte : Deportes.values()) {
                System.out.println("Nombre: " + deporte.getNombre());
                System.out.println("Implementos: " + deporte.getImplementos());
                System.out.println("Lugar: " + deporte.getLugar());
                System.out.println("Jugadores: " + deporte.getJugadores());
                System.out.println("Realizando deporte:");
                deporte.realizarDeporte();
                System.out.println();
            }
        }
    }

