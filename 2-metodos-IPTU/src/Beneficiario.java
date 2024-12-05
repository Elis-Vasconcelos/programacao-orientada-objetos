public class Beneficiario {
  private String nome, cpf, rg;
  private double renda;
  private Imovel imovel;
  private boolean foiServidor;

  public Beneficiario(String nome, String cpf, String rg, double renda, Imovel imovel, boolean foiServidor){
    this.renda = renda;
    this.nome = nome;
    this.rg = rg;
    this.imovel = imovel;
    this.foiServidor = foiServidor;
  }

  public Beneficiario(String nome, String rg){
    this.renda = 0;
    this.nome = nome;
    this.rg = rg;
    this.imovel = null;
    this.foiServidor = false;
  }

  public String toString() {
    return "Nome: " + this.nome + "\n" + "Renda: " + this.renda + "\n" + "CPF: " + this.cpf + "\n" + "RG: " + this.rg + "\n" + "Servidor: " + this.foiServidor + "\n" + "Imovel: " + this.imovel;
  }
}