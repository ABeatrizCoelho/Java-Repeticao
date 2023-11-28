import java.util.Scanner;

public class Exer50 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maiorCandidatosPorVaga = Integer.MIN_VALUE;
        int codigoCursoMaiorCandidatosPorVaga = 0;
        int totalCandidatos = 0;

        System.out.println("Insira o código do curso, número de vagas, candidatos masculinos e candidatos femininos:");
        while (true) {
            int codigoCurso = scanner.nextInt();
            if (codigoCurso == 0) {
                break; // Sai do loop quando o código do curso for 0
            }

            int numVagas = scanner.nextInt();
            int candidatosMasculinos = scanner.nextInt();
            int candidatosFemininos = scanner.nextInt();

            // Cálculo do número de candidatos por vaga
            int totalCandidatosCurso = candidatosMasculinos + candidatosFemininos;
            double candidatosPorVaga = (double) totalCandidatosCurso / numVagas;

            // Cálculo da porcentagem de candidatos do sexo feminino
            double porcentagemFeminina = (double) candidatosFemininos / totalCandidatosCurso * 100;

            // Impressão dos resultados para o curso atual
            System.out.println("Curso " + codigoCurso + ":");
            System.out.println("Candidatos por vaga: " + String.format("%.2f", candidatosPorVaga));
            System.out.println("Porcentagem de candidatos femininos: " + String.format("%.2f", porcentagemFeminina) + "%");

            // Atualização do maior número de candidatos por vaga
            if (candidatosPorVaga > maiorCandidatosPorVaga) {
                maiorCandidatosPorVaga = (int) candidatosPorVaga;
                codigoCursoMaiorCandidatosPorVaga = codigoCurso;
            }

            // Atualização do total de candidatos
            totalCandidatos += totalCandidatosCurso;
        }

        // Impressão do maior número de candidatos por vaga e seu código correspondente
        System.out.println("Maior número de candidatos por vaga: " + maiorCandidatosPorVaga +
                " (Curso " + codigoCursoMaiorCandidatosPorVaga + ")");

        // Impressão do total de candidatos
        System.out.println("Total de candidatos: " + totalCandidatos);

        scanner.close();
    }
}