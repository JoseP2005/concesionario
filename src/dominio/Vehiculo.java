package dominio;

public abstract class Vehiculo {
    private String marca;
    private String modelo;
    private int num_plazas;
    private double precio_base;
    private double precio_final;

    public Vehiculo(String marca, String modelo, int num_plazas, double precio_base) {
        this.marca = marca;
        this.modelo = modelo;
        this.num_plazas = num_plazas;
        this.precio_base = precio_base;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getNumPlazas() {
        return num_plazas;
    }

    public void setNumPlazas(int num_plazas) {
        this.num_plazas = num_plazas;
    }

    public double getPrecioBase() {
        return precio_base;
    }

    public void setPrecioBase(double precio_base) {
        this.precio_base = precio_base;
    }

    public double getPrecioFinal() {
        return precio_final;
    }

    public void setPrecioFinal(double precio_final) {
        this.precio_final = precio_final;
    }

    public abstract double calcularPrecioFinal();
}
