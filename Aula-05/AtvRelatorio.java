public static void main(String[] args) {
    
    class Aluno {
        String nome;
        int matricula;
        double nota;
    }


    Aluno a1 = new Aluno();
    a1.nome = "Maria Silva";
    a1.matricula = 20;
    a1.nota = 8.75;

    Aluno a2 = new Aluno();
    a2.nome = "Joao Santos";
    a2.matricula = 22;
    a2.nota = 7.30;

    Aluno a3 = new Aluno();
    a3.nome = "Ana Lima";
    a3.matricula = 19;
    a3.nota = 9.50;

    Aluno a4 = new Aluno();
    a4.nome = "Carlos Souza";
    a4.matricula = 21;
    a4.nota = 6.80;

    System.out.format("%-15s %10s %8s%n", "Nome", "Matrícula", "Nota");
    System.out.format("%-15s 2026-%04d %8.2f%n", a1.nome, a1.matricula, a1.nota);
    System.out.format("%-15s 2026-%04d %8.2f%n", a2.nome, a2.matricula, a2.nota);
    System.out.format("%-15s 2026-%04d %8.2f%n", a3.nome, a3.matricula, a3.nota);
    System.out.format("%-15s 2026-%04d %8.2f%n", a4.nome, a4.matricula, a4.nota);

    //Saída:
    //Nome            Matrícula     Nota
    //Maria Silva     2026-0020     8.75
    //Joao Santos     2026-0022     7.30        
    //Ana Lima        2026-0019     9.50
    //Carlos Souza    2026-0021     6.80
}