package br.com.questao2;

public class FProdutividade extends Funcionario{
    private double valor;
    private int producao;

    public FProdutividade(int matricula, String nome, double salario, double valor, int producao) {
        super(matricula, nome, salario);
        this.valor = valor;
        this.producao = producao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getProducao() {
        return producao;
    }

    public void setProducao(int producao) {
        this.producao = producao;
    }

    public double calcularProvento(){
        return getSalario() + (getProducao() * getValor());
    }

    public String toString(){
        return ("Nome: " + getNome() + "\n" + "Matrícula: " + getMatricula() + "\n" + "Salário: " + calcularProvento());
    }
}
