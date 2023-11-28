import java.util.Scanner;

public class Exer21 {

	public static void main(String[] args) {
		Scanner e = new Scanner(System.in);
		int numero;
		 for(int i = 0; i < 5; i++) {
			 System.out.println("Digite o numero " + (i + 1));
			 numero = e.nextInt();
			 System.out.println(Math.pow(numero,2));
		 }

	}

}
