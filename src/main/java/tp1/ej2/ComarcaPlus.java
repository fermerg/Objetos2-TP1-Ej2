package tp1.ej2;

public class ComarcaPlus extends TarjetaCredito {

    double porcentajeDescuento;

    public ComarcaPlus(double porcentajeDescuento) {
        this.porcentajeDescuento = porcentajeDescuento;
    }

    @Override
    public double calcularDescuento(double montoPlatos, double montoBebidas) {
        double costoBebidaYPlatos = (montoPlatos + montoBebidas) * porcentajeDescuento;
        return costoBebidaYPlatos;
    }
}