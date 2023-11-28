import java.util.Scanner;

public class Exer26{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número:");
        int numero = scanner.nextInt();

        int produto = 1;

        for (int i = 1; i <= numero; i++) {
            produto *= i;
            System.out.print(i + " ");
            
        }

        System.out.println(" = " + produto);
    }
}