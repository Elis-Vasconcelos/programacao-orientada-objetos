public class Pessoa {
  private String nome;
  private String cpf;
  private String endereco;

  public Pessoa(String nome, String cpf, String endereco) {
    this.nome = nome;
    this.cpf = cpf;
    this.endereco = endereco;
  }
  
  public String getNome() {
    return this.nome;
  }

  public String getCpf() {
    return this.cpf;
  }

  public String getEndereco() {
    return this.endereco;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }
  
  public void setCpf(String cpf) {
    this.cpf = cpf;
  }
  
  public void setEndereco(String endereco) {
    this.endereco = endereco;
  }
}