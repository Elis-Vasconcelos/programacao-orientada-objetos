
/**
 * Escreva uma descrição da classe Linha aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
import java.util.ArrayList;

public class Linha
{
    private String codigo, cidadePartida,cidadeDestino, horarioSaida;
    private double distancia;
    private ArrayList<Onibus> listaOnibus;


    /**
     * Construtor para objetos da classe Linha
     */
    public Linha(String codigo, String cidadePartida, String cidadeDestino, 
    String horarioSaida, double distancia)
    {
        this.codigo = codigo;
        this.cidadePartida = cidadePartida;
        this.cidadeDestino = cidadeDestino;
        this.horarioSaida = horarioSaida;
        this.distancia = distancia; 
        this.listaOnibus = new ArrayList<>();
    }
    
    public Linha(String codigo, String cidadePartida, String cidadeDestino)
    {
        this.codigo = codigo;
        this.cidadePartida = cidadePartida;
        this.cidadeDestino = cidadeDestino;
        this.horarioSaida = "";
        this.distancia = 0; 
        this.listaOnibus = new ArrayList<>();
    }
    /**
     * Um exemplo de um método - substitua este comentário pelo seu próprio
     * 
     * @param  y   um exemplo de um parâmetro de método
     * @return     a soma de x e y 
     */
    public boolean adicionarOnibus(Onibus onibus)
    {
        if (this.listaOnibus.contains(onibus)) {
            return false;
        }
        this.listaOnibus.add(onibus);
        return true;
    }
    
    public boolean removerOnibus(Onibus onibus)
    {
        if (!this.listaOnibus.contains(onibus)) {
            return false;
        }
        this.listaOnibus.remove(onibus);
        return true;
    }
    
    public boolean removerOnibus(String placa)
    {
        for (Onibus onibus: this.listaOnibus) {
            if (onibus.getPlaca().equals(placa)) {
                this.listaOnibus.remove(onibus);
                return true;
            }
        }
        return false;
    }
    public void imprimirDados()
    {
        System.out.println("Codigo: " + this.codigo + "\n Cidade de Patida: " 
        + this.cidadePartida + "\n Cidade Destino: " + this.cidadeDestino + 
        "\n Horario de Saida: " + this.horarioSaida + "\n Distancia cidades: "
        + this.distancia + "\n Numero de onibus: " + this.listaOnibus.size());
    }
    public void imprimirPorStatus(boolean status) {
        for (Onibus onibus : this.listaOnibus) {
            if (onibus.getStatus() == status) {
                onibus.imprimirDados();
            }
        }
        }
}

