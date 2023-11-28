import java.util.Scanner;

public class Exer19 {

	public static void main(String[] args) {
		Scanner e = new Scanner(System.in);
		int funcao;
		double primeiroValor, segundoValor;
		while(true) {
			System.out.println("Digite o que quer fazer [1 - somar - 2- subtrair 3 - dividir - 4 - multiplicar (ou 0 para encerrar)]");
			funcao = e.nextInt();
			switch(funcao) {
			case 0:
				break;
			case 1:
				System.out.println("Digite o primeiro valor a ser somado: ");
				primeiroValor = e.nextDouble();
				System.out.println("Digite o segundo valor a ser somado: ");
				segundoValor = e.nextDouble();
				System.out.println("A soma deles é: " + (primeiroValor + segundoValor));
			case 2:
                System.out.println("Digite o valor a ser subtraído:");
                primeiroValor = e.nextDouble();
                System.out.println("Digite o valor a ser subtraído:");
                segundoValor = e.nextDouble();
                System.out.println("A subtração deles é: " + (primeiroValor - segundoValor));
                break;
            case 3:
                System.out.println("Digite o valor a ser dividido:");
                primeiroValor = e.nextDouble();
                System.out.println("Digite o valor pelo qual será dividido:");
                segundoValor = e.nextDouble();
                if (segundoValor != 0) {
                    System.out.println("A divisão deles é: " + (primeiroValor / segundoValor));
                } else {
                    System.out.println("Não é possível dividir por zero.");
                }
                break;
            case 4:
                System.out.println("Digite o primeiro valor a ser multiplicado:");
                primeiroValor = e.nextDouble();
                System.out.println("Digite o segundo valor a ser multiplicado:");
                segundoValor = e.nextDouble();
                System.out.println("A multiplicação deles é: " + (primeiroValor * segundoValor));
                break;
            default:
                System.out.println("Opção inválida.");
                break;
				
				}
			if(funcao == 0) {
				break;
			}
		}

	}

}
