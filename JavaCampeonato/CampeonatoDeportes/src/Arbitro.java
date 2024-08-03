import java.util.ArrayList;
import java.util.List;

public class Arbitro {
    private String nombre;
    private int experiencia;
    private List<Partido> partidosAsignados;

    public Arbitro(String nombre, int experiencia) {
        this.nombre = nombre;
        this.experiencia = experiencia;
        this.partidosAsignados = new ArrayList<>();
    }

    public void asignarPartido(Partido partido) {
        partidosAsignados.add(partido);
    }

    public void mostrarPartidosAsignados() {
        System.out.println("Partidos asignados a " + nombre + ":");
        for (Partido partido : partidosAsignados) {
            System.out.println("Fecha: " + partido.getFecha() + " | Local: " + partido.getEquipoLocal().getNombreEquipo() + " | Visitante: " + partido.getEquipoVisitante().getNombreEquipo());
        }
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public List<Partido> getPartidosAsignados() {
        return partidosAsignados;
    }

    public void setPartidosAsignados(List<Partido> partidosAsignados) {
        this.partidosAsignados = partidosAsignados;
    }
}
