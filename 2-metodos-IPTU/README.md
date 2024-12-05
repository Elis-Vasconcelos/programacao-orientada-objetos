Para o cenário abaixo, finalize a implementação iniciada na sala de aula (classes no final do texto)
Um programa de atendimento ao cidadão precisa cadastrar as pessoas que serão beneficiadas para quitação de IPTU. Para um beneficiário, os atributos necessários são: nome, RG, CPF, valor da renda. Para iniciar o cadastro de um beneficiário é preciso ao menos o nome e RG. Um Beneficiário pode possuir vários imóveis (casa, apartamento, etc...) e estes possuem área em metro quadrado e valor do IPTU. O valor do IPTU é calculado no momento que se cadastra um imóvel. 
Para o cálculo do débito do IPTU em 2020 foi definido um valor de referencia para cada metro quadrado dependendo do tipo imóvel 

Casa =R$ 59,76; 

Apartamento =R$ 72,98; 

E para os outros tipos de imóvel =R$ 98,58 

 

O cálculo do valor do IPTU é feito da seguinte forma IPTU= Valor de referencia * área

 

Existem diferentes formas de avaliação para recebimento de um benefício de isenção do pagamento do IPTU. Este beneficio pode ser total ou parcial. A isenção corresponde as seguintes situações: 

A isenção é total qdo Valor do Imóvel é menor ou igual ao valor de base isenção, neste caso, Valor Base  96066.57. 

A isenção é de 50%. Qdo o Beneficiário é servidor ou baixa renda (Baixa renda

=1024).

Existe um também desconto para o tempo de moradia. Quando aos e cadastrar o imóvel é informado tempo de moradia (em anos). Se este for acima de 10 anos, o beneficiário recebe isenção total; 

 

Para a aplicação do IPTU crie em métodos separados: Um Menu Principal, Um Menu Beneficiário (onde é possível cadastrar e associar imóveis ao proprietários) e um Menu serviços IPTU (Consultas: Proprietarios, Imoveis por proprietários, Valor do IPTU de um imóvel, Consultar o valor do IPTU de um imóvel ainda não cadastrado, consulta a quanto tenho direito de insenção).

Classes já iniciadas

public class Beneficiario {
private String nome, cpf, rg;
private double renda;
private Imovel imovel;

public Beneficiario(String nome, String cpf, String rg, double renda, int area){
this.renda = renda;
this.nome = nome;
this.rg = rg;
this.renda = renda;
}
}

=========

public class Imovel {
private int area;
public enum Tipo {CASA,APTO,OUTRO};
private Tipo tipo;
private double valorIPTU, valorIsencao;

public Imovel(int area, Tipo tipo){
this.area = area;
this.tipo = tipo;
this.valorIPTU = calculaIPTU();
// this.valorIsencao = calculaIPTU(); (A COMPLETAR)
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



}