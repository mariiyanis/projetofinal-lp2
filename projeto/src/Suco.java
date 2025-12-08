public class Suco implements Produtos {
    // variável estática p/ admin alterar 
    private static double precoBase = 6.00;
    
    private double preco;
    private Sucos suco;
    private String nome;

    Suco(int i) {
        setSuco(i);
        setPreco(precoBase); // usa o preço dinâmico
        setNome();
    }

    // método para o Admin
    public static void setPrecoBase(double novo) {
        precoBase = novo;
    }

    public void setSuco(int i) {
        if(i == 1) this.suco = Sucos.LARANJA_NATURAL;
        else if(i == 2) this.suco = Sucos.DELL_UVA;      
        else if(i == 3) this.suco = Sucos.DELL_LARANJA;  
    }

    public void setNome() { this.nome = "Suco"; }
    public void setPreco(double preco) { this.preco = preco; }

    @Override public String getNome() { return this.nome; }
    @Override public double getPreco() { return this.preco; }
    @Override public void imprime() { System.out.print(this.suco); }
    @Override public void exibirNome() { System.out.print("Suco " + this.suco + " - R$ " + String.format("%.2f", this.preco)); }
}
