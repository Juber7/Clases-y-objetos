public class Camion extends VehiculoCarga {
    private int numEjes;

    // constructor
    public Camion(String marca, String modelo, int año, int kilometraje, int capacidadCarga, int numEjes) {
        super(marca, modelo, año, kilometraje, capacidadCarga);
        this.numEjes = numEjes;
    }

    // Getter y Setter para numEjes
    public int getNumEjes() {
        return numEjes;
    }

    public void setNumEjes(int numEjes) {
        this.numEjes = numEjes;
    }

    // método realizarMantenimiento
    @Override
    public void realizarMantenimiento() {
        System.out.println("Realizando mantenimiento básico de camión:");
        System.out.println("- Revisión de niveles de aceite, refrigerante, batería y líquido de frenos.");
        System.out.println("- Cambio de filtro de aceite y aire.");
        System.out.println("- Revisión de neumáticos.");
        System.out.println("- Revisión de luces y frenos.");
        System.out.println("- Cambio de filtro de aceite, aire y combustible.");
        System.out.println("- Revisión de neumáticos, presión y suspensión.");
    }

    // sobrescribir
    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Número de ejes: " + numEjes);
    }
}