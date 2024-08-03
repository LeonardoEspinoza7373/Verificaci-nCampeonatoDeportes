import java.util.Date;

public class Partido {
    private Date fecha;
    private Equipo equipoLocal;
    private Equipo equipoVisitante;
    private String resultado;
    private String nombreCampeonato;

    public Partido(Date fecha, Equipo equipoLocal, Equipo equipoVisitante, String nombreCampeonato) {
        this.fecha = fecha;
        this.equipoLocal = equipoLocal;
        this.equipoVisitante = equipoVisitante;
        this.nombreCampeonato = nombreCampeonato;
        this.resultado = "";
    }

    public void actualizarResultado(int golesLocal, int golesVisitante) {
        this.resultado = golesLocal + " - " + golesVisitante;
        boolean ganadoLocal = golesLocal > golesVisitante;
        boolean perdidoLocal = golesLocal < golesVisitante;
        equipoLocal.actualizarEstadisticas(golesLocal, golesVisitante, 0, ganadoLocal, perdidoLocal);
        equipoVisitante.actualizarEstadisticas(golesVisitante, golesLocal, 0, !ganadoLocal && !perdidoLocal, ganadoLocal);
    }

    public void calcularEstadisticas() {
        String[] resultadoPartido = resultado.split(" - ");
        int golesLocal = Integer.parseInt(resultadoPartido[0]);
        int golesVisitante = Integer.parseInt(resultadoPartido[1]);
        equipoLocal.actualizarEstadisticas(golesLocal, golesVisitante, 0, golesLocal > golesVisitante, golesLocal < golesVisitante);
        equipoVisitante.actualizarEstadisticas(golesVisitante, golesLocal, 0, golesVisitante > golesLocal, golesVisitante < golesLocal);
    }

    // Getters y Setters
    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Equipo getEquipoLocal() {
        return equipoLocal;
    }

    public void setEquipoLocal(Equipo equipoLocal) {
        this.equipoLocal = equipoLocal;
    }

    public Equipo getEquipoVisitante() {
        return equipoVisitante;
    }

    public void setEquipoVisitante(Equipo equipoVisitante) {
        this.equipoVisitante = equipoVisitante;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public String getNombreCampeonato() {
        return nombreCampeonato;
    }

    public void setNombreCampeonato(String nombreCampeonato) {
        this.nombreCampeonato = nombreCampeonato;
    }

    @Override
    public String toString() {
        return "Partido: " + fecha + " | " + equipoLocal.getNombreEquipo() + " vs " + equipoVisitante.getNombreEquipo() + " | Resultado: " + resultado;
    }
}
