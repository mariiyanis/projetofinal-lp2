public class ChaGelado implements Produtos {
    private static double precoBase = 5.00; 
    
    private double preco;
    private ChaSabor sabor;
    private String nome;

    ChaGelado(int i) {
        setSabor(i);
        setPreco(precoBase);
        setNome();
    }

    public static void setPrecoBase(double novo) {
        precoBase = novo;
    }

    public void setSabor(int i) {
        if(i == 1) this.sabor = ChaSabor.PESSEGO;
        else if(i == 2) this.sabor = ChaSabor.LIMAO_ABACAXI_HORTELA; 
        else this.sabor = ChaSabor.MACA; 
    }

    public void setNome() { this.nome = "Cha Gelado"; }
    public void setPreco(double preco) { this.preco = preco; }

    @Override public String getNome() { return this.nome; }
    @Override public double getPreco() { return this.preco; }
    @Override public void imprime() { System.out.print(this.sabor); }
    @Override public void exibirNome() { System.out.print("Cha " + this.sabor + " - R$ " + String.format("%.2f", this.preco)); }
}
