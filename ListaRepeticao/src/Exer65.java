import java.util.Scanner;

public class Exer65 {

	public static void main(String[] args) {
	Scanner e = new Scanner(System.in);
	int numOperario, pecasFabricadas, numTotalDePecas = 0, homens = 0, mulheres = 0;
	double pecasFabricadasPorMulher=0,pecasFabricadasPorHomem=0;
	char sexoOperario;
	double salarioMinimo = 1320, salarioFinal, salarioTotal = 0;
	double maiorSalario = 0;
	int operarioMaiorSalario = 0;
	while(true) {
		System.out.println("Digite o numero do operario:");
		numOperario = e.nextInt();
		if(numOperario == 0) {
			break;
		}
		
		System.out.println("Digite o numero de peças fabricadas por ele:");
		pecasFabricadas = e.nextInt();
		
		System.out.println("Digite o sexo do operario [M-MULHER H-HOMEM]");
		sexoOperario = e.next().charAt(0);
		if(sexoOperario == 'M'|| sexoOperario == 'm') {
			mulheres++;
			pecasFabricadasPorMulher++;
		}else if(sexoOperario == 'H'|| sexoOperario == 'h') {
			homens++;
			pecasFabricadasPorHomem++;
		}
		
		
		if (pecasFabricadas <= 30) {
            salarioFinal = salarioMinimo;
        } else if (pecasFabricadas <= 35) {
        	salarioFinal = salarioMinimo + ((pecasFabricadas - 30) * 0.03);
        } else {
        	salarioFinal = salarioMinimo + ((pecasFabricadas - 30) * 0.05);
        }
		numTotalDePecas += pecasFabricadas;
		salarioTotal += salarioFinal;
		
		if (salarioFinal > maiorSalario) {
            maiorSalario = salarioFinal;
            operarioMaiorSalario = numOperario;
        }

		System.out.println("Salario do operario: " + numOperario + " valor: " + salarioFinal);
	}
	double mediaDePecasHomem = pecasFabricadasPorHomem/homens;
	double mediaDePecasMulher = pecasFabricadasPorMulher/mulheres;
	
	
   System.out.println("O total da folha mensal de pagamento da fábrica: " + salarioTotal);
   System.out.println("O número total de peças fabricadas por mês: " + numTotalDePecas );
   System.out.println("A média de peças fabricadas pelos homens :" + mediaDePecasHomem);
   System.out.println("A média de peças fabricadas pelas mulheres " + mediaDePecasMulher);
   System.out.println("O número do operário ou operária de maior salário: " + operarioMaiorSalario + "salario: " + maiorSalario);

	}

}
