package br.com.questao1;

public class Main {
    public static void main(String[] args) {
        Normal n1 = new Normal(100.0);
        n1.imprimeIngresso();

        Vip v1 = new Vip(100.0, 50.0);
        v1.imprimeIngresso();

        Camarote c1 = new Camarote(100.0, 100, "Setor B");
        c1.imprimeIngresso();
    }
}