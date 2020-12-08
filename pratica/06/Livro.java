public class Livro {
    
    private String titulo;
    private Pessoa autor;
    private int ano;
    private Editora editora;

    public String toString() {

        return getTitulo() + ", " + getAutor().getNome() + ", " + getEditora().getNome() + ", " + getAno();

    }

    public Livro(String titulo, Pessoa autor, Editora editora, int ano) {

        setTitulo(titulo);
        setAutor(autor);
        setEditora(editora);
        setAno(ano);

    }

    public void setTitulo(String titulo) {

        this.titulo = titulo;

    }

    public void setAutor(Pessoa autor) {

        this.autor = autor;

    }

    public void setAno(int ano) {

        this.ano = ano;

    }

    public void setEditora(Editora editora) {

        this.editora = editora;

    }

    public String getTitulo() {

        return titulo;

    }

    public Pessoa getAutor() {

        return autor;

    }

    public int getAno() {

        return ano;

    }

    public Editora getEditora() {

        return editora;

    }

}
