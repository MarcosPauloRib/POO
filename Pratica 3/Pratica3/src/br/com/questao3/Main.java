package br.com.questao3;

public class Main {
    public static void main(String[] args) {
        Caminhao c1 = new Caminhao("GOX1540", 2007, 4);
        System.out.println(c1.toString());

        Onibus o1 = new Onibus("UHF6503", 2010, 23);
        System.out.println(o1.toString());


    }
}
