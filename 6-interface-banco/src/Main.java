// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

public class Main {
  public static void main(String[] args) {
    Banco banco = new Banco();
    
    Corrente corrente = new Corrente("João", "1234", 1000, 0.1, 1000, 1134);
    Poupanca poupanca = new Poupanca("Maria", "5678", 2000, 0.1f, 2);

    banco.adicionarConta(corrente);
    banco.adicionarConta(poupanca);

    banco.deposito(corrente, 400);
    banco.saque(corrente, 2000);
    banco.deposito(corrente, 700);
    banco.saque(corrente, 300);

    banco.deposito(poupanca, 500);
    banco.saque(poupanca, 100);
    banco.deposito(poupanca, 600);
    banco.saque(poupanca, 700);

    corrente.taxar();
    poupanca.render();
    
    banco.consultarSaquesMaioresQue500();
  }
}

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }