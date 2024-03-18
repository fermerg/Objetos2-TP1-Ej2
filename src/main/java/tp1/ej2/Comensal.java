package tp1.ej2;

import java.util.ArrayList;
import java.util.List;

public class Comensal {
    private String nombre;
    private List<Pedido> pedidos;

    public Comensal(String nombre) {
        this.nombre = nombre;
        this.pedidos = new ArrayList<Pedido>();
    }

    public void agregarPedido(Pedido pedido) {
        this.pedidos.add(pedido);
    }

    public double calcularCuenta(TarjetaCredito tarjetaAsociada, double propina) {
        double total = 0;
        for (Pedido pedido : pedidos) {
            total += pedido.calcularCostoTotal(tarjetaAsociada, propina);
        }
        return total;
    }
}