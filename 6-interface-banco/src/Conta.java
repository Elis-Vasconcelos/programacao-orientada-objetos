public abstract class Conta {
  private String nomeTitular;
  private String agencia;
  private double saldo;
  private int numConta;

  public Conta(String nomeTitular, String agencia, double saldo, int numConta) {
    this.nomeTitular = nomeTitular;
    this.agencia = agencia;
    this.saldo = saldo;
    this.numConta = numConta;
  }

  public String getNomeTitular() {
    return nomeTitular;
  }

  public String getAgencia() {
    return agencia;
  }

  public double getSaldo() {
    return saldo;
  }
  
  public int getNumDaConta() {
    return numConta;
  }

  public void depositar(double valor){
    this.saldo += valor;
  }

  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }

  public abstract void saque(double valor);
}