package br.com.questao1;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        CartaoCredito c1 = new CartaoCredito("15.45", 1, 15.25, "20", "MasterCard", "Marcos");
        System.out.println(c1.imprimirCupomFiscal());

        Pix p1 = new Pix("13.30", 13, 23.52, true);
        System.out.println(p1.imprimirCupomFiscal());

        CartaoDebito cd1 = new CartaoDebito("20.00", 51, 50.00, "81", "Rogério");
        System.out.println(cd1.imprimirCupomFiscal());
    }
}