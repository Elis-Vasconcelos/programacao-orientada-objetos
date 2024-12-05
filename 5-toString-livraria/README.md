Uma livraria precisa de um sistema para cadastrar seus títulos. A livraria trabalha com

livros e revistas. Sabe-se que todo livro possui um nome, autor principal, editora, resumo e preço. Existem livros que são didáticos. Para estes também é registrada a sua área (ex. informática, história, geografia, etc). As revistas possuem um nome, editora, preço e periodicidade.

Para o cenário acima, modelar a estrutura das classes e implementar em java. Construir os seguintes métodos:

• Um método para criar uma revista.

• Um método para criar um livro didático.

• Um método para consultar o resumo de um livro.

• Verificar se uma revista tem a mesma editora que outra.

• Método toString para retornar uma String com os dados de um livro ou de

uma revista.

• O preço final de cada titulo é calculado de forma distinta. Os livros didáticos

possuem ISS de 0,5%, livros 0,8% e revistas de 1,0%. O preço final é

calculado acrescentando-se o imposto.

• Construir uma classe aplicaçãoLivraria, que possua o nome da Livraria

acessível para todas as instâncias de livros e revistas.

• Nesta Livraria deve-se implementar um método emitir a nota fiscal. Na nota

fiscal deve aparecer o nome da livraria, o nome do Titulo, a quantidade de títulos comprados e o preço total a ser pago.  Para simplificação

considere que o método emitir nota fiscal é para apenas um produto. 

Na hora da emissão o atendente pode dar um desconto se o cliente mostrar o cartão VIP (desconto de 3% de para livro, 10% para Livro didático e 2% para revista). emitirNotaFiscal(titulo t, int qtd, boolean vip)

Adicionalmente se for um livro didático das áreas História e Filosofia acrescenta-se um desconto de 5%. (casting para acessar getArea())