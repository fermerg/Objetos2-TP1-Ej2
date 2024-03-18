package tp1.ej2;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    double costoBebida = 0;
    double costoPlatos = 0;
    double costoBebidaYPlatos = 0;
    private List<Plato> platos = new ArrayList<Plato>();
    private List<Bebida> bebidas = new ArrayList<Bebida>();

    public Pedido(Plato plato, int cantidadPlatos, Bebida bebida, int cantidadBebidas) {
        for (int i = 1; i <= cantidadPlatos; i++) {
            this.platos.add(plato);
        }
        for (int i = 1; i <= cantidadBebidas; i++) {
            this.bebidas.add(bebida);
        }
    }

    public void agregarPlato(Plato plato, int cantidadPlatos) {
        for (int i = 1; i <= cantidadPlatos; i++)
            this.platos.add(plato);
    }

    public void agregarBebida(Bebida bebida, int cantidadBebidas) {
        for (int i = 1; i <= cantidadBebidas; i++)
            this.bebidas.add(bebida);
    }

    public double calcularCostoBebida() {
        for (Bebida bebida : bebidas)
            this.costoBebida += bebida.getPrecio();
        return costoBebida;
    }

    public double getCostoBebida() {
        return costoBebida;
    }

    public double calcularCostoPlato() {
        for (Plato plato : platos)
            costoPlatos += plato.getPrecio();
        return costoPlatos;
    }

    public double getCostoPlatos() {
        return costoPlatos;
    }

    public double calcularCostoBebidaYPlatos() {
        this.costoBebidaYPlatos = this.calcularCostoBebida() + this.calcularCostoPlato();
        return costoBebidaYPlatos;
    }

    public double getCostoBebidaYPlatos() {
        return costoBebidaYPlatos;
    }

    public double calcularCostoTotal(TarjetaCredito tarjeta, double propina) {
        double costoTotal = this.calcularCostoBebidaYPlatos() +
                this.calcularPropina(propina) -
                (tarjeta.calcularDescuento(this));
        return costoTotal;
    }

    private double calcularPropina(double propina) {
        propina = this.costoBebidaYPlatos * propina;
        return propina;
    }
}