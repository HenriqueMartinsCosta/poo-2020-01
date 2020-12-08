public class TestaPessoaTelefone {
    
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa("Zeca");

        pessoa.adicionaTelefone(new Telefone("12 91234-1234"));
        pessoa.adicionaTelefone(new Telefone("12 91234-1234"));
        pessoa.adicionaTelefone(new Telefone("12 94321-1234"));
        pessoa.adicionaTelefone(new Telefone("12 91234-4321"));
        pessoa.adicionaTelefone(new Telefone("12 94321-4321"));

        System.out.println(pessoa.toString());

    }

}
