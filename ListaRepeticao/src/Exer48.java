import java.util.Scanner;

public class Exer48 {

	public static void main(String[] args) {
		Scanner e = new Scanner(System.in);
		int numCriancasNascidas, mesesDaCrianca, criancasMortas = 0;
		int criancasDoSexoMasculinoMortas = 0, criancasQueViveram24MesesOuMenos = 0;
		String sexo;
		double porcentagemCriancasMortas, porcentagemCriancasMascMortas, porcentagem24ouMenos;
		System.out.println("Digite o numero de crianças nascidas no periodo: ");
		numCriancasNascidas = e.nextInt();
		e.nextLine();
		while(true) {
			System.out.println("Digite o sexo da criança morta [m,f] ou vazio para encerrar" );
			sexo = e.nextLine();
			if(sexo.equalsIgnoreCase("vazio")) {
				break;
			}

			System.out.println("Quantos meses a criança tem? ");
			mesesDaCrianca = e.nextInt();
			e.nextLine();
			
			if(sexo.equalsIgnoreCase("m")) {
				criancasDoSexoMasculinoMortas++;
			}
			if(mesesDaCrianca <= 24) {
				criancasQueViveram24MesesOuMenos++;
			}
			
			criancasMortas++;
		}
		
		porcentagemCriancasMortas = ((double)criancasMortas/numCriancasNascidas) * 100;
		porcentagemCriancasMascMortas = ((double)criancasDoSexoMasculinoMortas/numCriancasNascidas) *100;
		porcentagem24ouMenos = ((double)criancasQueViveram24MesesOuMenos/criancasMortas) *100;
		
		System.out.println("Porcentagem de criancas mortas: " + porcentagemCriancasMortas + "%");
		System.out.println("Porcentagem de crianças do sexo masculino mortas no período: " + porcentagemCriancasMascMortas + "%");
        System.out.println("Porcentagem de crianças que viveram 24 meses ou menos no período: " + porcentagem24ouMenos + "%");
		
		
	}

}
