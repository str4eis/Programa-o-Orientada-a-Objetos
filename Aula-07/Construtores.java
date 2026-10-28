// Arquivo: Construtores.java

class Aluno {
    private String nome;
    private int    idade;
    private String curso;
    private String matricula;

    // CONSTRUTOR PADRÃO: executado quando new Aluno()
    Aluno() {
        this.curso     = "Nao informado";
        this.matricula = "0000";
    }

    // CONSTRUTOR COM PARÂMETROS
    Aluno(String nome, int idade, String curso) {
        // "this" diferencia o atributo do parâmetro de mesmo nome
        this.nome      = nome;
        this.idade     = idade;
        this.curso     = curso;
        this.matricula = gerarMatricula();
    }

    // CONSTRUTOR COMPLETO
    Aluno(String nome, int idade, String curso, String matricula) {
        this(nome, idade, curso); // chama o construtor acima
        this.matricula = matricula;
    }

    private String gerarMatricula() {
        return "2025" + (int)(Math.random() * 9000 + 1000);
    }

    void apresentar() {
        IO.println("---");
        IO.println("Nome:      " + nome);
        IO.println("Idade:     " + idade);
        IO.println("Curso:     " + curso);
        IO.println("Matricula: " + matricula);
    }
}

void main() {
    var a1 = new Aluno("Maria Silva", 20, "Informatica para Internet");
    var a2 = new Aluno("Joao Santos", 22, "Sistemas", "2025-0042");

    a1.apresentar();
    a2.apresentar();
}