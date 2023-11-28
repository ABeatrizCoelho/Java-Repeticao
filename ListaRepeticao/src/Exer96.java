import java.util.Scanner;

public class Exer96 {

	public static void main(String[] args) {
		Scanner e = new Scanner(System.in);
		double maiorCapacidade= Double.MIN_VALUE;
		String computadorMaiorCapacidade = " ";
		int countCobra = 0;
		String fabricanteMaxxI = " "; 
		
		for(int i = 0; i < 2; i++) {
			System.out.println("Insira o nome do Fabricante: ");
			String fabricante = e.nextLine();
			
			System.out.println("Insira o nome do Computador");
			String nomeComputador = e.nextLine();
			
			System.out.println("Insira a capacidade de memoria: ");
			double memoria = e.nextDouble();
			e.nextLine(); 
			
			if(maiorCapacidade < memoria) {
				maiorCapacidade = memoria;
				computadorMaiorCapacidade = nomeComputador;
			}
			if(("COBRA".equalsIgnoreCase(fabricante))) {
			countCobra++;
			}
			
			 if ("MAXX I".equalsIgnoreCase(nomeComputador)) {
	        fabricanteMaxxI = fabricante;
	            }
			
		}
		System.out.println("Nome do computador com maior capacidade: " + computadorMaiorCapacidade);
		System.out.println("Quantos computadores a COBRA fabrica: " + countCobra);
		System.out.println("Fabricante do computador MaxxI: " + fabricanteMaxxI);
	}

}
