public class EstadisticaJugador {
    private int goles;
    private int asistencias;
    private int tarjetasAmarillas;
    private int tarjetasRojas;
    private int partidosJugados;
    private float posesionDeBalon;

    public void actualizarEstadisticas(int goles, int asistencias, int tarjetasAmarillas, int tarjetasRojas, int partidosJugados, float posesionDeBalon) {
        this.goles += goles;
        this.asistencias += asistencias;
        this.tarjetasAmarillas += tarjetasAmarillas;
        this.tarjetasRojas += tarjetasRojas;
        this.partidosJugados += partidosJugados;
        this.posesionDeBalon = (this.posesionDeBalon * (partidosJugados - 1) + posesionDeBalon) / partidosJugados;
    }

    @Override
    public String toString() {
        return "Goles: " + goles + " | Asistencias: " + asistencias + " | Tarjetas Amarillas: " + tarjetasAmarillas + " | Tarjetas Rojas: " + tarjetasRojas + " | Partidos Jugados: " + partidosJugados + " | Posesión de Balón: " + posesionDeBalon;
    }
}
