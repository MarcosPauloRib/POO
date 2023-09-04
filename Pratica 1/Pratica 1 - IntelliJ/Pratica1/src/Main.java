//import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Scanner ler = new Scanner(System.in);

        String nome;
        double salario;
        int horasAula;

        System.out.println("nome: ");
        nome = ler.nextLine();
        System.out.println("Salário: ");
        salario = ler.nextDouble();
        System.out.println("Horas Aula: ");
        horasAula = ler.nextInt();*/

        System.out.println("\n*************EmpregoFaculdade**********");

        EmpregoFaculdade ef1 = new EmpregoFaculdade("Marcos", 2900, 28);

        System.out.println("\n" + ef1.getGastos());
        System.out.println("\n" + ef1.getInfo());

        System.out.println("\n*******************Aluno****************");

        {
            Aluno A1 = new Aluno("Marcos", 235, 15, 30, 75, "ADS", 3);
            System.out.println("\n" + A1.avaliarAluno());
            System.out.println("\n" + A1.avaliarRecuperacao());
        }
    }
}