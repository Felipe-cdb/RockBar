package balcao.Whiskys;

import balcao.Bebidas;
import balcao.IWhisky;

public class JackDaniels extends Bebidas implements IWhisky {

    public JackDaniels() {
        setNome("Jack Daniels");
        setPreco(170);
    }

    @Override
    public float tempoDeMaturacao() {
        return 2;
    }

    @Override
    public String procedencia() {
        return "Americano";
    }

    @Override
    public void pedir() {
        System.out.println(getNome());
        System.out.println(getPreco());
        System.out.println(tempoDeMaturacao());
        System.out.println(procedencia());
    }
}
