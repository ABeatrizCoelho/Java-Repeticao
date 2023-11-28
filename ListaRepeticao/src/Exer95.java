import java.util.Scanner;

public class Exer95 {

    public static void main(String[] args) {
        char sexo;
		String nome,resultado;
        int nota1,nota2,nota3,faltas;
        int homensRep=0,mulheresAprov=0;
        double media;
        Scanner e = new Scanner(System.in);
        int matricula = 0;
        System.out.println("Digite a matricula: ");
        matricula = e.nextInt();
        while(matricula != 0) {
        	System.out.println("Digite o nome do aluno");
        	nome = e.next();
        	
            System.out.println("Digite o sexo(m/f): ");
            sexo = e.next().charAt(0);    
            
            System.out.println("Digite primeira nota: ");
            nota1 = e.nextInt(); 
            
            System.out.println("Digite segunda nota: ");
            nota2 = e.nextInt(); 
            
            System.out.println("Digite terceira nota: ");
            nota3 = e.nextInt();      
            
            System.out.println("Digite as faltas do aluno");
            faltas = e.nextInt();
            
            media = (nota1+nota2+nota3)/3;
            
            if (media >= 7 && faltas <= 15) {
            	resultado = "Aprovado";
            	if(sexo == 'F' || sexo == 'f') {
            		mulheresAprov++;
            	}
            } else if(media < 7){
            	resultado = "Reprovado por media";
            	if(sexo == 'M' || sexo =='m') {
            		homensRep++;
            	}
            } else {
            	resultado = "Reprovado por falta";
            }
            
            System.out.println("Nome: " + nome);
            System.out.println("Media: " + media);
            System.out.println("Resultado: " + resultado);
            
            System.out.println("Digite a matricula: ");
            matricula = e.nextInt();
        }
       
        System.out.println("Numero de reprovados do sexo masculino: " + homensRep);
        System.out.println("Numero de aprovados do sexo feminino: " + mulheresAprov);

    }

}
