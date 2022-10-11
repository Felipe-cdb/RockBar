package balcao.Whiskys;

import balcao.Bebidas;
import balcao.IWhisky;
import balcao.TipoEmbalagem;

public class BuchanansDeluxe extends Bebidas implements IWhisky {

    public BuchanansDeluxe() {
        setNome("Buchanan's Deluxe");
        setPreco(140);
    }

    @Override
    public float tempoDeMaturacao() {
        return 12;
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
