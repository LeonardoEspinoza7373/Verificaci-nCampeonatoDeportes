public class EstadisticaEquipo {
    private String nombreEquipo;
    private int partidosGanados;
    private int partidosPerdidos;
    private int partidosEmpatados;
    private int golesAFavor;
    private int golesEnContra;
    private float posesionDeBalon;

    public EstadisticaEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public void actualizarEstadisticas(int golesAFavor, int golesEnContra, float posesionDeBalon, boolean ganado, boolean perdido) {
        this.golesAFavor += golesAFavor;
        this.golesEnContra += golesEnContra;
        this.partidosGanados += ganado ? 1 : 0;
        this.partidosPerdidos += perdido ? 1 : 0;
        this.partidosEmpatados += (!ganado && !perdido) ? 1 : 0;
        this.posesionDeBalon = (this.posesionDeBalon * (partidosGanados + partidosPerdidos + partidosEmpatados - 1) + posesionDeBalon) / (partidosGanados + partidosPerdidos + partidosEmpatados);
    }

    public int getPuntos() {
        return (partidosGanados * 3) + (partidosEmpatados);
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    @Override
    public String toString() {
        return "Partidos Ganados: " + partidosGanados + " | Partidos Perdidos: " + partidosPerdidos + " | Goles a Favor: " + golesAFavor + " | Goles en Contra: " + golesEnContra + " | Posesión de Balón: " + posesionDeBalon;
    }
}
