package tp1.ej2;

import java.util.ArrayList;
import java.util.List;

public class Mesa {
    private int capacidad;
    private List<Comensal> comensales;

    public Mesa(int capacidad) {
        this.capacidad = capacidad;
        this.comensales = new ArrayList<Comensal>();
    }

    public void agregarComensal(Comensal comensal) {
        if (comensales.size() < capacidad)
            this.comensales.add(comensal);
        else System.out.println("La mesa esta llena.");
    }


    public double calcularCosto(TarjetaCredito tarjetaElegida, double propina) {
        double cuenta = 0;
        for (Comensal comensal : comensales) {
            cuenta += comensal.calcularCuenta(tarjetaElegida, propina);
        }
        return cuenta;
    }
}