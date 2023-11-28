import java.util.Scanner;

public class Exer82 {

	public static void main(String[] args) {
		Scanner e = new Scanner(System.in);
		double rendaPessoal,rendaFamiliar,totalAlimentacao, totalOutrasDespesas;
		double porcentagemGastoPorRenda;
		int rendaPessoalMaiorQueFamiliar = 0, mais200EmDespesas = 0, totalAlunos = 0;
		
		while(true) {
			System.out.println("Informe a renda pessoal (ou 0 para encerrar)");
			rendaPessoal = e.nextDouble();
			if(rendaPessoal == 0) {
				break;
			}
			System.out.println("Informe a renda familiar");
			rendaFamiliar = e.nextDouble();
			System.out.println("Informe o total de gastos com alimentação: ");
			totalAlimentacao = e.nextDouble();
			System.out.println("Informe o total de gastos com outras despesas: ");
			totalOutrasDespesas = e.nextDouble();
			
			totalAlunos++;
			
			if(totalOutrasDespesas > 200.0) {
				mais200EmDespesas++;	
			}
			if(rendaPessoal > rendaFamiliar) {
				rendaPessoalMaiorQueFamiliar++;
			}
			
porcentagemGastoPorRenda = ((totalAlimentacao + totalOutrasDespesas)*100)/ (rendaPessoal + rendaFamiliar);
System.out.println("Renda familiar e a porcentagem gastas com alimentação e outras despesas em relação às rendas pessoal e familiar : " + Math.ceil(porcentagemGastoPorRenda));
		}

System.out.println("Quantidade de alunos que gasta acima de 200:" + ((mais200EmDespesas * 100) / totalAlunos));
System.out.println("Número de alunos com renda pessoal maior que renda familiar:" + rendaPessoalMaiorQueFamiliar);

		
		
	}

}
/*82) Numa universidade cada aluno possui os seguintes dados:
• Renda pessoal
• Renda familiar
• Total de gastos com alimentação
• Total de gastos com outras despesas
Criar um algoritmo que imprima a porcentagem dos alunos que gasta acima de R$
200,00 com outras despesas, o número de alunos com renda pessoal maior que
renda familiar e a porcentagem gastas com alimentação e outras despesas em relação às rendas pessoal e familiar.
O algoritmo acaba quando se digita 0 (zero) para renda pessoal.*/