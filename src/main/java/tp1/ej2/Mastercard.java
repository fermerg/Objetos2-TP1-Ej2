package tp1.ej2;

public class Mastercard extends TarjetaCredito {

    double porcentajeDescuento;

    public Mastercard(double porcentajeDescuento) {
        this.porcentajeDescuento = porcentajeDescuento;
    }

    @Override
    public double calcularDescuento(double montoPlatos, double montoBebidas) {
        double costoPlatos = montoPlatos * porcentajeDescuento;
        return costoPlatos;
    }
}
