import java.util.ArrayList;

public class RedeSocial extends Publicacao{
    private String dataCriacao;
    private String nomeUsuario;
    private String dataNascimento;
    private String senha;

    public RedeSocial(String dataCriacao, String nomeUsuario, String dataNascimento, String senha) {
        this.dataCriacao = dataCriacao;
        this.nomeUsuario = nomeUsuario;
        this.dataNascimento = dataNascimento;
        this.senha = senha;
    }

    ArrayList<Publicacao> publicacoes = new ArrayList<>();

    public void inserePublicacao(Publicacao publi){

    }

    public void imprimePublicacoes(){
        getContadorPublicacao();
    }
}
