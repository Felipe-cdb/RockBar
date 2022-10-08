package balcao.Ingredientes;

import balcao.Bebidas;
import static balcao.IDrink.ingredientes;

/**
 * Segue a criação dos decoradores concretos que serão acrescentados ao nossos
 * componentes concretos. 
 */
public class Gelos extends Ingrediente{
    public Gelos(Bebidas drink) {
        super(drink);
        this.preco = 0.5f;
        adcionarIgrediente("Cubos de Gelos");
        System.out.println(ingredientes);
    }  
}
