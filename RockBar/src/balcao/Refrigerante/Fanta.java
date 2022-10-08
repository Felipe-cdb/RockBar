package balcao.Refrigerante;

import balcao.Bebidas;
import balcao.TipoEmbalagem;
import balcao.IRefrigerante;

public class Fanta extends Bebidas implements IRefrigerante{

    public Fanta() {
        setNome("Fanta Laranja");
        setPreco(4);
    }  
    
    @Override
    public TipoEmbalagem embalagem() {
        return TipoEmbalagem.LATA;
    }

    @Override
    public boolean isZero() {
        return false;
    }

    @Override
    public String sabor() {
        return "Laranja";
    }

    @Override
    public void pedir() {
        System.out.println(getNome());
        System.out.println(getPreco());
        System.out.println(embalagem());
        System.out.println((isZero() == false) ? "Normal" : "Zero Açucar");
    }
    
}