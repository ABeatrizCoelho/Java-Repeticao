import java.util.Scanner;

public class Exer87 {

	public static void main(String[] args) {
	Scanner e = new Scanner(System.in);
	double totalDaCompra;
	
	System.out.println("Escreva a quantidade de maçãs compradas:");
	int macas = e.nextInt();
	
		if(macas > 12) {
			totalDaCompra = macas * 0.30;
		}else {
			totalDaCompra = macas * 0.25;
		}
	
	System.out.println("valor :" + totalDaCompra);
	}

}
/*)As maçãs custam R$ 0,30 cada uma se forem compradas menos do que uma
dúzia, e R$ 0,25 se forem compradas pelo menos doze. Escreva um algoritmo que
leia o número de maçãs compradas, calcule e escreva o valor total da compra.*/