/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package balcao.Drink;

import balcao.Bebidas;
import balcao.IDrink;
import static balcao.IDrink.ingredientes;

/**
 *
 * @author felipe
 */
public class DrinkGim extends Bebidas implements IDrink {

    public DrinkGim() {
        setNome("Drink com Gim");
        setPreco(6);
        adcionarIgrediente("Gim");
        adcionarIgrediente("Energetico");
        mostrar();
    }
    
    @Override
    public void adcionarIgrediente(String ingrediente) {
        ingredientes.add(ingrediente);
    }
    
    public void mostrar(){
        System.out.println(ingredientes);
    }
    
}
