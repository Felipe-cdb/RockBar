/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package balcao.Refrigerante;

import balcao.Bebidas;
import balcao.IRefrigerante;
import balcao.TipoEmbalagem;

/**
 *
 * @author felipe
 */
public class Coca_Zero extends Bebidas implements IRefrigerante{
    
    public Coca_Zero() {
        setNome("Coca-Cola ");
        setPreco(4);
    }  
    
    @Override
    public TipoEmbalagem embalagem() {
        return TipoEmbalagem.LATA;
    }

    @Override
    public boolean isZero() {
        return true;
    }

    @Override
    public String sabor() {
        return "Coca";
    }

    @Override
    public void pedir() {
        System.out.println(getNome());
        System.out.println("R$: " + getPreco());
        System.out.println(embalagem());
        System.out.println((isZero() == false) ? "Normal" : "Zero Açucar");
    }
    
}