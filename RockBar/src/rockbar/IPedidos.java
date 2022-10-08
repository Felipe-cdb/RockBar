package rockbar;

public interface IPedidos {
    void registrarPedido(String mesa);
    void removerPedido(String mesa);
    void notificarPedidos(String mesa_name);
}