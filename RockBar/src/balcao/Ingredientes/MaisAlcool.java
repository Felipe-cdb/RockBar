package balcao.Ingredientes;

import balcao.Bebidas;

/**
 * Segue a criação dos decoradores concretos que serão acrescentados ao nossos
 * componentes concretos. 
 */
public class MaisAlcool extends Ingrediente{
    
    public MaisAlcool(Bebidas drink) {
        super(drink);
        this.preco = 2;
        adcionarIgrediente("MaisAlcool");
    }  

}
