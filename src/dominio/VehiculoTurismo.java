package dominio;

public class VehiculoTurismo extends Vehiculo {



    public VehiculoTurismo(String marca, String modelo,int num_plazas, double precio_base){
        super(marca, modelo, num_plazas, precio_base);
    }
    @Override
    public void calcularPrecioFinal() {
        if (num_plazas <= 5) {
            precio_final = precio_base;
        } else {
            precio_final = (int) (precio_base + precio_base * 0.10);
        }
    }


}
