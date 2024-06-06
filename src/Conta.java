public abstract class Conta implements IConta{

    private static  int SEQUENCIAL = 1;
    protected static final int AGENCIA_PADRAO = 1;


    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente){
        this.agencia = AGENCIA_PADRAO;
        this.numero= SEQUENCIAL++;
        this.cliente = cliente;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }


    @Override
    public void sacar(double valor) {
        if (valor > this.saldo){
            System.out.println("Saldo insuficiente para esse saque.");
        }
        else{
            this.saldo -= valor;
        }

    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        if (valor > this.saldo){
            System.out.println("Saldo insuficiente para essa transação.");
        }
        else{
            double transferir = this.saldo - valor;
            this.sacar(valor);
            contaDestino.depositar(valor);
        }

    }

    protected void impresao(){
        System.out.println("Olá,"+ this.cliente.getFirst_nome()+ " "+ this.cliente.getLast_name());
        System.out.printf("Agencia: %d%n", this.agencia);
        System.out.println(String.format("Numero: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }
}
