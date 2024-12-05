public class Automovel { 
  public static final byte movidoAGasolina = 1;
  public static final byte movidoAAlcool = 2;
  public static final byte movidoADiesel = 3;
  private static final byte numeroMaximoDePrestacoes = 24;
  
  private String modelo;
  private String cor;
  private byte combustivel;

  public Automovel(String modelo, String cor, byte combustivel) { 
    this.modelo = modelo;
    this.cor = cor;
    this.combustivel = combustivel;
  }

  public String getModelo() {
    return modelo;
  }

  public String getCor() {
    return cor;
  }

  public byte getCombustivel() {
    return combustivel;
  }

  public byte getNumeroMaximoPrestacoes() {
    return numeroMaximoDePrestacoes;
  }

  public byte quantasPrestacoes() { 
    return numeroMaximoDePrestacoes; 
  }

  public float quantoCusta() { 
    float preco = 0;
    switch (getCombustivel()) { 
      case movidoAGasolina: preco = 12000; break;
      case movidoAAlcool: preco = 10500; break;
      case movidoADiesel: preco = 11000; break;
    }
   return preco;
  }
  
   public String toString() { 
    String resultado;
    resultado = getModelo()+" "+getCor()+"\n";
    switch(getCombustivel()) { 
      case movidoAGasolina: resultado += "Gasolina \n"; break;
      case movidoAAlcool: resultado += "Álcool \n"; break;
      case movidoADiesel: resultado += "Diesel \n"; break;
    }
   return resultado;
  }
}
