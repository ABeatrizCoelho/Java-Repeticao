import java.util.Scanner;

public class Exer74 {

	public static void main(String[] args) {
		Scanner e = new Scanner(System.in);
		int idade;
		char opiniao;
		int otimo = 0, bom = 0, regular = 0, ruim = 0, pessimo = 0;
		int idadePessoasRuim = 0, maiorIdadeOtimo = 0, maiorIdadeRuim = 0;
		int maiorIdadePessimo = Integer.MIN_VALUE, diferencaIdade;
		for(int i = 0;i < 4; i++) {
			System.out.println("Qual a sua idade?");
			idade = e.nextInt();
			System.out.println("Qual a sua opinião do filme [A-Otimo / B-Bom / C-Regular / D-Ruim / E-Pessimo]");
			opiniao = e.next().charAt(0);
			if(opiniao == 'A' || opiniao == 'a') {
				otimo++;
				if (idade > maiorIdadeOtimo) {
                    maiorIdadeOtimo = idade;
                }
			}else if(opiniao == 'B' || opiniao == 'b') {
				bom++;
			}else if(opiniao == 'C' || opiniao == 'c') {
				regular++;
			}else if(opiniao == 'D' || opiniao == 'd') {
				ruim++;
				idadePessoasRuim = idade + idadePessoasRuim;
				if (idade > maiorIdadeRuim) {
                    maiorIdadeRuim = idade;
                }
			}else if(opiniao == 'E' || opiniao == 'e') {
				pessimo++;
			}else {
				System.out.println("Opiniao invalida");
			}
			
			
			if(opiniao == 'E' || opiniao == 'e' && idade > maiorIdadePessimo) {
				maiorIdadePessimo = idade;
			}
			
		}
		diferencaIdade = maiorIdadeOtimo - maiorIdadeRuim;
		
		System.out.println("Quantidade de respostas Otimo: " + otimo);
		System.out.println("A média de idade das pessoas que responderam ruim: " + (idadePessoasRuim / ruim));
		System.out.println("Maior idade pessimo: " + maiorIdadePessimo);
		System.out.println("Diferença de idade entre a maior idade que respondeu ótimo e a maior\r\n"
				+ "idade que respondeu ruim : " + diferencaIdade );
		
		

	}

}
