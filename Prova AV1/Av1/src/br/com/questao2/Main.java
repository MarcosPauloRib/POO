package br.com.questao2;

public class Main {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Marcos", "Marcos@hotmail.com", "password", 3, 7);
        System.out.println(a1.mostraAluno());

        Professor p1 = new Professor("Augusto", "Augusto@hotmail.com", "Password", 3000, 30);
        System.out.println(p1.mostraProfessor());
    }
}
