package balcao;


/**
 * Criação das interfaces que remete o tipo de Bebida
 * a partir dessa interface o strategy age variando as caracteristas
 * do tipo especifico desse tipo de bebida.
 */
public interface IRefrigerante {
    
    TipoEmbalagem embalagem();
    boolean isZero();
    String sabor();

    public void pedir();
    
}
