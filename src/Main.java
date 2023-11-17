import dominio.Concesionario;
import dominio.Furgoneta;
import dominio.VehiculoTurismo;

public class Main {
    public static void main(String[] args) {
        VehiculoTurismo vehiculo1 = new VehiculoTurismo("Ford", "Focus", 5,20000);
        VehiculoTurismo vehiculo2 = new VehiculoTurismo("Nissan", "Pathfinder", 7,80000);
        VehiculoTurismo vehiculo3 = new VehiculoTurismo("Honda", "Civic", 5,90000);
        VehiculoTurismo vehiculo4 = new VehiculoTurismo("Chevrolet", "Suburban", 8,100000);
        VehiculoTurismo vehiculo5 = new VehiculoTurismo("Volkswagen", "Atlas", 7,110000);
        Furgoneta furgoneta1  = new Furgoneta("Ford", "Transit", 3, 25000, 12.5);


        Concesionario concesionario = new Concesionario();
        concesionario.agregarVehiculo(vehiculo1);
        concesionario.agregarVehiculo(vehiculo2);
        concesionario.agregarVehiculo(vehiculo3);
        concesionario.agregarVehiculo(vehiculo4);
        concesionario.agregarVehiculo(vehiculo5);
        concesionario.agregarVehiculo(furgoneta1);


        concesionario.mostrarCatalogo();
        System.out.println("Precio total: " + concesionario.calcularPrecioTotal());
    }
}