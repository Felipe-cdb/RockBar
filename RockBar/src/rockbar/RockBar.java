package rockbar;

import balcao.Bebidas;
import balcao.Drink.Caipirinha;
import balcao.Ingredientes.Limao;
import balcao.Cervejas.Skol;

/**
 * Trabalho de POOII - Aplicando Padrões de projeto
 * Strategy, Observer & Decorator
 * @author Anael Jonas, Felipe Correia, Luan Ferreira
 */
public class RockBar {
    public static void main(String[] args) {
        Bebidas pedido1 = new Skol();
        pedido1.setMesa("Mesa 1");
        Bebidas pedido2 = new Caipirinha();
        pedido2 = new Limao(pedido2);
        pedido2.setMesa("Mesa 2");

        Mesa mesa1 = new Mesa();
        mesa1.setName("Mesa 1");
        Mesa mesa2 = new Mesa();
        mesa2.setName("Mesa 2");
        

        Bartender bartender = new Bartender();
        bartender.registrarPedido(pedido1.getMesa());

        bartender.notificarPedidos(pedido1.getMesa());
    }
}