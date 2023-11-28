import java.util.Scanner;

public class Exer28 {

	public static void main(String[] args) {
		Scanner e = new Scanner(System.in);
			int matricula = 0;
			String nome;
		while(true) {
			System.out.println("Digite o nome da pessoa para matricula (ou fim para encerrar) ");
			nome = e.nextLine();
			if(nome.equalsIgnoreCase("fim")) {
				break;
			}
			matricula++;
		}
		
		System.out.println("Numero de matriculados :" + matricula);

	}

}
