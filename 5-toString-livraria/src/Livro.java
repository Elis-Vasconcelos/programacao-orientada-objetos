public class Livro {
  private String nome;
  private String autorPrincipal;
  private String editora;
  private String resumo;
  private double preco;

  public Livro(String nome, String autorPrincipal, String editora, String resumo, double preco) {
    this.nome = nome;
    this.autorPrincipal = autorPrincipal;
    this.editora = editora;
    this.resumo = resumo;
    this.preco = preco;
  }

  public String getNome() {
  	return nome;
  }
  
  public void setNome(String nome) {
  	this.nome = nome;
  }
  
  public String getAutorPrincipal() {
  	return autorPrincipal;
  }
  
  public void setAutorPrincipal(String autorPrincipal) {
  	this.autorPrincipal = autorPrincipal;
  }
  
  public String getEditora() {
  	return editora;
  }
  
  public void setEditora(String editora) {
  	this.editora = editora;
  }
  
  public String getResumo() {
  	return resumo;
  }
  
  public void consultarResumo(String resumo) {
  	this.resumo = resumo;
  }
  
  public double getPreco() {
  	return preco;
  }
  
  public void setPreco(double preco) {
  	this.preco = preco;
  }

  public double calcularPrecoFinal(boolean vip){
    double precoFinal = this.preco + this.preco*0.008;
      if (vip){
        precoFinal -= precoFinal * 0.03;
      }
    return precoFinal;
  }

  public String toString(){
    return "Nome: " + this.getNome() + "\nAutor Principal: " + this.getAutorPrincipal() + "\nEditora: " + this.getEditora() + "\nResumo: " + this.getResumo() + "\nPreço: " + this.getPreco();
  }
}