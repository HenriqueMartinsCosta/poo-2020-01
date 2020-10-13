import java.util.Scanner;

public class OpString {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite uma frase: ");

        String input = entrada.nextLine();
        
        entrada.close();

        System.out.println("Tamanho da string: " + input.length());
        System.out.println("String para minúsculo: " + input.toLowerCase());
        System.out.println("String para maiúsculo: " + input.toUpperCase());
    }
}
