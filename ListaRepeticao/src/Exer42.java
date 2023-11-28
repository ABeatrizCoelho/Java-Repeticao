public class Exer42 {

	public static void main(String[] args) {

        for (int fahrenheit = 50; fahrenheit <= 150; fahrenheit++) {
            double celsius = (5.0 / 9.0) * (fahrenheit - 32);
            System.out.println("f: "+ fahrenheit + " c :" + String.format("%.2f", celsius));
        }
    }
}
