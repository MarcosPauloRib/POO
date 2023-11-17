import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AtualizandoBDGUI extends JFrame {
    JPanel painel =new JPanel();

    JButton jButtonInserir = new JButton("Inserir dados");
    JButton jButtonExcluir = new JButton("Excluir dados");
    JButton jButtonConsultar = new JButton("Consultar dados");

    public AtualizandoBDGUI(){
        this.setTitle("Atualizando BD");
        this.setSize(400, 200);
        painel.setLayout(new FlowLayout(FlowLayout.CENTER, 100, 20));
        painel.setBackground(new Color(255, 255, 255));

        jButtonInserir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String id_isbn, nm_titulo;
                    int id_categoria, id_editora;
                    Double vl_preco;

                    id_isbn = JOptionPane.showInputDialog("Digite ISBN");
                    nm_titulo = JOptionPane.showInputDialog("Digite titulo");
                    id_categoria = Integer.parseInt(JOptionPane.showInputDialog("Digite o código da categoria"));
                    id_editora = Integer.parseInt(JOptionPane.showInputDialog("Digite o código da editora"));
                    vl_preco = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço do livro"));
                    Inserir inserir = new Inserir(id_isbn, id_categoria, id_editora, nm_titulo, vl_preco);
                } catch (Exception exception) {
                    System.err.println("Erro!");
                }
            }
        });

        jButtonExcluir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    String cod_excluir;
                    cod_excluir = JOptionPane.showInputDialog("Digite id_isbn para excluir");
                    Excluir excluir = new Excluir(cod_excluir);
                }catch (Exception exception){
                    System.out.println("Erro!");
                }
            }
        });

        jButtonConsultar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    String buscaTitulo;
                    Double buscaValor;

                    Consulta busca = new Consulta();
                    buscaTitulo = JOptionPane.showInputDialog("Digite Título para buscar");
                    busca.BuscaTitulo(buscaTitulo);

                    //Consulta por valor
                    buscaValor =Double.parseDouble( JOptionPane.showInputDialog("Digite Titutlo para buscar"));
                    busca.BuscaValor(buscaValor);
                }catch(Exception exception){
                    System.out.println("Erro!");
                }
            }
        });

        painel.add(jButtonInserir);
        painel.add(jButtonExcluir);
        painel.add(jButtonConsultar);

        this.getContentPane().add(painel);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main(String[] args) {new AtualizandoBDGUI();}
}
