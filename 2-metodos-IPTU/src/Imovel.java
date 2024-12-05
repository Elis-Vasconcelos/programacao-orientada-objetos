public class Imovel {
  private int area;
  public enum Tipo {CASA,APTO,OUTRO};
  private Tipo tipo;
  private double valorIPTU, valorIsencao;
  private Beneficiario beneficiario;
  
  public Imovel(int area, Tipo tipo){
    this.area = area;
    this.tipo = tipo;
    this.valorIPTU = calculaIPTU();
    this.valorIsencao = calculaIsencao();
  }
  
  public double calculaIPTU(){
    double valorBase;
    if (this.tipo == Tipo.CASA)
      valorBase = 59.76;
    else if (this.tipo == Tipo.APTO)
      valorBase = 72.98;
    else
      valorBase = 98.58;
    return valorBase * this.area;
  }
  
  public double calculaIsencao(double renda){
    double percent;
    if (renda < 1000.0)
      percent = 0.25;
    else if (renda == 1000.0)
      percent = 0.17;
    else
      percent = 0.9;
      return percent;
  }
  
  public double calculaIsencao(boolean foiServidor){
    double percent = 0;
    if (foiServidor)
      percent = 0.4;
      return valorIPTU * percent;
  }
  
  public double calculaIsencao(int tempoMoradia){
    double valor;
    if (tempoMoradia > 10)
      valor = this.valorIPTU;
    else
      valor = 0;
      return valor;
  }
  
  public double getValorIPTU(){
    return valorIPTU;
  }

  @Override
  public String toString() {
    return "Area: " + this.area + "\n" + "Tipo: " + this.tipo;
  }
}