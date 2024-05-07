package Deporte;

public enum Deportes {
        FUTBOL("Fútbol", "Balón", "Campo", "11 jugadores por equipo") {
            @Override
            public void realizarDeporte() {
                System.out.println("Practicando fútbol...");
            }
        },
        BALONCESTO("Baloncesto", "Balón de baloncesto", "Cancha", "5 jugadores por equipo") {
            @Override
            public void realizarDeporte() {
                System.out.println("Jugando baloncesto...");
            }
        },
        TENIS("Tenis", "Raqueta", "Cancha de tenis", "1 o 2 jugadores por equipo") {
            @Override
            public void realizarDeporte() {
                System.out.println("Jugando tenis...");
            }
        },
        NATACION("Natación", "Traje de baño", "Piscina", "Individual") {
            @Override
            public void realizarDeporte() {
                System.out.println("Nadando...");
            }
        };

        private final String nombre;
        private final String implementos;
        private final String lugar;
        private final String jugadores;

        Deportes(String nombre, String implementos, String lugar, String jugadores) {
            this.nombre = nombre;
            this.implementos = implementos;
            this.lugar = lugar;
            this.jugadores = jugadores;
        }

        public static void mostrarInformacion() {
            System.out.println("Información de los deportes:\n");
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

        public abstract void realizarDeporte();

        public String getNombre() {
            return nombre;
        }

        public String getImplementos() {
            return implementos;
        }

        public String getLugar() {
            return lugar;
        }

        public String getJugadores() {
            return jugadores;
        }
    }



