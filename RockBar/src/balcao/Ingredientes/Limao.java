package balcao.Ingredientes;

import balcao.Bebidas;

/**
 * Segue a criação dos decoradores concretos que serão acrescentados ao nossos
 * componentes concretos. 
 */
public class Limao extends Ingrediente{

    public Limao(Bebidas drink) {
        super(drink);
        this.preco = 1;
        adcionarIgrediente("Limao");
    }  

}
