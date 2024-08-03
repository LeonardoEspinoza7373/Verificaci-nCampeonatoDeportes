import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Crear equipos
        Equipo equipo1 = new Equipo("Equipo A");
        Equipo equipo2 = new Equipo("Equipo B");

        // Crear jugadores
        Jugador jugador1 = new Jugador("Jugador 1", "Delantero");
        Jugador jugador2 = new Jugador("Jugador 2", "Defensa");

        // Crear campeonato 1
        Calendario calendario1 = new Calendario(new Date(), new Date());
        Campeonato campeonato1 = new Campeonato("Liga Ejemplo 1", TipoCampeonato.LIGA, calendario1);
        campeonato1.agregarEquipo(equipo1);
        campeonato1.agregarEquipo(equipo2);

        // Agregar jugadores a los equipos en campeonato 1
        equipo1.agregarJugador(jugador1, campeonato1.getNombre());
        equipo2.agregarJugador(jugador2, campeonato1.getNombre());

        // Crear partido en campeonato 1
        Partido partido1 = new Partido(new Date(), equipo1, equipo2, campeonato1.getNombre());
        campeonato1.agregarPartido(partido1);

        // Actualizar resultado del partido 1 (empate)
        partido1.actualizarResultado(2, 2);

        // Calcular estadísticas del campeonato 1
        campeonato1.calcularEstadisticas();
        System.out.println("Detalles del Campeonato 1:");
        System.out.println(campeonato1.toString());
        System.out.println("Equipos:");
        for (Equipo e : campeonato1.getEquipos()) {
            System.out.println(e.toString());
        }
        System.out.println("Partidos:");
        for (Partido p : campeonato1.getPartidos()) {
            System.out.println(p.toString());
        }
        campeonato1.mostrarTablaPosiciones();

        // Crear campeonato 2
        Calendario calendario2 = new Calendario(new Date(), new Date());
        Campeonato campeonato2 = new Campeonato("Liga Ejemplo 2", TipoCampeonato.LIGA, calendario2);
        campeonato2.agregarEquipo(equipo1);
        campeonato2.agregarEquipo(equipo2);

        // Crear jugadores adicionales para campeonato 2
        Jugador jugador3 = new Jugador("Jugador 3", "Mediocampista");
        Jugador jugador4 = new Jugador("Jugador 4", "Portero");

        // Agregar jugadores a los equipos en campeonato 2
        equipo1.agregarJugador(jugador3, campeonato2.getNombre());
        equipo2.agregarJugador(jugador4, campeonato2.getNombre());

        // Crear partido en campeonato 2
        Partido partido2 = new Partido(new Date(), equipo1, equipo2, campeonato2.getNombre());
        campeonato2.agregarPartido(partido2);

        // Actualizar resultado del partido 2
        partido2.actualizarResultado(1, 3);

        // Calcular estadísticas del campeonato 2
        campeonato2.calcularEstadisticas();
        System.out.println("\nDetalles del Campeonato 2:");
        System.out.println(campeonato2.toString());
        System.out.println("Equipos:");
        for (Equipo e : campeonato2.getEquipos()) {
            System.out.println(e.toString());
        }
        System.out.println("Partidos:");
        for (Partido p : campeonato2.getPartidos()) {
            System.out.println(p.toString());
        }
        campeonato2.mostrarTablaPosiciones();
    }
}
