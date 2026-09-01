void main() {

    // CONVERSAO IMPLICITA: de menor para maior (Java faz automaticamente)
    int    inteiro = 10;
    double decimal = inteiro;   // int -> double, sem perda de dado
    IO.println("Double: " + decimal);  // 10.0

    // CONVERSAO EXPLICITA (cast): de maior para menor (voce decide)
    double altura  = 1.758;
    int    arredondado = (int) altura;  // corta os decimais, nao arredonda!
    IO.println("Int: " + arredondado); // 1 (nao 2!)

    // PROBLEMA CLASSICO: divisao de inteiros
    int a = 7, b = 2;
    double errado  = a / b;           // resultado: 3.0 (divisao inteira!)
    double correto = (double) a / b;  // resultado: 3.5
    IO.println("Errado:  " + errado);
    IO.println("Correto: " + correto);

    // CONVERTER String para numero
    String textoIdade = "22";
    int    idadeNum   = Integer.parseInt(textoIdade);
    double notaNum    = Double.parseDouble("8.5");
    IO.println("Idade como numero: " + (idadeNum + 1)); // 23

    // CONVERTER numero para String
    int    numero = 100;
    String texto  = String.valueOf(numero);  // "100"
    String texto2 = "" + numero;             // forma rapida: "100"
    IO.println("Numero como texto: " + texto);
}