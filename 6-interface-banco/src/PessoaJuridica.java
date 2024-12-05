public class PessoaJuridica extends Cliente {
  private String cnpj;
  private String razaoSocial;

  public PessoaJuridica(String nome, String endereco, String cnpj, String razaoSocial) {
    super(nome, endereco);
    this.cnpj = cnpj;
    this.razaoSocial = razaoSocial;
  }
}