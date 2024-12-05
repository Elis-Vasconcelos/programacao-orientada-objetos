public class AutomovelBasico extends Automovel {
  private boolean quintaMarcha;
  private boolean limpadorVidroTraseiro;
  private boolean multmidia;

  public AutomovelBasico(String m, String c, byte comb, boolean qm,
      boolean lvt, boolean mult) {
      super(m, c, comb);
      this.quintaMarcha = qm;
      this.limpadorVidroTraseiro = lvt;
      this.multmidia = mult;
  }

  public AutomovelBasico(String m, String c, byte comb) {
    super(m, c, comb);
    this.quintaMarcha = true;
    this.limpadorVidroTraseiro = true;
    this.multmidia = true;
  }

  public boolean getQuintaMarcha() {
    return quintaMarcha;
  }

  public boolean getLimpadorVidroTraseiro() {
    return limpadorVidroTraseiro;
  }
  public boolean getMultimidia() {
    return multmidia;
  }

  public byte getNumeroMaximoDePrestacoes() {
    return super.quantasPrestacoes();
  }

  @Override
  public float quantoCusta() { 
    float preco = super.quantoCusta();
    if (getQuintaMarcha()){}
      preco = preco + 2800;
    if (getLimpadorVidroTraseiro())
      preco = preco + 650;
    if (getMultimidia() )
      preco = preco + 3000;
    return preco;
   } 

  @Override
   public String toString() { 
    String resultado = super.toString();
     if (getQuintaMarcha() == true)
      resultado += "Com cinco marchas \n";
     if (getLimpadorVidroTraseiro() == true)
      resultado += "Com limpador traseiro \n";
     if (getMultimidia() == true)
      resultado += "Com kit multmidia \n";
     return resultado;
   } 
}