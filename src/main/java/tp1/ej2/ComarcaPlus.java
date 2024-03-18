package tp1.ej2;

public class ComarcaPlus extends TarjetaCredito {

    double porcentajeDescuento;

    public ComarcaPlus(double porcentajeDescuento) {
        this.porcentajeDescuento = porcentajeDescuento;
    }

    @Override
    public double calcularDescuento(Pedido pedido) {
        double costoBebidaYPlatos = pedido.getCostoBebidaYPlatos();
        costoBebidaYPlatos = costoBebidaYPlatos * porcentajeDescuento;
        return costoBebidaYPlatos;
    }
}