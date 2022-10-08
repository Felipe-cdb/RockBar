package balcao.Cervejas;

import balcao.TipoEmbalagem;
import balcao.Bebidas;
import balcao.ICerveja;

public class Skol extends Bebidas implements ICerveja{ 
    
    public Skol() {
        setNome("Skol");
        setPreco(3);
    }   
    
    @Override
    public boolean isZeroAcool() {
        return false;
    }

    @Override
    public TipoEmbalagem emabalagem() {
        return TipoEmbalagem.GARRAFA;
    }

    @Override
    public void pedir() {
        
    }
    
}