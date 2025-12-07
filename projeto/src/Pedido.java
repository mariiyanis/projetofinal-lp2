import java.util.ArrayList;

public class Pedido {
    private ArrayList<Produtos> listaProdutos;
    private int id;
    private String nomeCliente;

    // construtor padrão
    public Pedido() {
        this.listaProdutos = new ArrayList<>();
    }

    // construtor completo
    public Pedido(int id, String nome, ArrayList<Produtos> lista) {
        this.id = id;
        this.nomeCliente = nome;
        this.listaProdutos = lista;
    }

    public int getId() {
        return this.id;
    }

    public String getNome() {
        return this.nomeCliente;
    }

    // main chama getValorFinal(), então aqui está ele retornando o total
    public double getValorFinal() {
        return getValorTotal();
    }

    public void adicionarItem(Produtos p) {
        listaProdutos.add(p);
    }

    // método necessário pro crud (delete)
    public void removerItem(int index) {
        if (index >= 0 && index < listaProdutos.size()) {
            Produtos p = listaProdutos.remove(index);
            System.out.println(">> Item removido: " + p.getNome());
        } else {
            System.out.println("Índice inválido.");
        }
    }

    public int getQuantidadeItens() {
        return listaProdutos.size();
    }

    public double getValorTotal() {
        double total = 0;
        for (Produtos p : listaProdutos) {
            total += p.getPreco();
        }
        return total;
    }

    public void imprime() {
        System.out.println("===== Pedido =====");
        if(listaProdutos.isEmpty()){
            System.out.println("Carrinho vazio.");
        } else {
            for (int i = 0; i < listaProdutos.size(); i++) {
                Produtos p = listaProdutos.get(i);
                if(p != null) {
                    System.out.print("[" + i + "] ");
                    p.exibirNome();
                    System.out.println();
                }
            }
        }
        System.out.println("Total: R$ " + String.format("%.2f", getValorTotal()));
    }

    // alguns getters auxiliares p/ compatibilidade
    public ArrayList<Produtos> getProdutos() { return listaProdutos; }
    public void listarProdutos() { imprime(); }
}
