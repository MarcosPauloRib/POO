package questao2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o valor inicial do questao2.Rendimento: ");
        double vrInicial = ler.nextDouble();

        System.out.println("Digite a taxa de juros:");
        double txJuros = ler.nextDouble();

        System.out.println("Digite o numero de meses para o questao2.Rendimento:");
        int numMeses = ler.nextInt();

        Rendimento r1 = new Rendimento(vrInicial, txJuros, numMeses);
        r1.calculaRendimento();



        /*questao2.Rendimento rendimento1 = new questao2.Rendimento();
        System.out.println("Insira o valor do investimento: ");
        rendimento1 = ler.nextInt();*/
    }
}