package balcao.Cervejas;

import balcao.TipoEmbalagem;
import balcao.Bebidas;
import balcao.ICerveja;

public class Heineken extends Bebidas implements ICerveja{

    public Heineken() {
        setNome("Heineken");
        setPreco(8.5f);
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
        System.out.println(getNome());
        System.out.println(getPreco());
        System.out.println(emabalagem());
        System.out.println((isZeroAcool() == false) ? "Com Alcool" : "Sem Alcool");
    }
    
}
