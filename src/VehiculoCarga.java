public class VehiculoCarga extends vehiculo {
    private int capacidadCarga;

    // constructor
    public VehiculoCarga(String marca, String modelo, int año, int kilometraje, int capacidadCarga) {
        super(marca, modelo, año, kilometraje);
        this.capacidadCarga = capacidadCarga;
    }

    // Getter y Setter
    public int getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(int capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    // sobrescirbir el método mostrarinfo()
    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Capacidad carga: " + capacidadCarga + "kg");
    }

}
