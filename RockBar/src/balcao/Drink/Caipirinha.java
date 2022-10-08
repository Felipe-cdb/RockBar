package balcao.Drink;

import balcao.Bebidas;
import balcao.IDrink;

/**
 * Segue a criação dos componentes concretos que são de fato os objetos finais
 * da classe Bebidas. Em nosso caso é o drink, sendo básico, mas com  posibilidades
 * de poderem ter ingredientes adicionais aplicando os decoradores.
 */
public class Caipirinha extends Bebidas implements IDrink {

    public Caipirinha() {
        setNome("Caipirinha");
        setPreco(10);
        adcionarIgrediente("Cachaça");
        adcionarIgrediente("Limão");
        adcionarIgrediente("Açucar"); 
    }
    
    @Override
    public void adcionarIgrediente(String ingrediente) {
        ingredientes.add(ingrediente);
    }
    
}
