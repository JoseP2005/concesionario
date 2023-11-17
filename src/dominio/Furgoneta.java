package dominio;
public class Furgoneta extends Vehiculo{
    private double capacidadCarga;
    public Furgoneta(String marca, String modelo, int num_plazas, double  precio_base, double capacidadCarga) {
        super(marca, modelo,num_plazas, precio_base);
        this.capacidadCarga = capacidadCarga;
    }
    @Override
    public void calcularPrecioFinal() {
        precio_final = precio_base * (0.5 * Math.cbrt(capacidadCarga));
    }
}
