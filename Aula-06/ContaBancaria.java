public class ContaBancaria {

    String titular;
    double saldo;
    static int totalContas = 0;

    public ContaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
        totalContas++;
    }

    public ContaBancaria(String titular) {
        this(titular, 0.0); // Chama o construtor acima com saldo inicial 0.0
    }

    void mostrarConta() {
        IO.println("Titular da conta: " + titular);
        IO.println("Saldo da conta: " + saldo);
        IO.println("Total de contas: " + totalContas);
    }

    void depositar(double valor) {
        saldo += valor;
        IO.println("Depósito realizado com sucesso! Novo saldo: " + saldo);
    }

    void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            IO.println("Saque realizado com sucesso! Novo saldo: " + saldo);
        } else {
            IO.println("Saldo insuficiente para realizar o saque.");
        }
    }

    void exibirSaldo() {
        IO.println("Saldo atual: " + saldo);
    }

    record Municipio(String nome, String estado, long populacao, double area) {
        double densidade() {
            return populacao / area;
        }
        void mostrarMunicipio() {
            IO.println("Nome: " + nome);
            IO.println("Estado: " + estado);
            IO.println("População: " + populacao);
            IO.println("Área: " + area);
            IO.println("Densidade populacional: " + densidade() + " habitantes por km²");
        }
    }

}

void main() {
    var Recife = new ContaBancaria.Municipio("Recife", "PE", 1640000, 112.3);
    var SãoLuís = new ContaBancaria.Municipio("São Luís", "MA", 1100000, 125.4  );
    var Maceió = new ContaBancaria.Municipio("Maceió", "AL", 910000, 125.4);
    var Salvador = new ContaBancaria.Municipio("Salvador", "BA", 2880000, 693.8);
    var Fortaleza = new ContaBancaria.Municipio("Fortaleza", "CE", 2680000, 313.8);
    List<ContaBancaria.Municipio> municipios = new ArrayList<>(List.of(
        Recife, SãoLuís, Maceió, Salvador, Fortaleza
    ));
    municipios.sort(Comparator.comparingDouble(ContaBancaria.Municipio::densidade).reversed());
    IO.println("Municípios ordenados por densidade populacional (maior para menor):");
    for (ContaBancaria.Municipio municipio : municipios) {
        municipio.mostrarMunicipio();
        IO.println();
    }
    // ContaBancaria conta1 = new ContaBancaria("Ester", 1000.0);
    // ContaBancaria conta2 = new ContaBancaria("João", 500.0);
    // ContaBancaria conta3 = new ContaBancaria("Maria", 2000.0);
    // conta1.mostrarConta();
    // conta1.depositar(500.0);
    // conta1.sacar(200.0);
    // conta1.exibirSaldo();
    // IO.println("Total de contas criadas: " + ContaBancaria.totalContas);
    
}