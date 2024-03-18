package tp1.ej2;

public class Mastercard extends TarjetaCredito {

    double porcentajeDescuento;

    public Mastercard(double porcentajeDescuento) {
        this.porcentajeDescuento = porcentajeDescuento;
    }

    @Override
    public double calcularDescuento(Pedido pedido) {
        double costoPlatos = pedido.getCostoPlatos();
        costoPlatos = costoPlatos * porcentajeDescuento;
        return costoPlatos;
    }
}
