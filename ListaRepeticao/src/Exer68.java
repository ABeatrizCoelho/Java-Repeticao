public class Exer68 {

    public static void main(String[] args) {
        int quadros = 64;
        long totalDeGraos = 0;
        long graosDoQuadrado = 1;

        for(int i = 0; i < quadros; i++) {
            totalDeGraos += graosDoQuadrado; // graos = 0 + 1 (que é o valor inicial)
            graosDoQuadrado *= 2; 
        }
        
        System.out.println("O monge vai receber " + totalDeGraos + " grãos.");
    }
}