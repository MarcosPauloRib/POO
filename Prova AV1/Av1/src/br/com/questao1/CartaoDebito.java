package br.com.questao1;

public class CartaoDebito extends Pagamento{
    private String numCartao;
    private String titularCartao;

    public CartaoDebito(String dataHoraPagamento, int numeroPagamento, double valorPago, String numCartao, String titularCartao) {
        super(dataHoraPagamento, numeroPagamento, valorPago);
        this.numCartao = numCartao;
        this.titularCartao = titularCartao;
    }
    //Comentei pois ao criar o objeto do tipo CartãoDebito sempre puxava desta classe e os atributos da classe Pagamento ficavam em branco, apenas os atributos de CartãoDebito recebiam valores.
    /*public CartaoDebito(String numCartao, String titularCartao) {
        this.numCartao = numCartao;
        this.titularCartao = titularCartao;
    }*/

    public String getNumCartao() {
        return numCartao;
    }

    public void setNumCartao(String numCartao) {
        this.numCartao = numCartao;
    }

    public String getTitularCartao() {
        return titularCartao;
    }

    public void setTitularCartao(String titularCartao) {
        this.titularCartao = titularCartao;
    }

    @Override
    public String imprimirCupomFiscal() {
        return "Hora e data do pagamento: " + getDataHoraPagamento() + "Numero do pagamento: " + getNumeroPagamento() + "Valor pago: " + getValorPago() + "Numero do cartão" + getNumCartao() + "Titular do cartão" + getTitularCartao();
    }
}
