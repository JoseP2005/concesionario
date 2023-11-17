package dominio;

import java.util.ArrayList;

public class Concesionario {
    private ArrayList<Vehiculo> catalogo;

    public Concesionario() {
        catalogo = new ArrayList<>();
    }

    public void agregarVehiculo(Vehiculo vehiculo) {
        catalogo.add(vehiculo);
    }
    public void mostrarCatalogo() {
        for (Vehiculo vehiculo : catalogo) {
            System.out.println(vehiculo.marca + " " + vehiculo.modelo +"Numero de Palzas" + vehiculo.num_plazas + "Precio Base"+ vehiculo.precio_base + " - Precio final: " + vehiculo.calcularPrecioFinal());
        }
    }

}
