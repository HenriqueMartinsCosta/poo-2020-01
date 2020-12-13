public class Motorista {
    
    private String nome;
    private String codigo;

    public Motorista(String nome, String codigo) {

        setNome(nome);
        setCodigo(codigo);

    }

    public String toString() {

        return getNome() + " (" + getCodigo() + ")";

    }

    public void setNome(String nome) {

        this.nome = nome;

    }

    public String getNome() {

        return nome;

    }

    public void setCodigo(String codigo) {

        this.codigo = codigo;

    }

    public String getCodigo() {

        return codigo;
        
    }

}
