import java.util.Scanner;

public class Soma {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Insira dois números para serem somados: ");

        int primeiro, segundo, resultado;

        primeiro = entrada.nextInt();
        segundo = entrada.nextInt();
        
        entrada.close();
        
        resultado = primeiro + segundo;
        
        System.out.println("Resultado: " + resultado);
    }
}
