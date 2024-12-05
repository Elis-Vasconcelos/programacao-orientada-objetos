import java.util.ArrayList;

public class Banco implements IAuditoria {
  private ArrayList<Conta> contas;
  private ArrayList<Cliente> clientes;
  private ArrayList<String> saquesMaioresQue500;

  public Banco() {
    this.contas = new ArrayList<Conta>();
    this.clientes = new ArrayList<Cliente>();
    this.saquesMaioresQue500 = new ArrayList<String>();
  }

  public void adicionarConta(Conta conta) {
    contas.add(conta);
  }

  public void adicionarCliente(Cliente cliente) {
    clientes.add(cliente);
  }

  public void saque(Conta conta, double valor) {
    if (valor > 500) {
      String saque = "Saque de " + valor + " realizado na conta " + conta.getAgencia() + " do cliente "
          + conta.getNomeTitular() + " excede o limite de 500 reais. \nAgência: " + conta.getAgencia()
          + "\nNúmero da Conta: " + conta.getNumDaConta();
      saquesMaioresQue500.add(saque);
    }
    conta.saque(valor);
  }

  public void deposito(Conta conta, double valor) {
    conta.depositar(valor);
  }

  public void consultarSaquesMaioresQue500() {
    for (String saque : saquesMaioresQue500) {
      System.out.println("\n" + saque);
    }
  }
}