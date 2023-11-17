package dominio;

public abstract class Vehiculo {
    String marca;
    String modelo;
    int num_plazas;
    double precio_base;

    double  precio_final;

    public Vehiculo(String marca, String modelo, int num_plazas, double precio_base) {
        this.marca = marca;
        this.modelo = modelo;
        this.num_plazas = num_plazas;
        this.precio_base = precio_base;
    }

    public abstract void calcularPrecioFinal();



}
