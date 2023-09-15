package questao1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);

        System.out.println("Insira o nome do produto: ");
        String nomeProduto = ler.nextLine();

        System.out.println("Insira a quantidade atual: ");
        int estoqueAtual = ler.nextInt();

        System.out.println("Insira a quantidade mínima: ");
        int estoqueMin = ler.nextInt();

        Estoque e1 = new Estoque(nomeProduto, estoqueAtual, estoqueMin);
        System.out.println("Insira a quantidade a diminuir: ");
        int qtde = ler.nextInt();
        e1.darBaixa(qtde);

        System.out.println(e1.mostra());

        System.out.println(e1.precisaRepor());

    }
}
