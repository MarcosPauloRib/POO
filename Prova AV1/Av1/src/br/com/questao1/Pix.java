package br.com.questao1;

public class Pix extends Pagamento{
    private boolean comprovanteTransacaoPix;

    public Pix(String dataHoraPagamento, int numeroPagamento, double valorPago, boolean comprovanteTransacaoPix) {
        super(dataHoraPagamento, numeroPagamento, valorPago);
        this.comprovanteTransacaoPix = comprovanteTransacaoPix;
    }

    //Comentei pois ao criar o objeto do tipo Pix sempre puxava desta classe e os atributos da classe Pagamento ficavam em branco, apenas os atributos de Pix recebiam valores.
    /*public Pix(boolean comprovanteTransacaoPix) {
        this.comprovanteTransacaoPix = comprovanteTransacaoPix;
    }*/

    public boolean isComprovanteTransacaoPix() {
        return comprovanteTransacaoPix;
    }

    public void setComprovanteTransacaoPix(boolean comprovanteTransacaoPix) {
        this.comprovanteTransacaoPix = comprovanteTransacaoPix;
    }

    @Override
    public String imprimirCupomFiscal() {
        return "Hora e data do pagamento: " + getDataHoraPagamento() + "Numero do pagamento: " + getNumeroPagamento() + "Valor pago: " + getValorPago() + "Comprovante de pix: " + isComprovanteTransacaoPix();
    }
}
