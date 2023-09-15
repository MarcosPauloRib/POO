package questao1;

public class Estoque {

    private String nome;
    private int qtdAtual;
    private int qtdMinima;

    public Estoque() {
    }

    public Estoque(String nome, int qtdAtual, int qtdMinima) {
        this.nome = nome;
        this.qtdAtual = qtdAtual;
        this.qtdMinima = qtdMinima;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtdAtual() {
        return qtdAtual;
    }

    public void setQtdAtual(int qtdAtual) {
        this.qtdAtual = qtdAtual;
    }

    public int getQtdMinima() {
        return qtdMinima;
    }

    public void setQtdMinima(int qtdMinima) {
        this.qtdMinima = qtdMinima;
    }

    public void darBaixa(int qtde){
        if(qtde <= qtdAtual) {
            qtdAtual = qtdAtual - qtde;
        }
    }

    public String mostra(){
        return "Produto: " + getNome() + "\n" + "Quantidade: " + getQtdAtual() + "\n" + "Quantidade mínima: " + getQtdMinima();
    }

    public boolean precisaRepor(){
        if(getQtdAtual() <= qtdMinima){
            return true;
        }
        else {
            return false;
        }
    }
}