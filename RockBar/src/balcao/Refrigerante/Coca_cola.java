package balcao.Refrigerante;

import balcao.Bebidas;
import balcao.TipoEmbalagem;
import balcao.IRefrigerante;

public class Coca_cola extends Bebidas implements IRefrigerante{

    public Coca_cola() {
        setNome("Coca-Cola ");
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