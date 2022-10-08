package rockbar;

import java.util.ArrayList;
import java.util.List;

public class Bartender implements IPedidos {
    private List<String> mesas_esperando_pedido = new ArrayList();
    
    @Override
    public void registrarPedido(String mesa_name) {
        mesas_esperando_pedido.add(mesa_name);
        System.out.println("Bartender registrou o pedido da " + mesa_name);
    }

    @Override
    public void removerPedido(String mesa_name) {
        mesas_esperando_pedido.remove(mesa_name);
    }

    @Override
    public void notificarPedidos(String mesa_name) {
        System.out.println("Bartender notificou todas as mesas");
        removerPedido(mesa_name);
        System.out.println(mesa_name + " recebeu o pedido");
    }
}