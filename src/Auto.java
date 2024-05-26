public class Auto extends VehiculoPasajeros {

    private String tipoCombustible;

    // Constructor
    public Auto(String marca, String modelo, int año, int kilometraje, int numPasajeros, String tipoCombustible) {
        super(marca, modelo, año, kilometraje, numPasajeros);
        this.tipoCombustible = tipoCombustible;
    }

    // Getter y Setter para tipoCombustible
    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    // método realizarMantenimiento
    public void realizarMantenimiento() {
        System.out.println("Realizando mantenimiento básico de Auto:");
        System.out.println("- Revisión de niveles de aceite, refrigerante, batería y líquido de frenos.");
        System.out.println("- Cambio de filtro de aceite y aire.");
        System.out.println("- Revisión de neumáticos.");
        System.out.println("- Revisión de luces y frenos.");
        System.out.println("- Revisión de asientos y maletero.");
    }

    // Método para calcular el costo de mantenimiento
    public double calcularCostoMantenimiento(double costoKM, int KMrecorridos) {
        double costoTotal = costoKM * KMrecorridos;
        return costoTotal;
    }

    // sobrescribir el método
    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Tipo de combustible: " + tipoCombustible);

    }
}
