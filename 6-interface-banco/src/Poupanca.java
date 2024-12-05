public class Poupanca extends Conta {
  private float rendimentoMensal;

  public Poupanca(String nomeTitular, String agencia, double saldo, float rendimento, int numConta){
    super(nomeTitular, agencia, saldo, numConta);
    this.rendimentoMensal = rendimento;
  }

  public float getRendimentoMensal() {
    return rendimentoMensal;
  }

  public void render() {
    super.setSaldo(super.getSaldo()*(1+rendimentoMensal));
  }

  @Override
  public void saque(double valor) {
    super.setSaldo(super.getSaldo() - valor);
  }
}