import java.util.Scanner;

public class ExerLucas {

	public static void main(String[] args) {
		Scanner e = new Scanner(System.in);
		int diasLetivos = 200,numMaterias, faltas, totalFaltas = 0, numNotas, qtdeAulas;
		String nomeMateria;
		double nota, totalNotas = 0, media;
		System.out.println("Digite o total  de matérias:");
		numMaterias = e.nextInt();
		e.nextLine();
		for(int i=0; i < numMaterias; i++) {
			System.out.println("Digite o nome da materia:");
			nomeMateria = e.nextLine();
			System.out.println("Digite a quantas faltas o aluno teve");
			faltas = e.nextInt();
			totalFaltas += faltas;
			System.out.println("Digite quantas notas houveram nessa materia: ");
			numNotas = e.nextInt();
			
			
			for(int j=0; j < numNotas; j++) {
				System.out.println("Digite a nota " + (j + 1) + " da materia " + nomeMateria);
				nota = e.nextDouble();
				totalNotas += nota;
			}
			e.nextLine();
			media = totalNotas / numNotas;
			qtdeAulas = 1000 / numMaterias;
			

			
			if(media >= 7 && (qtdeAulas/faltas) < (qtdeAulas * 0.3)) {
				System.out.println("Voce passou na materia");
			}else {
				System.out.println("Voce foi reprovado");
			}
			
			System.out.println("A media da materia " + nomeMateria + " foi " + String.format("%.2f", media));
			
		}
		
		if((1000 / totalFaltas) > 150) {
			System.out.println("Voce teve mais de 15% de faltas");
		}else {
			System.out.println("Voce teve menos de 15% de faltas");
		}

	}

}
