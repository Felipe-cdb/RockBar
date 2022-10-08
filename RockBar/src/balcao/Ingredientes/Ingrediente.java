package balcao.Ingredientes;

import balcao.Bebidas;
import balcao.IDrink;

/**
 * A classe Ingrediente é nosso decorator, que implementa o tipo Drinks e 
 * extende Bebidas. Essa Classe é responsalvél pela lógica de atribuir mais 
 * caracteristicas as nossas instancias de Bebidas.
 */
public abstract class Ingrediente extends Bebidas implements IDrink{

    private Bebidas drink;

    public Ingrediente(Bebidas drink) {
        this.drink = drink;
    }

    public Bebidas getDrink() {
        return drink;
    }

    @Override
    public float getPreco() {
        return this.preco + this.drink.getPreco();
    }

    @Override
    public String getNome() {
        return this.drink.getNome() + " + Adicionais";
    }

    @Override
    public void adcionarIgrediente(String ingrediente) {
        ingredientes.add(ingrediente);
    }
        
}