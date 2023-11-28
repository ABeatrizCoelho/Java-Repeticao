import java.util.Scanner;

public class Exer69 {

	public static void main(String[] args) {
		Scanner e = new Scanner(System.in);
		int voto;
		int candidato1=0, candidato2=0, candidato3=0, candidato4=0, nulo=0, branco=0;
		int totalVotos=0;
		double percentualVotosEmBranco, percentualVotosNulos;
		System.out.println("Digite seu voto (ou 0 para encerrar)");
		voto = e.nextInt();
		while(voto != 0) {
			switch(voto) {
			case 1:
				candidato1++;
				break;
			case 2:
				candidato2++;
				break;
			case 3:
				candidato3++;
				break;
			case 4:
				candidato4++;
				break;
			case 5:
				nulo++;
				break;
			case 6:
				branco++;
				break;
			default:
				break;
			}
			totalVotos++;
			 System.out.println("Digite seu próximo voto (ou 0 para encerrar)");
	         voto = e.nextInt();
		}
		percentualVotosNulos = ((double)nulo / totalVotos) * 100;
		percentualVotosEmBranco = ((double)branco / totalVotos) * 100;
		
		System.out.println("Total de votos para o Candidato 1: " + candidato1);
        System.out.println("Total de votos para o Candidato 2: " + candidato2);
        System.out.println("Total de votos para o Candidato 3: " + candidato3);
        System.out.println("Total de votos para o Candidato 4: " + candidato4);
        System.out.println("Total de votos em branco: " + branco);
        System.out.println("Percentual de votos em branco : " + percentualVotosEmBranco);
        System.out.println("Percentual de votos nulos : " + percentualVotosNulos);
	}

}
