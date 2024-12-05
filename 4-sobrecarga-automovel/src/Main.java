public class Main {
  public static void main(String[] args) {
    Automovel auto = new Automovel("Fusca", "Azul", Automovel.movidoAGasolina);
    System.out.print(auto.toString() + "\n");
    Automovel autoLuxo = new AutomovelBasico("Ferrari", "Vermelho",Automovel.movidoAAlcool,true,true,true);
    System.out.print(autoLuxo.toString() + "\n");
    Automovel autoBasico = new AutomovelBasico("Onix", "Branco",Automovel.movidoADiesel, true, true, true);
    System.out.print(autoBasico.toString() + "\n");
}
}