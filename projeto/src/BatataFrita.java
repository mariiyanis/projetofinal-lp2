public class BatataFrita implements Produtos {
    // variável estática p/ manter o preço atualizado globalmente
    private static double precoBase = 9.00; 
    
    private double preco;
    private String nome;

    BatataFrita() {
        setNome("Batata Frita");
        setPreco(precoBase); // usa o preço base configurado pelo admin
    }

    public static void setPrecoBase(double novo) {
        precoBase = novo;
    }

    public void setNome(String nome) { this.nome = nome; }
    public String getNome() { return nome; }

    @Override
    public void imprime() { System.out.print("Batata Frita"); }

    @Override
    public void exibirNome() {
        System.out.print("Batata Frita - R$ " + String.format("%.2f", this.preco));
    }

    public void setPreco(double preco) { this.preco = preco; }
    public double getPreco() { return preco; }
}
