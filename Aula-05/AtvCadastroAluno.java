import java.util.Scanner;

public class AtvCadastroAluno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do aluno:");
        String nome = sc.nextLine();

        System.out.println("Digite a idade do aluno:");
        int idade = sc.nextInt();
        sc.nextLine(); 

        System.out.println("Digite o curso do aluno:");
        String curso = sc.nextLine(); 

        System.out.println("Digite a nota final do aluno:");
        double nota = sc.nextDouble();

        System.out.println("\n=== Dados do Aluno ===");
        System.out.printf("Nome:  %s%n", nome);
        System.out.printf("Idade: %d anos%n", idade);
        System.out.printf("Curso: %s%n", curso);
        System.out.printf("Nota:  %.2f%n", nota);

        String situacao = nota >= 7.0 ? "Aprovado" : "Reprovado";
        System.out.printf("Situacao: %s%n", situacao);

        sc.close();
    }
}