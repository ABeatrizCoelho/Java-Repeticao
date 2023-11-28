import java.util.Scanner;

public class Exer98 {

	public static void main(String[] args) {
		Scanner e = new Scanner(System.in);
		double maiorMedia = Double.MIN_VALUE;
		double menorMedia = Double.MAX_VALUE;
		
		String alunoMenorMedia = " ";
		String alunoMaiorMedia = " ";
		
		for(int i = 0; i <= 4; i++) {
			System.out.print("Nome");
			String nome = e.nextLine();
			
			System.out.print("1 Nota: ");
			double nota1 = e.nextDouble();
			
			System.out.print("2 Nota: ");
			double nota2 = e.nextDouble();
			
			System.out.print("3 Nota: ");
			double nota3 = e.nextDouble();
			e.nextLine();
			
			double media = (3 * nota1 + 4 * nota2 + 2 * nota3) / 9;
			
			if (media > maiorMedia) {
				maiorMedia = media;
				alunoMaiorMedia = nome;
			}
			if (media < menorMedia) {
				menorMedia = media;
				alunoMenorMedia = nome;
			}
			
			System.out.println(nome + " Media: " + media);
			
		}
		
		System.out.println("Aluno com menor media: " + alunoMenorMedia);
		System.out.println("Aluno com maior media: " + alunoMaiorMedia);

	}

}
