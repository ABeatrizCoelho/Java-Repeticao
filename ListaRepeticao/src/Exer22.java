import java.util.Scanner;

public class Exer22 {

	public static void main(String[] args) {
		Scanner e = new Scanner(System.in);
		int valorN, valorB;
		while(true) {
			System.out.println("Digite o valor de n(maior que um e inteiro) ou 0 para encerrar");
			valorN = e.nextInt();
			if(valorN == 0) {
				System.out.println("programa encerrado");
				break;
			}
			System.out.println("Digite o valor de b(maior ou igual a 2 e inteiro)");
			valorB = e.nextInt();
			System.out.println(Math.pow(valorB, valorN));
		}

	}

}
