void main() {
    double decimal = 3.9;
    int inteiro = (int)decimal;
    IO.println(inteiro); // Saída: 3 (dessa forma não arredonda, apenas corta os decimais)

    char letra = 'A';
    int codigoAscii = (int)letra;
    IO.println(codigoAscii); // Saída: 65 (código ASCII da letra 'A')
}