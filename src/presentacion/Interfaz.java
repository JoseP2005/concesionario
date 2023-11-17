package presentacion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import dominio.*;

public class Interfaz {
    private List<Vehiculo> catalogo;
    private Scanner sc;

    public Interfaz() {
        catalogo = new ArrayList<>();
        sc = new Scanner(System.in);
    }

    public void iniciarPrograma() {
        int opcion = 0;
    
        do {
            mostrarMenu();
            opcion = sc.nextInt();
            sc.nextLine();
    
            switch (opcion) {
                case 1:
                    crearVehiculoTurismo();
                    break;
                case 2:
                    crearFurgoneta();
                    break;
                case 3:
                    mostrarCatalogo();
                    break;
                case 4:
                    mostrarInformacion();
                    break;
                case 5:
                    System.out.println("Gracias por utilizar el programa.");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
                    break;
            }
    
        } while (opcion != 6);
    }
    

    private void mostrarMenu() {
        System.out.println("----------- MENÚ -----------");
        System.out.println("1. Crear VehiculoTurismo");
        System.out.println("2. Crear Furgoneta");
        System.out.println("3. Mostrar catalogo");
        System.out.println("4. Mostrar información");
        System.out.println("5. Salir");
        System.out.print("Ingrese una opción: ");
    }

    private void crearVehiculoTurismo() {
        System.out.print("\nIngrese la cantidad de Vehiculos Turismo que desea crear: ");
        int cantidad = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < cantidad; i++) {
            System.out.println("\n--- CREANDO VEHICULO TURISMO " + (i + 1) + " ---");
            System.out.print("Ingrese la marca del Vehiculo: ");
            String marca = sc.nextLine();
            System.out.print("Ingrese el modelo del Vehiculo: ");
            String modelo = sc.nextLine();
            System.out.print("Ingrese el numero de Plazas: ");
            int num_plazas = sc.nextInt();
            System.out.print("Ingrese el precio Base: ");
            double precio_base = sc.nextDouble();
            sc.nextLine();

            Vehiculo vehiculoTurismo = new VehiculoTurismo(marca, modelo, num_plazas, precio_base);

            System.out.println("VehiculoTurismo creado: " + vehiculoTurismo);

            agregarVehiculo(vehiculoTurismo);
        }
    }

    private void crearFurgoneta() {
        System.out.print("\nIngrese la cantidad de Furgonetas que desea crear: ");
        int cantidad = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < cantidad; i++) {
            System.out.println("\n--- CREANDO FURGONETA " + (i + 1) + " ---");
            System.out.print("Ingrese la marca de la Furgoneta: ");
            String marca = sc.nextLine();
            System.out.print("Ingrese el modelo de la Furgoneta: ");
            String modelo = sc.nextLine();
            System.out.print("Ingrese el numero de Plazas: ");
            int num_plazas = sc.nextInt();
            System.out.print("Ingrese el precio Base: ");
            double precio_base = sc.nextDouble();
            System.out.print("Ingrese su capacidad de Carga: ");
            double capacidadCarga = sc.nextDouble();
            sc.nextLine();

            Vehiculo furgoneta = new Furgoneta(marca, modelo, num_plazas, precio_base, capacidadCarga);

            System.out.println("Furgoneta creada: " + furgoneta);

            agregarVehiculo(furgoneta);
        }
    }

    private void mostrarCatalogo() {
        System.out.println("\n--- CATÁLOGO DE VEHÍCULOS ---");
        for (Vehiculo vehiculo : catalogo) {
            System.out.println(vehiculo);
        }
    }

    private void mostrarInformacion() {
    if (catalogo.isEmpty()) {
        System.out.println("El catálogo está vacío. No hay información para mostrar.");
        return;
    }

    System.out.print("\nIngrese el índice del vehículo para mostrar información: ");
    int indice = sc.nextInt();
    sc.nextLine();

    if (indice >= 0 && indice < catalogo.size()) {
        Vehiculo vehiculoSeleccionado = catalogo.get(indice);
        System.out.println("\n--- INFORMACIÓN DEL VEHÍCULO ---");
        System.out.println("Marca: " + vehiculoSeleccionado.getMarca());
        System.out.println("Modelo: " + vehiculoSeleccionado.getModelo());
        System.out.println("Número de Plazas: " + vehiculoSeleccionado.getNumPlazas());
        System.out.println("Precio Base: " + vehiculoSeleccionado.getPrecioBase());
        System.out.println("Precio Final: " + vehiculoSeleccionado.getPrecioFinal());
        if (vehiculoSeleccionado instanceof Furgoneta) {
            Furgoneta furgoneta = (Furgoneta) vehiculoSeleccionado;
            System.out.println("Capacidad de Carga: " + furgoneta.getCapacidadCarga());
        }
    } else {
        System.out.println("Índice no válido. Intente nuevamente.");
    }
}


    private void agregarVehiculo(Vehiculo vehiculo) {
        catalogo.add(vehiculo);
    }
}
