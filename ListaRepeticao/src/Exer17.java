import java.util.Scanner;

public class Exer17 {

	public static void main(String[] args) {
		Scanner e = new Scanner(System.in);
		int i = 1;
		
		while(i % 6 != 0) {
			System.out.println("Digite um valor");
			i = e.nextInt();
			System.out.println(Math.pow(i, 2));
		}
		System.out.println("O numero que voce digitou é multiplo de 6, portando, o programa foi finalizado");		
	}

}
