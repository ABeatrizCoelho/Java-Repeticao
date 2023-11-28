import java.util.Scanner;

public class Exer03 {
	public static void main(String[]args) {
		Scanner e = new Scanner(System.in);
		System.out.println("Digite um valor:");
		int valor = e.nextInt();
		int i = 0;
		int soma = 0;
		while (i <= valor) {
			soma = soma + i;
			i++;
			 System.out.println("A soma de todos os números inteiros até " + i + " é: " + soma);
		}
			
		}
	}

