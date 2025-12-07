public interface Promocional {
    // permite aplicar um desconto dinâmico no produto
    void aplicarDesconto(double porcentagem);
    boolean temDesconto();
}
