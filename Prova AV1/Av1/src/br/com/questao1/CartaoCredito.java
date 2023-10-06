package br.com.questao1;

public class CartaoCredito extends Pagamento{
    private String numCartao;
    private String bandeiraCartao;
    private String titularCartao;

    public CartaoCredito(String dataHoraPagamento, int numeroPagamento, double valorPago, String numCartao, String bandeiraCartao, String titularCartao) {
        super(dataHoraPagamento, numeroPagamento, valorPago);
        this.numCartao = numCartao;
        this.bandeiraCartao = bandeiraCartao;
        this.titularCartao = titularCartao;
    }

    //Comentei pois ao criar o objeto do tipo CartãoCredito sempre puxava desta classe e os atributos da classe Pagamento ficavam em branco, apenas os atributos de CartãoCredito recebiam valores.
    /*public CartaoCredito(String numCartao, String bandeiraCartao, String titularCartao) {
        this.numCartao = numCartao;
        this.bandeiraCartao = bandeiraCartao;
        this.titularCartao = titularCartao;
    }*/

    public String getNumCartao() {
        return numCartao;
    }

    public void setNumCartao(String numCartao) {
        this.numCartao = numCartao;
    }

    public String getBandeiraCartao() {
        return bandeiraCartao;
    }

    public void setBandeiraCartao(String bandeiraCartao) {
        this.bandeiraCartao = bandeiraCartao;
    }

    public String getTitularCartao() {
        return titularCartao;
    }

    public void setTitularCartao(String titularCartao) {
        this.titularCartao = titularCartao;
    }

    @Override
    public String imprimirCupomFiscal() {
        return "Hora e data do pagamento: " + getDataHoraPagamento() + "\n" + "Numero do pagamento: " + getNumeroPagamento() + "\n" + "Valor pago: " + getValorPago() + "\n" + "Número do cartão: " + getNumCartao() + "\n" + "Bandeira do cartão:" + getBandeiraCartao() + "\n" + "Titular do cartão:" + getTitularCartao() + "\n";
    }
}
