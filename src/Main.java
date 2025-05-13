public class Main {
    public static void main(String[] args) {
        Conta conta = new Conta(1000.0, 500.0);

        Cliente c1 = new Cliente("Ana", "123.456.789-00");
        Cliente c2 = new Cliente("Bruno", "987.654.321-00");
        Cliente c3 = null;

        conta.adicionarCliente(c1);
        conta.adicionarCliente(c2);
        conta.adicionarCliente(c3);

        conta.mostrarInfo();

        System.out.println("Programa executou até o final.");
    }
}
