public class Carro {

    private String placa;

    public Carro(String placa) {

        setPlaca(placa);

    }
    
    public String toString() {

        return getPlaca();

    }
    
    public void setPlaca(String placa) {

        this.placa = placa;

    }
    
    public String getPlaca() {

        return placa;
        
    }

}