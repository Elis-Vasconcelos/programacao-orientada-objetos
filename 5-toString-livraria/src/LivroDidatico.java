public class LivroDidatico extends Livro {
  private String area;

  public LivroDidatico(String nome, String autorPrincipal, String editora, String resumo, double preco, String area) {
    super(nome, autorPrincipal, editora, resumo, preco);
    this.area = area;
  }

  public String getArea() {
    return this.area;
  }

  public void setArea(String area) {
    this.area = area;
  }

  @Override
  public double calcularPrecoFinal(boolean vip){
    double precoFinal = super.getPreco();
    precoFinal += super.getPreco()*0.005;
    if (vip) {
      precoFinal -= precoFinal*0.1;
    }
    return precoFinal;
  }

  @Override
  public String toString() {
    return super.toString() + "\nArea: " + this.getArea();
  }
}