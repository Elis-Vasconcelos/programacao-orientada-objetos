
/**
 * Escreva uma descrição da classe Onibus aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Onibus
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private String placa, dataRevisao, nomeMotorista, horarioSaida;
    private int capacidade;
    private boolean status;

    /**
     * Construtor para objetos da classe Onibus
     */
    public Onibus(String placa, String dataRevisao, String nomeMotorista, 
    String horarioSaida, int capacidade, boolean status)
    {
        this.placa = placa;
        this.dataRevisao = dataRevisao;
        this.nomeMotorista = nomeMotorista;
        this.horarioSaida = horarioSaida;
        this.capacidade = capacidade;
        this.status = status;
    }
    public Onibus(String placa, String dataRevisao, 
    String horarioSaida, int capacidade)
    {
        this.placa = placa;
        this.dataRevisao = dataRevisao;
        this.horarioSaida = horarioSaida;
        this.nomeMotorista = "";
        this.capacidade = capacidade;
        this.status = false;
    }
    
    public String getPlaca() {
        return this.placa;
    }
    public boolean getStatus() {
        return this.status;
    }
    /**
     * Um exemplo de um método - substitua este comentário pelo seu próprio
     * 
     * @param  y   um exemplo de um parâmetro de método
     * @return     a soma de x e y 
     */
    public void imprimirDados()
    {
        System.out.println("Placa: " + this.placa + "\n Data ultima revisao: " 
        + this.dataRevisao + "\n Motorista: " + this.nomeMotorista + 
        "\n Horario de Saida: " + this.horarioSaida + "\n Capacidade: "
        + this.capacidade + "\n Status: "+ (this.status ? "Ativo" : "Inativo"));
    }
}
