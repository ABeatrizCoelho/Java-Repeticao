import java.util.Scanner;

public class Exer14 {

	public static void main(String[] args) {
		Scanner e = new Scanner(System.in);
		int maiorNumero = Integer.MIN_VALUE;
		int menorNumero = Integer.MAX_VALUE;
		int num, numFornecidos;
		System.out.println("Digite a quantidade de numeros que deseja fornecer");
		numFornecidos = e.nextInt();
		for(int i = 0; i < numFornecidos; i++) {
			System.out.println("Digite o numero " + (i+1));
			num = e.nextInt();
			
			if(num > maiorNumero) {
				maiorNumero = num;
			}
			if(num < menorNumero) {
				menorNumero = num;
			}
		}
		System.out.println("Maior numero: " + maiorNumero);
		System.out.println("Menor numero: " + menorNumero);
	}

}
