package dominio;

public class VehiculoTurismo extends Vehiculo {



    public VehiculoTurismo(String marca, String modelo,int num_plazas, double precio_base){
        super(marca, modelo, num_plazas, precio_base);
    }
    @Override
    public double calcularPrecioFinal() {
        if (getNumPlazas() <= 5) {
            setPrecioFinal(getPrecioBase());
        } else {
            setPrecioFinal(getPrecioBase() + getPrecioBase() * 0.10);
        }
        return getPrecioFinal();
    }
    @Override
public String toString() {
    return "VehiculoTurismo - Marca: " + getMarca() + ", Modelo: " + getModelo() + ", Num Plazas: " + getNumPlazas() + ", Precio Base: " + getPrecioBase() + ", Precio Final: " + calcularPrecioFinal();
}


}
