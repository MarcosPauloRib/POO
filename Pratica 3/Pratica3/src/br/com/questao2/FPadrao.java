package br.com.questao2;

public class FPadrao extends Funcionario {

    public FPadrao(int matricula, String nome, double salario) {
        super(matricula, nome, salario);
    }

    public double calcularProvento(){
        return getSalario();
    }
}
