package balcao.Cervejas;

import balcao.Bebidas;
import balcao.ICerveja;
import balcao.TipoEmbalagem;

public class Chopp extends Bebidas implements ICerveja{

    public Chopp() {
        setNome("Chopp");
        setPreco(10.5f);
    }

    @Override
    public boolean isZeroAcool() {
        return false;
    }

    @Override
    public TipoEmbalagem emabalagem() {
        return TipoEmbalagem.TORRE;
    }

    @Override
    public void pedir() {
        System.out.println(getNome());
        System.out.println(getPreco());
        System.out.println(emabalagem());
        System.out.println((isZeroAcool() == false) ? "Com Alcool" : "Sem Alcool");
    }
    
}
