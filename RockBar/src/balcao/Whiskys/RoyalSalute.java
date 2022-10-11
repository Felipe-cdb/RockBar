package balcao.Whiskys;

import balcao.Bebidas;
import balcao.IWhisky;

public class RoyalSalute extends Bebidas implements IWhisky {

    public RoyalSalute() {
        setNome("Royal Salute");
        setPreco(900);
    }

    @Override
    public float tempoDeMaturacao() {
        return 21;
    }

    @Override
    public String procedencia() {
        return "Escócia";
    }

    @Override
    public void pedir() {
        System.out.println(getNome());
        System.out.println(getPreco());
        System.out.println(tempoDeMaturacao());
        System.out.println(procedencia());
    }
}
