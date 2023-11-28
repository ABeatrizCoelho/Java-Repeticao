import java.util.Scanner;

public class Exer24 {

	public static void main(String[] args) {
		Scanner e = new Scanner(System.in);
		String nome;
		int idade;
		char sexo;
		
		for(int i = 0; i <20; i++) {
			System.out.println("Digite o nome da pessoa: ");
			nome = e.nextLine();
			System.out.println("Digite a idade: ");
			idade = e.nextInt();
			System.out.println("Digite o sexo: ");
			sexo = e.next().charAt(0);
			e.nextLine();
			
			if((sexo == 'm' || sexo == 'M') && idade > 21) {
				System.out.println(nome + " tem mais de 21 anos e é do sexo masculino");
			}
		}

	}

}
