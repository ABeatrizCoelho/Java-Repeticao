import java.util.Scanner;

public class Exer18 {

	public static void main(String[] args) {
		Scanner e = new Scanner(System.in);
		int filhos;
		String nomeFilho;
		System.out.println("Digite o numero de filhos que você tem");
		filhos = e.nextInt();
		e.nextLine();
		for(int i = 0; i < filhos;i++) {
			System.out.println("Digite o nome do filho " + (i + 1));
			nomeFilho = e.nextLine();
			System.out.println("O nome do " + (i + 1) + "º filho é " + nomeFilho);
		}
	}

}
