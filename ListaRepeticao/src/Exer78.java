import java.util.Scanner;

public class Exer78 {

	public static void main(String[] args) {
		Scanner e = new Scanner(System.in);
		int alunosTurma = 2, mediaMaiorOuIgualA5 = 0;
		double nota1,nota2,nota3,nota4,nota5,nota6,nota7,nota8,nota9,nota10;
		double mediaTurma = 0, mediaAluno;
		
		
		for(int i= 0; i < alunosTurma; i++) {
		System.out.println("Informe nota 1");
		nota1 = e.nextDouble();
		System.out.println("Informe nota 2");
		nota2 = e.nextDouble();
		System.out.println("Informe nota 3");
		nota3 = e.nextDouble();
		System.out.println("Informe nota 4");
		nota4 = e.nextDouble();
		System.out.println("Informe nota 5");
		nota5 = e.nextDouble();
		System.out.println("Informe nota 6");
		nota6 = e.nextDouble();
		System.out.println("Informe nota 7");
		nota7 = e.nextDouble();
		System.out.println("Informe nota 8");
		nota8 = e.nextDouble();
		System.out.println("Informe nota 9");
		nota9 = e.nextDouble();
		System.out.println("Informe nota 10");
		nota10 = e.nextDouble();
		
		mediaAluno = (nota1 + nota2 + nota3 + nota4 + nota5 + nota6 + nota7 + nota8+ nota9 + nota10) / 10;
		System.out.println("Media do aluno : " + mediaAluno);
		mediaTurma += mediaAluno;
		
		if(mediaAluno >= 5) {
			mediaMaiorOuIgualA5++;
		}
		}
		System.out.println("Media da turma :" + (mediaTurma/alunosTurma));
		System.out.println("Percentual de alunos que tiveram médias maiores ou iguais a 5: " + (Math.ceil(mediaMaiorOuIgualA5)/alunosTurma)*100);

	}

}
/*78)Criar um algoritmo que entre com dez notas de cada aluno de uma turma de 20
alunos e imprima:
• A média de cada aluno
• A média da turma
• O percentual de alunos que tiveram médias maiores ou iguais a 5.0.
*/
