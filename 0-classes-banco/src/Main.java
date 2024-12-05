public class Main {
    public static void main(String[] args) throws Exception {
        Pessoa titular = new Pessoa("Elis O. Vasconcelos", "123.456.789-00", "Brazil, Bahia, Camaçari");
        Conta conta = new Conta(titular, "10101010", "Nubank", 1000);
        conta.consultarDados();
        conta.sacar(295);
        System.out.println("SALDO PÓS SAQUE: " + conta.getSaldo());
        conta.depositar(325);
        System.out.println("SALDO PÓS-DEPÓSITO: " + conta.getSaldo());
    }
}