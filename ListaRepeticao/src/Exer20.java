import java.util.Scanner;

public class Exer20 {

	public static void main(String[] args) {
		Scanner e = new Scanner(System.in);
		String nome = null;
		double nota1, nota2, nota3, nota4;
		double media;
		while(true) {
			System.out.println("Diga o nome do aluno:  (ou FIM para encerrar)");
			nome = e.nextLine();
			
			if(nome.equalsIgnoreCase("fim")) {
				break;
			}
			
			System.out.println("Digite sua primeira nota: ");
			nota1 = e.nextDouble();
			System.out.println("Digite sua segunda nota: ");
			nota2 = e.nextDouble();
			System.out.println("Digite sua terceira nota: ");
			nota3 = e.nextDouble(); 
			System.out.println("Digite sua quarta nota: ");
			nota4 = e.nextDouble();
			e.nextLine(); 
			
			
			media = (nota1 + nota2 + nota3 + nota4) / 4;
			
			System.out.println("A media do aluno " + nome + " é " + media);
		} 

	}
		

}
