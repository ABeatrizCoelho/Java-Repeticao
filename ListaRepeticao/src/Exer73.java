
public class Exer73 {

	public static void main(String[] args) {
		int anos = 0;
		double alturaAnacleto = 1.50;
		double alturaFelisberto = 1.10;
		double alturaFinalFelisberto , alturaFinalAnacleto;
		while(alturaAnacleto >= alturaFelisberto) {
			
			alturaAnacleto = alturaAnacleto + 0.02;
			alturaFelisberto = alturaFelisberto + 0.03;
			anos++;
		}
			System.out.println("Anos: " + anos);
	}

}
