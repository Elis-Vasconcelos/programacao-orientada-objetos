public class Conta {
  private Pessoa titular;
  private String numero;
  private String agencia;
  private int saldo;

  public Conta(Pessoa titular, String numero, String agencia, int saldo) {
    this.titular = titular;
    this.numero = numero;
    this.agencia = agencia;
    this.saldo = saldo;
  }

  public Pessoa getTitular() {
    return this.titular;
  }

  public String getNumero() {
    return this.numero;
  }

  public String getAgencia() {
    return this.agencia;
  }

  public int getSaldo() {
    return this.saldo;
  }

  public void setTitular(Pessoa titular) {
    this.titular = titular;
  }

  public void setNumero(String numero) {
    this.numero = numero;
  }

  public void setAgencia(String agencia) {
    this.agencia = agencia;
  }

  public void setSaldo(int saldo) {
    this.saldo = saldo;
  }

  public void depositar(int deposito) {
    setSaldo(this.saldo + deposito);
  }

  public void sacar(int saque) {
    setSaldo(this.saldo - saque);
  }

  public void consultarDados() {
    System.out.println("NOME DO TITULAR: " + this.titular.getNome());
    System.out.println("CPF DO TITULAR: " + this.titular.getCpf());
    System.out.println("ENDEREÇO DO TITULAR: " + this.titular.getEndereco() + "\n");
    System.out.println("NÚMERO: " + this.getNumero());
    System.out.println("AGÊNCIA: " + this.getAgencia());
    System.out.println("SALDO: " + this.getSaldo());
  }
}