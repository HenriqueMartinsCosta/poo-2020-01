public class Livro {
    
    private String titulo;
    private String autor;
    private int ano;
    private String editora;

    public String toString() {

        return getTitulo() + '\n' + getAutor() + '\n' + getEditora() + ", " + getAno();

    }

    public Livro(String titulo, String autor, String editora, int ano) {

        setTitulo(titulo);
        setAutor(autor);
        setEditora(editora);
        setAno(ano);

    }

    public void setTitulo(String titulo) {

        this.titulo = titulo;

    }

    public void setAutor(String autor) {

        this.autor = autor;

    }

    public void setAno(int ano) {

        this.ano = ano;

    }

    public void setEditora(String editora) {

        this.editora = editora;

    }

    public String getTitulo() {

        return titulo;

    }

    public String getAutor() {

        return autor;

    }

    public int getAno() {

        return ano;

    }

    public String getEditora() {

        return editora;

    }

}
