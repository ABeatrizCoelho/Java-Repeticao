import java.util.Scanner;

public class Exer51 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalAlunos = 100;
        int alunosReprovados = 0;
        int totalAulas = 40;
        double somaNotas = 0;
        double maiorNota = Double.MIN_VALUE;
        double menorNota = Double.MAX_VALUE;

        System.out.println("Insira os dados dos alunos: número de matrícula, três notas e frequência.");
        for (int i = 0; i < totalAlunos; i++) {
            int numeroMatricula = scanner.nextInt();
            double nota1 = scanner.nextDouble();
            double nota2 = scanner.nextDouble();
            double nota3 = scanner.nextDouble();
            int frequencia = scanner.nextInt();

            // Calculando a nota final
            double notaFinal = (nota1 + nota2 + nota3) / 3;

            // Verificando aprovação/reprovação
            boolean aprovado = notaFinal >= 60 && frequencia >= totalAulas;
            if (!aprovado) {
                alunosReprovados++;
            }

            // Atualizando maior e menor nota
            if (notaFinal > maiorNota) {
                maiorNota = notaFinal;
            }
            if (notaFinal < menorNota) {
                menorNota = notaFinal;
            }

            // Adicionando à soma total das notas para calcular a média da turma
            somaNotas += notaFinal;

            // Exibindo informações do aluno
            System.out.println("Número de matrícula: " + numeroMatricula);
            System.out.println("Frequência: " + frequencia);
            System.out.println("Nota final: " + notaFinal);
            System.out.println("Código: " + (aprovado ? "Aprovado" : "Reprovado"));
        }

        // Calculando média da turma
        double mediaTurma = somaNotas / totalAlunos;

        // Calculando porcentagem de alunos reprovados por frequência
        double porcentagemReprovadosFrequencia = (double) alunosReprovados / totalAlunos * 100;

        // Exibindo resultados gerais
        System.out.println("Maior nota da turma: " + maiorNota);
        System.out.println("Menor nota da turma: " + menorNota);
        System.out.println("Média da turma: " + mediaTurma);
        System.out.println("Total de alunos reprovados: " + alunosReprovados);
        System.out.println("Porcentagem de alunos reprovados por frequência: " + porcentagemReprovadosFrequencia + "%");

        scanner.close();
    }
}
