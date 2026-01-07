public class App {
    public static void main(String[] args) throws Exception {
        Cliente clienteUm = new Cliente();
        clienteUm.setNome("Vitor");

        Cliente clienteDois = new Cliente();
        clienteDois.setNome("Rotiv");

        Conta ccVitor = new ContaCorrente(clienteUm);
        Conta poupancaVitor = new ContaPoupanca(clienteUm);

        Conta ccRotiv = new ContaCorrente(clienteDois);

        ccVitor.imprimirExtrato();
        poupancaVitor.imprimirExtrato();
        ccRotiv.imprimirExtrato();

        ccVitor.depositar(100);

        ccVitor.imprimirExtrato();
        poupancaVitor.imprimirExtrato();
        ccRotiv.imprimirExtrato();

        ccVitor.transferir(50, poupancaVitor);
        ccVitor.transferir(25, ccRotiv);

        ccVitor.imprimirExtrato();
        poupancaVitor.imprimirExtrato();
        ccRotiv.imprimirExtrato();

        Banco banco = new Banco();
        banco.setContas(java.util.Arrays.asList(ccVitor, ccRotiv, poupancaVitor));
        banco.imprimirClientes();
    }
}
