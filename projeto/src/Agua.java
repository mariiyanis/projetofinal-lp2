public class Agua implements Produtos {
    // variáveis p/ crud update
    private static double precoBase1 = 2.00; // sem gás 500ml
    private static double precoBase2 = 3.00; // com gás 500ml
    private static double precoBase3 = 5.00; // sem gás 1L

    private double preco;
    private Aguas agua;
    private String nome;

    Agua(int i) {
        setAgua(i);
        // variáveis estáticas alteráveis pelo admin
        if(i == 1) setPreco(precoBase1);
        else if(i == 2) setPreco(precoBase2);
        else if(i == 3) setPreco(precoBase3);
        else System.out.print("erro no set preco");
        setNome();
    }

    public static void atualizarPrecoBase(int tipo, double novoValor) {
        if(tipo == 1) precoBase1 = novoValor;
        else if(tipo == 2) precoBase2 = novoValor;
        else if(tipo == 3) precoBase3 = novoValor;
    }

    public void setAgua(int i) {
        if(i == 1) this.agua = Aguas.SEM_GAS_500ml;
        else if(i == 2) this.agua = Aguas.COM_GAS_500ml;
        else if(i == 3) this.agua = Aguas.SEM_GAS_1L;
    }

    public void setNome() { this.nome = "Agua"; }
    public void setPreco(double preco) { this.preco = preco; }
    
    @Override public String getNome() { return this.nome; }
    @Override public double getPreco() { return this.preco; }
    @Override public void imprime() { System.out.print(this.agua); }
    @Override public void exibirNome() { System.out.print(this.agua + " - R$ " + String.format("%.2f", this.preco)); }
}
