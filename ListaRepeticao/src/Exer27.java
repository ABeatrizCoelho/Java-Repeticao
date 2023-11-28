import java.util.Scanner;

public class Exer27 {

	public static void main(String[] args) {
		Scanner e = new Scanner(System.in);
		int anoPessoaMaisNova = Integer.MIN_VALUE; 
		int anoPessoaMaisVelha = Integer.MAX_VALUE, anoNasc;
		String nome, nomePessoaMaisVelha = null, nomePessoaMaisNova = null;
		while(true) {
			System.out.println("Digite o nome da pessoa: (ou fim para encerrar)");
			nome = e.nextLine();
			if(nome.equalsIgnoreCase("fim")) {
				break;
			}
			System.out.println("Digite o ano de nascimento");
			anoNasc = e.nextInt();
			e.nextLine();
			
			if (anoNasc > anoPessoaMaisNova) {
                nomePessoaMaisNova = nome;
                anoPessoaMaisNova = anoNasc;
            }
            if (anoNasc < anoPessoaMaisVelha) {
                nomePessoaMaisVelha = nome;
                anoPessoaMaisVelha = anoNasc;
            }
        
	
		}
		System.out.println("Pessoa mais velha: " + nomePessoaMaisVelha + " ano: " + anoPessoaMaisVelha);
		System.out.println("Pessoa mais nova: " + nomePessoaMaisNova + " ano: " + anoPessoaMaisNova);

		

	}

}
