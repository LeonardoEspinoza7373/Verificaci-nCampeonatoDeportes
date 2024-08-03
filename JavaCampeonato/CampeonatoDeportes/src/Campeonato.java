import java.util.ArrayList;
import java.util.List;

public class Campeonato {
    private String nombre;
    private String tipo;
    private List<Equipo> equipos;
    private List<Partido> partidos;
    private EstadisticaCampeonato estadisticas;
    private Calendario calendario;

    public Campeonato(String nombre, String tipo, Calendario calendario) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.calendario = calendario;
        this.equipos = new ArrayList<>();
        this.partidos = new ArrayList<>();
        this.estadisticas = new EstadisticaCampeonato();
    }

    public void agregarEquipo(Equipo equipo) {
        equipos.add(equipo);
    }

    public void eliminarEquipo(Equipo equipo) {
        equipos.remove(equipo);
    }

    public void agregarPartido(Partido partido) {
        partidos.add(partido);
    }

    public void eliminarPartido(Partido partido) {
        partidos.remove(partido);
    }

    public void calcularEstadisticas() {
        for (Partido partido : partidos) {
            partido.calcularEstadisticas();
            estadisticas.actualizarTablaPosiciones(partido.getEquipoLocal());
            estadisticas.actualizarTablaPosiciones(partido.getEquipoVisitante());
        }
    }

    public void mostrarTablaPosiciones() {
        estadisticas.mostrarTablaPosiciones();
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public List<Equipo> getEquipos() {
        return equipos;
    }

    public void setEquipos(List<Equipo> equipos) {
        this.equipos = equipos;
    }

    public List<Partido> getPartidos() {
        return partidos;
    }

    public void setPartidos(List<Partido> partidos) {
        this.partidos = partidos;
    }

    public EstadisticaCampeonato getEstadisticas() {
        return estadisticas;
    }

    public void setEstadisticas(EstadisticaCampeonato estadisticas) {
        this.estadisticas = estadisticas;
    }

    public Calendario getCalendario() {
        return calendario;
    }

    public void setCalendario(Calendario calendario) {
        this.calendario = calendario;
    }

    @Override
    public String toString() {
        return "Campeonato: " + nombre + " | Tipo: " + tipo + " | " + calendario.toString();
    }
}
