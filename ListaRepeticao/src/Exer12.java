import java.util.Scanner;

public class Exer12 {

	public static void main(String[] args) {
		Scanner e = new Scanner(System.in);
		for(int i=0; i <10; i++) {
			System.out.println("entre com um valor");
			int valor = e.nextInt();
			System.out.println(Math.pow(valor, 2));
		}

	}

}
