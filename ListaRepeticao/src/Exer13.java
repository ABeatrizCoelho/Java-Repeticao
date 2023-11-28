import java.util.Scanner;

public class Exer13 {

	public static void main(String[] args) {
		Scanner e = new Scanner(System.in);
		int num;
		for(int i = 0; i < 15; i++) {
			System.out.println("Digite um numero");
			num = e.nextInt();
			System.out.println(Math.sqrt(num));
		}

	}

}
