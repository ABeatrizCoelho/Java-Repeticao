import java.util.Scanner;

public class Exer89 {

	public static void main(String[] args) {
		int i,n1,n2,s;
		Scanner e = new Scanner(System.in);
		
		System.out.println("“Digite um valor da lista: ");
		n1 = e.nextInt();
		
		System.out.println("“Digite um valor da lista: ");
		n2 = e.nextInt();
		
		s = 0;
		
		for (i = n1; i <= n2; i++) {
            s += 2;
        }
		System.out.println(s);
	}

}
