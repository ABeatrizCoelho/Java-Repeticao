import java.util.Scanner;

public class Exer11 {

	public static void main(String[] args) {
		Scanner e = new Scanner(System.in);
		for(int i = 0; i<=10;i++) {
			System.out.print("Digite o número: ");
			double num = e.nextDouble();
			double div = num / 2;
			System.out.println("Numero: " + num + " Metade: " + div);
		}

	}

}
