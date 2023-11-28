import java.util.Scanner;

public class Exer05 {

	public static void main(String[] args) {
		//Apresentar todos os números divisíveis por 4 até o número recebido pelo teclado
		Scanner e = new Scanner(System.in);
		System.out.println("Digite um valor");
		int valor = e.nextInt();
		for(int i = 0;i <= valor; i++) {
			if(i % 4 == 0) {
				System.out.println(i + " ");
			}
		}

	}

}
