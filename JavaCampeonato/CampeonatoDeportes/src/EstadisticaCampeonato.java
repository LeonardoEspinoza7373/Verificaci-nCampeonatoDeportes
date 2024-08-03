import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class EstadisticaCampeonato {
    private List<EstadisticaEquipo> tablaPosiciones;

    public EstadisticaCampeonato() {
        this.tablaPosiciones = new ArrayList<>();
    }

    public void actualizarTablaPosiciones(Equipo equipo) {
        tablaPosiciones.add(equipo.getEstadisticas());
        tablaPosiciones.sort(Comparator.comparingInt(EstadisticaEquipo::getPuntos).reversed());
    }

    public void mostrarTablaPosiciones() {
        int posicion = 1;
        for (EstadisticaEquipo estadistica : tablaPosiciones) {
            System.out.println(posicion + ". Equipo: " + estadistica.getNombreEquipo() + " - Puntos: " + estadistica.getPuntos());
            posicion++;
        }
    }
}
