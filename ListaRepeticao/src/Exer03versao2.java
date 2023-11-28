import java.util.Scanner;

public class Exer03versao2 {

	public static void main(String[] args) {
		Scanner e = new Scanner(System.in);
		int soma=0,num;
		System.out.println("Digite um numero qualquer");
		num = e.nextInt();
		for(int i = 1; i <= num; i++) {
			soma += i;
			System.out.println(soma);
		}

	}

}
