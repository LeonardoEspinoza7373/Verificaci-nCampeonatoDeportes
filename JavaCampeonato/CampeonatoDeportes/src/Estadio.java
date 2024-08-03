public class Estadio {
    private String nombre;
    private String ubicacion;
    private int capacidad;

    public String getNombre() {
        return nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public int getCapacidad() {
        return capacidad;
    }
    public Estadio(String nombre, String ubicacion, int capacidad) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.capacidad = capacidad;
    }


    public void actualizarInformacion(String nuevaUbicacion, int nuevaCapacidad) {
        this.ubicacion = nuevaUbicacion;
        this.capacidad = nuevaCapacidad;
    }

    @Override
    public String toString() {
        return "Estadio: " + nombre + " | Ubicación: " + ubicacion + " | Capacidad: " + capacidad;
    }
}
