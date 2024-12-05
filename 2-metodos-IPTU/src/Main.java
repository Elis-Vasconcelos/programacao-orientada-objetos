public class Main {
  public static void main(String[] args) {
    Imovel imovel = new Imovel(100, Imovel.Tipo.CASA);
    Beneficiario b1 = new Beneficiario("João", "123.456.789-00");
    
    System.out.println("Menu Principal");
    System.out.println("1. Menu Beneficiário");
    System.out.println("2. Menu Serviços IPTU");
    System.out.print("Escolha uma opção: ");

    int opcao = 1;
    switch (opcao) {
        case 1:
            menuBeneficiario();
        case 2:
            menuServicosIPTU();
    }

    int opcao2 = 1;
    public static void menuBeneficiario() {
        switch (opcao2) {
          case 1:
            cadastrarImovel() {
              imovel = new Imovel(area, tipo);
            }
          case 2:
            cadastrarBeneficiario() {
              beneficiario = new Beneficiario(nome, rg);
            }
          case 3:
            associarImovelBeneficiario() {
              beneficiario.imovel = imovel;
              imovel.setBeneficiario(beneficiario);
            }
        }
    }

    public static void menuServicosIPTU() {
      switch (opcao2) {
        case 1:
          consultarProprietarios();
        case 2:
          consultarImoveisProprietarios();
        case 3:
          consultarIptuImovel();
        case 4:
          consultarIptuImovelNaoCadastrados();
        case 5:
          consultarInsencao();
      }
    }
}