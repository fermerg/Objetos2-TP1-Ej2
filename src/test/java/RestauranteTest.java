import org.junit.jupiter.api.Test;
import tp1.ej2.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RestauranteTest {
    final double descuentoVisa = 0.03;
    final double descuentoMastercard = 0.02;
    final double descuentoComarcaPlus = 0.02;
    final double propina2PorCiento = 0.02;
    final double propina3PorCiento = 0.03;
    final double propina5PorCiento = 0.05;

    Mesa mesa1 = new Mesa(2);
    Mesa mesa2 = new Mesa(2);
    Mesa mesa3 = new Mesa(2);
    Mesa mesa4 = new Mesa(2);

    Plato pastas = new Plato("Ravioles", 600);
    Plato carne = new Plato("Carne", 650);
    Plato postre = new Plato("Postre", 400);
    Bebida vino = new Bebida("Vino", 300);
    Bebida gasesosa = new Bebida("Gaseosa", 150);

    @Test
    public void testCostoTarjetaVisa() {
        Comensal comensal1 = new Comensal("Marcos");
        Comensal comensal2 = new Comensal("Luciana");

        mesa1.agregarComensal(comensal1);
        mesa1.agregarComensal(comensal2);

        comensal1.agregarPedido(new Pedido(pastas, 2, vino, 2));
        comensal2.agregarPedido(new Pedido(carne, 2, gasesosa, 1));
        comensal2.agregarPedido(new Pedido(postre, 3, null, 0));

        assertEquals(4561, mesa1.calcularCosto(new Visa(descuentoVisa), propina3PorCiento));
    }

    @Test
    public void testCostoTarjetaMastercard() {
        Comensal comensal3 = new Comensal("Juan");
        Comensal comensal4 = new Comensal("Anastasia");

        mesa2.agregarComensal(comensal3);
        mesa2.agregarComensal(comensal4);

        comensal3.agregarPedido(new Pedido(pastas, 2, vino, 2));
        comensal4.agregarPedido(new Pedido(carne, 2, gasesosa, 1));
        comensal4.agregarPedido(new Pedido(postre, 3, null, 0));

        assertEquals(4509.5, mesa2.calcularCosto(new Mastercard(descuentoMastercard), propina3PorCiento));
    }

    @Test
    public void testCostoOtraTarjeta() {
        Comensal comensal5 = new Comensal("Carola");
        Comensal comensal6 = new Comensal("Pedro");

        mesa3.agregarComensal(comensal5);
        mesa3.agregarComensal(comensal6);

        comensal5.agregarPedido(new Pedido(pastas, 2, vino, 2));
        comensal6.agregarPedido(new Pedido(carne, 2, gasesosa, 1));
        comensal6.agregarPedido(new Pedido(postre, 3, null, 0));

        assertEquals(4583.5, mesa3.calcularCosto(new OtraTarjeta("Viedma"), propina3PorCiento));
    }

    @Test
    public void testCostoTarjetaComarcaPlus() {
        Comensal comensal7 = new Comensal("Gabriela");
        Comensal comensal8 = new Comensal("Federico");

        mesa4.agregarComensal(comensal7);
        mesa4.agregarComensal(comensal8);

        comensal7.agregarPedido(new Pedido(pastas, 2, vino, 2));
        comensal8.agregarPedido(new Pedido(carne, 2, gasesosa, 1));
        comensal8.agregarPedido(new Pedido(postre, 3, null, 0));

        assertEquals(4494.5, mesa4.calcularCosto(new ComarcaPlus(descuentoComarcaPlus), propina3PorCiento));
    }
}

//preguntar como importar junit automaticamente, maven instalado?
//como saber si la cobertura esta bien?