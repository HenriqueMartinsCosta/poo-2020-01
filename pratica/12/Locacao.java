import java.util.Date;

public class Locacao {
    
    private Date dataInicial;
    private Date dataFinal;
    private int kmInicial;
    private int kmFinal;
    private float precoKm;
    private float precoDia;
    private Motorista motorista;
    private Carro carro;

    public double obtemCusto() {
        // Obtém números de dias transcorridos
        long nDias = dataFinal.getTime() - dataInicial.getTime();
        nDias = nDias / (1000 * 60 * 60 * 24);
        
        return (kmFinal - kmInicial) * precoKm + nDias * precoDia;
    }

    public String toString() {
        String saida = "Motorista: ";
        saida += getMotorista().toString() + "\n";
        saida += "Carro: " + getCarro().toString() + "\n";
        saida += "Quilometragem inicial: " + getKmInicial();
        saida += ", final: " + getKmFinal() + "\n";
        saida += "Data locacao: " + getDataInicial().toString();
        saida += ", entrega: " + getDataFinal().toString() + "\n";
        saida += "R$/km: " + getPrecoKm() + ", R$/dia: " + getPrecoDia();
        saida += "\nCusto da locacao: " + obtemCusto();

        return saida;
    }

    public void setDataInicial(Date data) {

        this.dataInicial = data;

    }

    public Date getDataInicial() {

        return dataInicial;

    }

    public void setDataFinal(Date data) {

        this.dataFinal = data;

    }

    public Date getDataFinal() {

        return dataFinal;

    }

    public void setKmInicial(int km) {

        this.kmInicial = km;

    }

    public int getKmInicial() {

        return kmInicial;

    }

    public void setKmFinal(int km) {

        this.kmFinal = km;

    }

    public int getKmFinal() {

        return kmFinal;

    }

    public void setPrecoKm(float preco) {

        this.precoKm = preco;

    }

    public float getPrecoKm() {

        return precoKm;

    }

    public void setPrecoDia(float preco) {

        this.precoDia = preco;

    }

    public float getPrecoDia() {

        return precoDia;

    }

    public void setMotorista(Motorista motorista) {

        this.motorista = motorista;

    }

    public Motorista getMotorista() {

        return motorista;

    }

    public void setCarro(Carro carro) {

        this.carro = carro;

    }

    public Carro getCarro() {

        return carro;

    }

}
