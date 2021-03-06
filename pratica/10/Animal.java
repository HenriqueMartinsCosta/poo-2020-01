import java.util.Map;
import java.util.HashMap;

public class Animal {
    
    private String nome;
    private Map<String, Animal> amigos;
    
    public Animal(String nome) {
        
        setNome(nome);
        amigos = new HashMap<>();
        
    }

    public String toString() {

        return getNome();

    }

    public String amigosAnimal() {

        return amigos.toString();

    }

    public String getNome() {

        return nome;

    }

    public void setNome(String nome) {

        this.nome = nome;

    }

    public void adicionaAmigo(Animal amigo) {

        if (!amigos.containsKey(amigo.getNome())) {

            amigos.put(amigo.getNome(), amigo);
            amigo.adicionaAmigo(this);

        }
    }

    public void removeAmigo(Animal amigo) {

        if (amigos.containsKey(amigo.getNome())) {

            removeAmigo(amigo.getNome());
            amigo.removeAmigo(this);

        }

    }

    public void removeAmigo(String nomeAmigo) {

        amigos.remove(nomeAmigo);

    }
}