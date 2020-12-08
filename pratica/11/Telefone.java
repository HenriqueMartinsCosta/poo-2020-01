public class Telefone {
    
    private String numero;

    public Telefone(String numero) {

        setNumero(numero);

    }
    
    public String toString() {

        return getNumero();
        
    }
    
    public void setNumero(String numero) {

        if (numero.matches("^([1-9]{2}) (?:[2-8]|9[1-9])[0-9]{3}-[0-9]{4}$")) {

            this.numero = numero;

        }

    }
    
    public String getNumero() {

        return numero;

    }

}
