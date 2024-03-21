package tp1.ej2;

public class OtraTarjeta extends TarjetaCredito {
    private String nombre;

    public OtraTarjeta(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public double calcularDescuento(double montoPlatos, double montoBebidas) {
        double sinDescuento = 0;
        return sinDescuento;
    }
}