import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Equipo {
    private String nombreEquipo;
    private Map<String, List<Jugador>> jugadoresPorCampeonato;
    private EstadisticaEquipo estadisticas;

    public Equipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
        this.jugadoresPorCampeonato = new HashMap<>();
        this.estadisticas = new EstadisticaEquipo(nombreEquipo);
    }

    public void agregarJugador(Jugador jugador, String nombreCampeonato) {
        jugadoresPorCampeonato.putIfAbsent(nombreCampeonato, new ArrayList<>());
        jugadoresPorCampeonato.get(nombreCampeonato).add(jugador);
    }

    public void eliminarJugador(Jugador jugador, String nombreCampeonato) {
        if (jugadoresPorCampeonato.containsKey(nombreCampeonato)) {
            jugadoresPorCampeonato.get(nombreCampeonato).remove(jugador);
        }
    }

    public void actualizarEstadisticas(int golesAFavor, int golesEnContra, float posesionDeBalon, boolean ganado, boolean perdido) {
        estadisticas.actualizarEstadisticas(golesAFavor, golesEnContra, posesionDeBalon, ganado, perdido);
    }

    // Getters y Setters
    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public List<Jugador> getJugadores(String nombreCampeonato) {
        return jugadoresPorCampeonato.get(nombreCampeonato);
    }

    public void setJugadores(List<Jugador> jugadores, String nombreCampeonato) {
        jugadoresPorCampeonato.put(nombreCampeonato, jugadores);
    }

    public EstadisticaEquipo getEstadisticas() {
        return estadisticas;
    }

    public void setEstadisticas(EstadisticaEquipo estadisticas) {
        this.estadisticas = estadisticas;
    }

    @Override
    public String toString() {
        return "Equipo: " + nombreEquipo + " | Estadísticas: " + estadisticas.toString();
    }
}
