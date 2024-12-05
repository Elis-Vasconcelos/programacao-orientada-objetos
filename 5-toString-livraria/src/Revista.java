public class Revista  {
  private String nome;
  private String editora;
  private double preco;
  private String periodicidade;

  public Revista(String nome, String editora, double preco, String periodicidade) {
    this.nome = nome;
    this.editora = editora;
    this.preco = preco;
    this.periodicidade = periodicidade;
  }

  public String getNome() {
  	return nome;
  }
  
  public void setNome(String nome) {
  	this.nome = nome;
  }
  
  public String getEditora() {
  	return editora;
  }
  
  public void setEditora(String editora) {
  	this.editora = editora;
  }
  
  public double getPreco() {
  	return preco;
  }
  
  public void setPreco(double preco) {
  	this.preco = preco;
  }
  
  public String getPeriodicidade() {
  	return periodicidade;
  }
  
  public void setPeriodicidade(String periodicidade) {
  	this.periodicidade = periodicidade;
  }

  public boolean editorasIguais(Revista revista) {
    if (revista.getEditora().equals(this.getEditora())) {
      return true;
    }
    return false;
  }

  public double calcularPrecoFinal(boolean vip){
    double precoFinal = this.preco + this.preco*0.01;
    if (vip) {
      precoFinal -= precoFinal*0.02;
    }
    return precoFinal;
  }

  public String toString() {
    return "Nome: " + this.getNome() + "\nEditora: " + this.getEditora() + "\nPreço: " + this.getPreco() + "\nPeriodicidade: " + this.getPeriodicidade();
  }
  
}