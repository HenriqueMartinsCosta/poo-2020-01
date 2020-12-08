import java.util.ArrayList;

public class Pessoa {
    private String nome;
    private ArrayList<Telefone> telefones = new ArrayList<Telefone>();
    boolean existe = false;
    String listaTelefones;
    
    public Pessoa(String nome) {
        
        setNome(nome);
        
    }
    

    public String toString() {

        listaTelefones = "";

        for (int i = 0; i < telefones.size(); i++) {

            listaTelefones += telefones.get(i);

            if (i == telefones.size() - 1) {

                listaTelefones += '\n';

            } else {

                listaTelefones += ", ";

            }

        }

        return "Nome: " + getNome() + '\n' + "Telefones: " + listaTelefones;

    }

    public String getNome() {

        return nome;

    }

    public void setNome(String nome) {

        this.nome = nome;

    }


    public void adicionaTelefone(Telefone telefone) {
        
        existe = false;

        for (int i = 0; i < telefones.size(); i++) {

            if (telefones.get(i).toString() == telefone.toString()){

                existe = true;
                break;

            }

        }

        if (!existe) {

            telefones.add(telefone);

        }

    }

    public void removeTelefone(Telefone telefone) {

        telefones.remove(telefone);

    }
}