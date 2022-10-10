package balcao;

//Criando a classe concreta para uso do padrão strategy junto com decorator
public abstract class Bebidas {
    
    protected String nome;
    protected float preco;
    protected String cor;
    protected String mesa_name;

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public String getMesa() {
        return mesa_name;
    }

    public void setMesa(String mesa_name) {
        this.mesa_name = mesa_name;

        System.out.println(getMesa() + " pediu " + getNome() + ". Total: R$: " + getPreco());
    }
}