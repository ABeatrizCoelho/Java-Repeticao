import java.util.Scanner;

public class Exer46 {

	public static void main(String[] args) {
		Scanner e = new Scanner(System.in);
		char identificacaoTurma,presenca;
		int turmasExistentes = 14;
		int alunosMatriculados, matricula,alunoAusente = 0;
		double porcentagemTurma, turmasAcimaDe5 = 0;
		
		for(int i = 0; i < turmasExistentes;i++) {
			System.out.println("Digite a turma [A/B/C/D/E/F/G/H/I/J/K/L/M/N]");
			identificacaoTurma = e.next().charAt(0);
			System.out.println("Digite quantos alunos essa turma tem: ");
			alunosMatriculados = e.nextInt();
			alunoAusente = 0;
			for(int j = 0; j < alunosMatriculados; j++) {
				System.out.println("Digite a matricula: ");
				matricula = e.nextInt();
				System.out.println("O aluno estava presente ou ausente? [P - PRESENTE A- AUSENTE]");
				presenca = e.next().charAt(0);
				
				if(presenca == 'a' || presenca == 'A') {
					alunoAusente++;
				}				
			}
			porcentagemTurma = (alunoAusente * 100)/alunosMatriculados;
			System.out.println("A Turma " + identificacaoTurma + "obteve" + porcentagemTurma + "% de ausencia");
			if(porcentagemTurma > 5) {
				turmasAcimaDe5++;
			}
		}
		System.out.println("Tiveram" + turmasAcimaDe5 + "turmas com porcentagem acima de 5%");
	}

}
