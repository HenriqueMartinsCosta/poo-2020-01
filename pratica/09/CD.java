import java.util.ArrayList;
import java.util.Date;

public class CD {
    
    private String nome;
    private Date lancamento;
    private ArrayList <Pessoa> cantores = new ArrayList<Pessoa>();

    public CD(String nome, Date lancamento, Pessoa cantor) {
        setNome(nome);
        setlancamento(lancamento);
        adicionaCantor(cantor);
    }

    public void adicionaCantor(Pessoa cantor) {
        cantores.add(cantor);
    }

    public Pessoa removeCantor(int ordem) {
        return (Pessoa)(cantores.remove(ordem));
    }

    public String toString() {
        String saida = "CD: " + nome + "\nCantores: ";

        for (int i = 0; i < cantores.size(); i++) {

            saida += cantores.get(i).toString();
            
            if (i == cantores.size() - 1) {

                saida += '\n';

            } else {

                saida += ", ";

            }

        }

        saida += "Data de Lançamento: " + lancamento.toString() + '\n';

        return saida;
    }

    public Date getlancamento() {
        return lancamento;
    }

    public void setlancamento(Date lancamento) {
        this.lancamento = lancamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
