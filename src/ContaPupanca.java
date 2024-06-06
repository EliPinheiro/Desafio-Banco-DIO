public class ContaPupanca extends Conta{
    public ContaPupanca(Cliente cliente) {
        super(cliente);


    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Impressão de extrato Conta Poupança ===");
        super.impresao();
    }

}
