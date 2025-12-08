public class Sorvete implements Produtos, Promocional {
    private static double precoBase = 3.50;
    private double preco;
    private SorveteSabor sabor;
    private String nome;
    private boolean descontoAtivo = false;

    Sorvete(int i) {
        setSabor(i);
        setPreco(precoBase);
        nome = "Sorvete";
    }

    public static void setPrecoBase(double novo) { precoBase = novo; }

    // métodos da interface promocional
    @Override public void aplicarDesconto(double porcentagem) {
        this.preco = this.preco - (this.preco * (porcentagem / 100));
        this.descontoAtivo = true;
    }
    @Override public boolean temDesconto() { return descontoAtivo; }

    public void setSabor(int i) {
        if(i == 1) this.sabor = SorveteSabor.CHOCOLATE;
        else if(i == 2) this.sabor = SorveteSabor.MISTO; 
        else if(i == 3) this.sabor = SorveteSabor.CREME;
    }

    public void setPreco(double preco) { this.preco = preco; }
    @Override public String getNome() { return this.nome; }
    @Override public double getPreco() { return this.preco; }
    @Override public void imprime() { System.out.print(this.sabor); }
    @Override public void exibirNome() { System.out.print("Sorvete " + this.sabor + " - R$ " + String.format("%.2f", this.preco)); }
}
