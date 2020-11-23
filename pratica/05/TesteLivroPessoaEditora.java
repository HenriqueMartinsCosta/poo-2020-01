public class TesteLivroPessoaEditora {
    
    public static void main(String[] args) {
        
        Pessoa pessoa = new Pessoa("René Descartes", 1596);

        Editora editora = new Editora("Martin Claret", "Rua Alegrete, 62, Bairro Sumaré");

        Livro livro = new Livro("Discurso do Método", pessoa, editora, 2002);

        System.out.println(livro);
        
    }

}
