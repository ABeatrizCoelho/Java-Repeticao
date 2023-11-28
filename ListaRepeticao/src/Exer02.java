import java.util.Scanner;

public class Exer02 {

	public static void main(String[] args) {
		Scanner e = new Scanner(System.in);
		System.out.println("Digite um valor: ");
		int valor = e.nextInt();
		for(int i=0; i <= valor;i++) {
			if(i % 2 == 0) {
				System.out.println(i);
			}
		}

	}

}
