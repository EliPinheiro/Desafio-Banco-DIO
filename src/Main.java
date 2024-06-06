public class Main {
    public static void main(String[] args) {

        Banco banco = new Banco("Itau");

        Cliente eli = new Cliente("Eli", "Pinheiro", 30, 120);
        Cliente dalia = new Cliente("Dalia", "Peçanha", 32, 131);
        Cliente pyetra = new Cliente("Pyetra", "Pinheiro", 0, 123);

        banco.adicionarCliente(eli);
        banco.adicionarCliente(dalia);
        banco.adicionarCliente(pyetra);


        Conta EliCorrente = new ContaCorrente(eli);
        Conta DaliaPoupanca = new ContaPupanca(dalia);


        EliCorrente.depositar(400);
        DaliaPoupanca.depositar(500);
        EliCorrente.transferir(200, DaliaPoupanca);

        EliCorrente.imprimirExtrato();
        DaliaPoupanca.imprimirExtrato();


        banco.exibirClientes();


    }
}
