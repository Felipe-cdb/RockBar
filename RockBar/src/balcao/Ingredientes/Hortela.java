package balcao.Ingredientes;

import balcao.Bebidas;
import static balcao.IDrink.ingredientes;

/**
 * Segue a criação dos decoradores concretos que serão acrescentados ao nossos
 * componentes concretos. 
 */
public class Hortela extends Ingrediente{
    
    public Hortela(Bebidas drink) {
        super(drink);
        this.preco = 2;
        adcionarIgrediente("Hortelã");
    }  
}
