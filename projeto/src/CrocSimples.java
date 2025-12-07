import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CrocSimples implements Produtos{
    private ArrayList<IngredientesCroc> ingredientesCrocs;
    private double preco;
    private String nome;

    CrocSimples(){
        ingredientesCrocs = new ArrayList<>();
        setIngredientesCrocs(1);
        setPreco(15.00);
        setNome("Croc Simples\n");
    }
    CrocSimples(int i){
        ingredientesCrocs = new ArrayList<>();
        if(i == 2){
            setNome("Croc Parmegiana\n");
        } else if( i == 3){
            setNome("Croc Americano\n");
        }
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double valor){
        preco = valor;
    }
    public void setIngredientesCrocs(int i){
        if(i == 1){
            for(int j = 0; j < 5; j++){
                ingredientesCrocs.add(IngredientesCroc.values()[j]);
            }
            setPreco(15.00);
        } else if(i == 2){
            for(int j = 0; j < 7; j++){
                ingredientesCrocs.add(IngredientesCroc.values()[j]);
            }
            setPreco(16.00);
        } else if(i == 3){
            for(int j = 0; j < 5; j++){
                ingredientesCrocs.add(IngredientesCroc.values()[j]);
            }
            for (int j = 7; j < 10; j++){
                ingredientesCrocs.add(IngredientesCroc.values()[j]);
            }
            setPreco(16.50);
        }
    }

    public String getNome() {
        return nome;
    }

    void remove(IngredientesCroc ingrediente){
        ingredientesCrocs.remove(ingrediente);
    }

    @Override
    public void imprime(){
        exibirNome();
        for(IngredientesCroc ingredientes1 : ingredientesCrocs){
            System.out.print(ingredientes1+"\n");
        }
        System.out.print("Preço: "+getPreco()+"\n");
    }

    @Override
    public void exibirNome() {
        System.out.print(getNome());
    }

    @Override
    public double getPreco() {
        return preco;
    }

}
