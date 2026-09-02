void main() {

    String nome = "Ester Vitoria Reis de Lima";
    
    IO.println(nome.length());           // 28  — numero de caracteres
    IO.println(nome.toUpperCase());      // ESTER VITORIA REIS DE LIMA
    IO.println(nome.substring(0, 5));    // Ester
    IO.println(nome.contains("Reis"));     // true
    
}