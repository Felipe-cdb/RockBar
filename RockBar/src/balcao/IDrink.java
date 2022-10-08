package balcao;

import java.util.ArrayList;

/**
 * Criação das interfaces que remete o tipo de Bebida
 * a partir dessa interface o strategy age variando as caracteristas
 * do tipo especifico desse tipo de bebida.
 */
public interface IDrink {
    ArrayList<String> ingredientes = new ArrayList<>();
    void adcionarIgrediente(String ingrediente);
    
}
