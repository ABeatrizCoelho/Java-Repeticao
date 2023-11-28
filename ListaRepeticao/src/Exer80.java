import java.util.Scanner;

public class Exer80 {

	public static void main(String[] args) {
		Scanner e = new Scanner(System.in);
		int timeDeCoracao, ondeMora;
		double salario, mediaSalarialBotafogo = 0.0;
		int fluminense = 0, botafogo = 0, vasco = 0, flamengo = 0, outros = 0;
		int moraRioDeJaneiro = 0, moraNiteroi = 0, moraOutros = 0;
		int torcedoresRioOutros = 0, torcedoresNiteroiFluminense = 0;
		while(true) {
			System.out.println("informe seu time de coração: (digite O para encerrar)");
			timeDeCoracao = e.nextInt();
			if(timeDeCoracao == 0) {
				break;
			}else if(timeDeCoracao == 1) {
			fluminense++;
			}else if(timeDeCoracao == 2) {
			botafogo++;
			}else if(timeDeCoracao == 3) {
			vasco++;
			}else if(timeDeCoracao == 4) {
			flamengo++;
			}else if (timeDeCoracao == 5) {
			outros++;
			}
			
			System.out.println("Onde voce mora: ");
			ondeMora = e.nextInt();
			if(ondeMora == 1) {
			moraRioDeJaneiro++;	
			}else if(ondeMora == 2) {
			moraNiteroi++;
			}else if(ondeMora == 3) {
			moraOutros++;
			}
			
			
			System.out.println("Qual o seu salário?");
			salario = e.nextDouble();
			
			if(timeDeCoracao == 2) {
			mediaSalarialBotafogo = salario + mediaSalarialBotafogo;
			}
			
			if(ondeMora==1 && timeDeCoracao == 5) {
			torcedoresRioOutros++;
			}
			
			if(ondeMora==2 && timeDeCoracao == 1) {
			torcedoresNiteroiFluminense++;
			}
			
		}
		
		System.out.println("Torcedores Fluminense :" + fluminense);
		System.out.println("Torcedores Botafogo:" + botafogo);
		System.out.println("Torcedores Vasco :" + vasco);
		System.out.println("Torcedores Flamengo :" + flamengo);
		System.out.println("Torcedores Outros :" + outros);
		
		System.out.println("Media salarial dos torcedores do botafogo: " + (mediaSalarialBotafogo / botafogo));
		
		System.out.println("Moradores do Rio de Janeiro, torcedores de outros: " + torcedoresRioOutros);
		
		System.out.println("Moradores de Niteroi, torcedores do Fluminense: " + torcedoresNiteroiFluminense);

	}

}
/*80)Uma pesquisa de opinião realizada no Rio de Janeiro, teve as seguintes perguntas:
Qual seu time de coração?
1 – Fluminense
2 – Botafogo
3 – Vasco
4 – Flamengo
5 – Outros
Onde você mora?
1 – RJ
2 – Niterói
3 - Outros
Qual o seu salário?
Criar um algoritmo que imprima
a. Número de torcedores por clube
b. A média salarial dos torcedores do Botafogo
c. O número de pessoas moradoras do Rio de Janeiro, torcedores de outros
clubes
d. O número de pessoas de Niterói torcedoras do Fluminense.
O algoritmo acaba quando se digita 0 para o time.
*/