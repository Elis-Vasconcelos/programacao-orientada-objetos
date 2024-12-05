public class AutomovelLuxo extends AutomovelBasico {
  private static final byte numeroMaximoDePrestacoes = 36;
  private boolean direcaoHidraulica;
  private boolean cambioAutomatico;
  private boolean vidrosEletricos;
  
  public AutomovelLuxo(String m, String c, byte comb, boolean qm, boolean lvt, boolean mult, boolean dh, boolean ca, boolean ve) {
    super(m, c, comb, qm, lvt, mult);
    this.direcaoHidraulica = dh;
    this.cambioAutomatico = ca;
    this.vidrosEletricos = ve;
  }

  public AutomovelLuxo(String m, String c, byte comb, boolean qm, boolean lvt, boolean mult) {
    super(m, c, comb, qm, lvt, mult);
    this.direcaoHidraulica = true;
    this.cambioAutomatico = true;
    this.vidrosEletricos = true;
  }


  public boolean getDirecaoHidraulica() {
    return direcaoHidraulica;
  }

  public boolean getCambioAutomatico() {
    return cambioAutomatico;
  }

  public boolean getVidrosEletricos() {
    return vidrosEletricos;
  }

  @Override
  public byte getNumeroMaximoDePrestacoes() {
    return numeroMaximoDePrestacoes;
  }
  
  @Override
  public float quantoCusta() { 
    float preco = super.quantoCusta();
    if (getDirecaoHidraulica()){}
      preco = preco + 5340;
    if (getCambioAutomatico())
      preco = preco + 7500;
    if (getVidrosEletricos() )
      preco = preco + 3000;
    return preco;
   } 

  @Override
   public String toString() { 
    String resultado = super.toString();
     if (getDirecaoHidraulica() == true)
      resultado += "Com direção hidráulica \n";
     if (getCambioAutomatico() == true)
      resultado += "Com cambio automático \n";
     if (getVidrosEletricos() == true)
      resultado += "Com vidros elétricos \n";
     return resultado;
   } 

  
}