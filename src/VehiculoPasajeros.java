public class VehiculoPasajeros extends vehiculo {
    // VehiculosPasajeros.java

    private int numPasajeros;

    // constructor
    public VehiculoPasajeros(String marca, String modelo, int año, int kilometraje, int numPasajeros) {
        super(marca, modelo, año, kilometraje);
        this.numPasajeros = numPasajeros;
    }

    // Getter y Setter de numPasajeros
    public int getNumPasajeros() {
        return numPasajeros;
    }

    public void setNumbPasajeros(int numPasajeros) {
        this.numPasajeros = numPasajeros;
    }

    // sobrescribir el método mostrarInfo()
    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Número de pasajeros: " + numPasajeros);
    }
}
