public class Corrente extends Conta {
  private static double taxaMensal = 30;
  private double limite;

  public Corrente(String nomeTitular, String agencia, double saldo, double taxa, double limite, int numConta){
    super(nomeTitular, agencia, saldo, numConta);
    this.limite = limite;
  }

  public double getTaxaMensal() {
    return taxaMensal;
  }

  public double getLimite() {
    return limite;
  }

  public void taxar() {
    super.setSaldo(super.getSaldo() - taxaMensal);
  }

  public void saque(double valor) {
    if (valor <= (super.getSaldo() + limite)) {
      super.setSaldo(super.getSaldo() - (valor+limite));
    } else {
      System.out.println("Valor de saque excede o limite");
    }
  }
}