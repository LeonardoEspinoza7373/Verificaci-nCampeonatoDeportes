public class Jugador {
    private String nombre;
    private String posicion;
    private EstadisticaJugador estadisticas;

    public Jugador(String nombre, String posicion) {
        this.nombre = nombre;
        this.posicion = posicion;
        this.estadisticas = new EstadisticaJugador();
    }

    public void actualizarEstadisticas(int goles, int asistencias, int tarjetasAmarillas, int tarjetasRojas, int partidosJugados, float posesionDeBalon) {
        estadisticas.actualizarEstadisticas(goles, asistencias, tarjetasAmarillas, tarjetasRojas, partidosJugados, posesionDeBalon);
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public EstadisticaJugador getEstadisticas() {
        return estadisticas;
    }

    public void setEstadisticas(EstadisticaJugador estadisticas) {
        this.estadisticas = estadisticas;
    }

    @Override
    public String toString() {
        return "Jugador: " + nombre + " | Posición: " + posicion + " | Estadísticas: " + estadisticas.toString();
    }
}
