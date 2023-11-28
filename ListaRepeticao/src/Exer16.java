import java.util.Scanner;

public class Exer16 {

	public static void main(String[] args) {
		Scanner e = new Scanner(System.in);
		int masculino = 0; 
		char sexo = 0;
		while(sexo != 'x' || sexo != 'X') {
			System.out.println("Digite o sexo da pessoa[M ou F] (ou x para encerrar)");
			sexo = e.next().charAt(0);
			
			if(sexo == 'x' || sexo == 'X') {
				break;
			}else if(sexo == 'M' || sexo == 'm') {
				masculino++;
			}
			
			
		}
		
		System.out.println("Existem " + masculino + " pessoas do sexo masculino");

	}

}
