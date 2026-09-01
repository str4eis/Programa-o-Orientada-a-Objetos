public class CadastroAluno {
    public static void main(String[] args) {
        class Aluno {
            String nome;
            double nota;
            String curso;
            void mostrar() {
                IO.println("Nome: " + nome);
                IO.println("Nota: " + nota);
                IO.println("Curso: " + curso);
                IO.println("Situação: " + (nota >= 7 ? "Aprovado\n" : "Reprovado\n"));
                for (int i = 1; i <= 5; i++) {
                    IO.println("Estudar Java é ótimo!" + i);
                }
            }          
        }
        Aluno aluno1 = new Aluno();
        aluno1.nome = "Ester Reis";
        aluno1.nota = 10;
        aluno1.curso = "Sistemas para Internet";
        aluno1.mostrar();
    }   
}