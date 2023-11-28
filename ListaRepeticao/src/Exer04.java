import java.util.Scanner;

public class Exer04 {

	public static void main(String[] args) {
		Scanner e = new Scanner(System.in);
		System.out.println("Digite o valor:");
		int numtab = e.nextInt();
		int soma;
		for(int i = 0; i <= 10; i++) {
			soma = numtab * i;
			System.out.println("Tabudada do "+ numtab+ " é " + numtab + "*" + i +"=" + soma);
		}
		

	}

}
