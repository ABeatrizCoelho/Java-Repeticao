import java.util.Scanner;

public class Exer84 {

	public static void main(String[] args) {
		Scanner e = new Scanner(System.in);
		int soma=0; 
		int i = 1;
		int valor;
		
		while(i>10) {
		i = i+1;
		System.out.print("Digite um valor: ");
	    valor = e.nextInt();
	    soma = soma + valor;
		}
		
	}

}
