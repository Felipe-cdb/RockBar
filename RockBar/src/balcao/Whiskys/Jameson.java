package balcao.Whiskys;

import balcao.Bebidas;
import balcao.IWhisky;

public class Jameson extends Bebidas implements IWhisky {

    public Jameson() {
        setNome("Jameson");
        setPreco(130);
    }

    @Override
    public float tempoDeMaturacao() {
        return 4;
    }

    @Override
    public String procedencia() {
        return "Irlandia";
    }

    @Override
    public void pedir() {
        System.out.println(getNome());
        System.out.println(getPreco());
        System.out.println(tempoDeMaturacao());
        System.out.println(procedencia());
    }
}
