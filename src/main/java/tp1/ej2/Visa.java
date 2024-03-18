package tp1.ej2;

public class Visa extends TarjetaCredito {

    private double porcentajeDescuento;

    public Visa(double porcentajeDescuento) {
        this.porcentajeDescuento = porcentajeDescuento;
    }

    @Override
    public double calcularDescuento(Pedido pedido) {
        double descuento = pedido.getCostoBebida();
        descuento = descuento * porcentajeDescuento;
        return descuento;
    }
}