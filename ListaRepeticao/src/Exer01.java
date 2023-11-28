import java.util.Scanner;

public class Exer01 {
	public static void main(String[] args) {
		//Faça um algoritmo que apresente todos os números de 0 ao número recebido pelo teclado.

		Scanner e = new Scanner(System.in);
		System.out.println("Digite um valor: ");
		int valor = e.nextInt();
		for(int i=0; i <= valor;i++) {
			System.out.println(i);
		}
	}
}
