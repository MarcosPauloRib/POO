package br.com.questao2;

public class Main {
    public static void main(String[] args) {
        FComissionado fc1 = new FComissionado(2, "Marcos", 1500, 2, 10000);
        System.out.println(fc1.toString());

        FPadrao fp1 = new FPadrao(1, "Jennifer", 1000);
        System.out.println(fp1.toString());

        FProdutividade fpr1 = new FProdutividade(3, "Julia", 1200, 0.50, 100);
        System.out.println(fpr1.toString());
    }
}
