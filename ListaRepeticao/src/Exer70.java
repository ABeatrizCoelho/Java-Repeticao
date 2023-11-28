
public class Exer70 {

	public static void main(String[] args) {
 int possibilidade = 0;
        for (int i = 0; i < 6; i++) {     
            for (int j = 0; j < 6; j++) {
                if (i + j == 7) {
                possibilidade++;

                }
        }
        
     }
       System.out.println(possibilidade);
  }
}