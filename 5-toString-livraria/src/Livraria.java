public class Livraria {
  private String nome;

  public Livraria(String nome){
    this.nome = nome;
  }

  public String getNome(){
    return this.nome;
  }

  public void setNome(String nome){
    this.nome = nome;
  }

  public String emitirNotaFiscal(Livro livro, int qtd, boolean vip){
    if (livro instanceof LivroDidatico) {
      LivroDidatico livroDid = (LivroDidatico) livro;
      if (livroDid.getArea() == "Historia" || livroDid.getArea() == "Filosofia") {
        livro.setPreco(livro.getPreco()*0.95);
      }
    }
    String nota = "\n*******Nota Fiscal*******\n" + "\nLivraria: " + this.getNome() + "\nProduto: " + livro.getNome() + "\nQuantidade de títulos comprados: " + qtd + "\nPreço: " + livro.calcularPrecoFinal(vip)*qtd;
    return nota;
  } 

  public String emitirNotaFiscal(Revista revista, int qtd, boolean vip){
    return "\n*******Nota Fiscal*******\n" + "\nLivraria: " + this.getNome() + "\nProduto: " + revista.getNome() + "\nQuantidade de títulos comprados: " + qtd + "\nPreço: " + revista.calcularPrecoFinal(vip)*qtd + "\nPeriodicidade: " + revista.getPeriodicidade();
  } 
}
