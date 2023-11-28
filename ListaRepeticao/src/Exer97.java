import java.util.Scanner;

public class Exer97 {

	public static void main(String[] args) {
		Scanner e = new Scanner(System.in);
		for(int i = 0; i < 3;i++) {
			System.out.println("Nome: ");
			String nome = e.nextLine();
			
			System.out.println("Preço: ");
			double preco = e.nextDouble();
			
			System.out.print("Percentual de desconto (%): ");
            double percentualDeDesconto = e.nextDouble();
            e.nextLine();
            
            double desconto = (percentualDeDesconto / 100) * preco;
            
            System.out.println("Nome: " + nome);
            System.out.println("Preço: " + preco);
            System.out.println("Preço apos desconto: " + (preco - desconto));
		}

	}

}
