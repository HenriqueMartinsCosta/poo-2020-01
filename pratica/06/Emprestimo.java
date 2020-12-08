import java.util.Calendar;

public class Emprestimo {
    
    private Livro obra;
    private Pessoa funcionario;
    private Pessoa usuario;
    private Calendar data;

    public Emprestimo(Livro obra, Pessoa funcionario, Pessoa usuario, Calendar data) {

        setObra(obra);
        setFuncionario(funcionario);
        setUsuario(usuario);
        setData(data);

    }

    public String toString() {

        return "Livro emprestado: " + obra.toString() + '\n'
            + "Funcionário: " + funcionario.getNome() + '\n'
            + "Usuario: " + usuario.getNome() + '\n'
            + "Data: " + data.get(Calendar.DAY_OF_MONTH) + '/' + data.get(Calendar.MONTH) + '/' + data.get(Calendar.YEAR);

    }

    public void setObra(Livro obra) {

        this.obra = obra;

    }

    public void setFuncionario(Pessoa funcionario) {

        this.funcionario = funcionario;

    }

    public void setUsuario(Pessoa usuario) {

        this.usuario = usuario;

    }

    public void setData(Calendar data) {

        this.data = data;

    }

    public Livro getObra() {

        return obra;

    }

    public Pessoa getFuncionario() {

        return funcionario;

    }

    public Pessoa getUsuario() {

        return usuario;

    }

    public Calendar getData() {

        return data;

    }

}
