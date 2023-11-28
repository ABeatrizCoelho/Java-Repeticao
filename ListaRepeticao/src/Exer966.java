import java.util.Scanner;

public class Exer966 {

	public static void main(String[] args) {
		Scanner e = new Scanner(System.in);
		
		int vinhoBranco = 0;
		int vinhoTinto = 0;
		int vinhoRose = 0;
		
		String vinhoMaisVelho = " ";
		String vinhoMaisNovo = " ";
		
		int safraVinhoMaisVelho = Integer.MAX_VALUE;
		int safraVinhoMaisNovo = Integer.MIN_VALUE;
		
		int quantidadeTotalDeGarrafas = 0;
		int quantidadeTotalRose = 0;
			
		for(int i=0; i < 3;i++) {
			System.out.println("Diga o nome do vinho:");
			String nomeVinho = e.nextLine();
			
			System.out.println("Diga o ano da safra");
			int anoDaSafra = e.nextInt();
			
			System.out.println("Diga o codigo do vinho");
			int codigoVinho = e.nextInt();
			e.nextLine();
			
			switch(codigoVinho) {
			case 1:
				vinhoBranco++;
				break;
			case 2:
				vinhoTinto++;
				break;
			case 3:
				vinhoRose++;
				break;
			}
			if (anoDaSafra < safraVinhoMaisVelho) {
                safraVinhoMaisVelho = anoDaSafra;
                vinhoMaisVelho = nomeVinho;
            }
			
			if (anoDaSafra > safraVinhoMaisNovo) {
                safraVinhoMaisNovo = anoDaSafra;
                vinhoMaisNovo = nomeVinho;
            }
			quantidadeTotalDeGarrafas++;
			
	
		}
		
		System.out.println("Quantidade de vinho branco:" + vinhoBranco );
		System.out.println("Quantidade de vinho tinto:" + vinhoTinto);
		System.out.println("Quantidade de vinho rose:" + vinhoRose );
		
		System.out.println("Vinho mais velho: " + safraVinhoMaisVelho + "Nome: " + vinhoMaisVelho);
		System.out.println("Vinho mais velho: " + safraVinhoMaisNovo + "Nome: " + vinhoMaisNovo);
		
		System.out.println("Quantidade total de garrafas: " + quantidadeTotalDeGarrafas);
		
		System.out.println("A percentagem de garrafas de vinho rosê: " + (((float)vinhoRose/quantidadeTotalDeGarrafas)*100));
		
	}

}
