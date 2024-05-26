public class App {
    public static void main(String[] args) throws Exception {

        // crear instancias de cada tipo de vehiculo
        Auto auto = new Auto("Toyota", "Corolla", 2024, 15000, 5, "Diesel");

        Camion camion = new Camion("Volvo", "FH", 2019, 75000, 200000, 4);

        System.out.println("Información del Auto:");
        auto.mostrarInfo();

        System.out.println("\nInformación del camión:");
        camion.mostrarInfo();

        double costoKM = 100; // Es un Lamborgini Aventador y por eso gasta tanto 

        int KMrecorridos = 10; // Como gasta mucho apenas lo usa su dueño (tiene un helicoptero que le sale más barato)

        double costoMantenimiento = auto.calcularCostoMantenimiento(costoKM, KMrecorridos);

        System.out.println("El costo de mantenimiento del auto es de $" + costoMantenimiento);
    }
}
