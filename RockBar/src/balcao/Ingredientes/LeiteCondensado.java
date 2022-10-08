package balcao.Ingredientes;

import balcao.Bebidas;
import static balcao.IDrink.ingredientes;

/**
 * Segue a criação dos decoradores concretos que serão acrescentados ao nossos
 * componentes concretos. 
 */
public class LeiteCondensado extends Ingrediente{
    public LeiteCondensado(Bebidas drink) {
        super(drink);
        this.preco = 3;
        adcionarIgrediente("Leite Condensado");
    }  
}
