import java.util.Scanner;

public class Exer99 {

	public static void main(String[] args) {
		Scanner e = new Scanner(System.in);
		int vaiReceberAumento = 0;
		
		for(int i = 1; i <= 5; i++) {
			System.out.print("Nome: ");
			String nome = e.nextLine();
			
			System.out.print("Dependentes: ");
			int numDependentes = e.nextInt();
			e.nextLine();
			
			System.out.print("Anos de Serviço: ");
			int anosServico = e.nextInt();
			e.nextLine();
			
			System.out.print("Salario: ");
			double salario = e.nextDouble();
			e.nextLine();
			
			if(numDependentes > 3 && anosServico > 4 && salario < 2000) {
				vaiReceberAumento++;
				System.out.print(nome + " vai receber aumento");
			}
		}
		System.out.print(vaiReceberAumento + " vão receber aumento");
	}

}
