import java.util.Calendar;

public class TestaEmprestimo {
    
    public static void main(String[] args) {
        
        Editora editora = new Editora("Broadway Books", "USA");
        Pessoa autor = new Pessoa("Ernest Cline", 1972);
        Livro livro = new Livro("Ready Player One", autor, editora, 2011);

        Pessoa funcionario = new Pessoa("João", 1930);
        Pessoa usuario = new Pessoa("Henrique", 2001);
        Calendar data = Calendar.getInstance();
        Emprestimo emprestimo = new Emprestimo(livro, funcionario, usuario, data);

        System.out.println(emprestimo);

    }

}
