import java.util.Calendar;

public class TestaLocacao {
    
    public static void main(String[] args) {
        
        Motorista motorista1 = new Motorista("Ze", "1");
        Carro carro1 = new Carro("AAA 1111");
        
        Calendar c1 = Calendar.getInstance();
        Locacao locacao1 = new Locacao();
        c1.set(2020,11,13);
        locacao1.setDataInicial(c1.getTime());
        c1.set(2020,11,17);
        locacao1.setDataFinal(c1.getTime());
        locacao1.setKmInicial(150);
        locacao1.setKmFinal(490);
        locacao1.setPrecoDia(32);
        locacao1.setPrecoKm(1.2F);
        locacao1.setCarro(carro1);
        locacao1.setMotorista(motorista1);

        System.out.println(locacao1);
        System.out.println('\n');

        Motorista motorista2 = new Motorista("Alberto", "2");
        Carro carro2 = new Carro("BBB 2222");

        Calendar c2 = Calendar.getInstance();
        Locacao locacao2 = new Locacao();
        c2.set(2021,0,10);
        locacao2.setDataInicial(c2.getTime());
        c2.set(2021,0,14);
        locacao2.setDataFinal(c2.getTime());
        locacao2.setKmInicial(60);
        locacao2.setKmFinal(340);
        locacao2.setPrecoDia(28);
        locacao2.setPrecoKm(1.4F);
        locacao2.setCarro(carro2);
        locacao2.setMotorista(motorista2);

        System.out.println(locacao2);
    }

}
