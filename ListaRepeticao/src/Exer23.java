import java.util.Scanner;

public class Exer23 {

	public static void main(String[] args) {
		Scanner e = new Scanner(System.in);
		double centimetros = 2.54;
		System.out.println("Tabela");
		System.out.println("Polegada \t\tCentimetros");
		for(int polegada = 1; polegada <=20; polegada++) {
			System.out.println("Polegada :" + polegada + "\t\tCentimetros: " + (polegada * centimetros));
		}
	}

}
