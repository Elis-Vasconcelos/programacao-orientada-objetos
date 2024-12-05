public class Main {
  public static void main(String[] args) {
    Livraria livraria = new Livraria("Livraria de Coraline");
    
    Livro OrgulhoEPreconceito =new Livro("Orgulho e Preconceito", "Jane Austen", "Editora Saraiva", "Romance de época", 20.0);
    Livro MobyDick = new Livro("Moby Dick", "Herman Melville", "Editora Saraiva", "Ficção famosa", 30.0);
    LivroDidatico LivroDidatico = new LivroDidatico("Física quântica", "Stephen Hawking","Editora Nova", "Não-ficção", 30.0, "Física");
    Revista Revista = new Revista("Revista de Ciência", "Editora Nova", 20.0, "Anual");
    Revista Revista2 = new Revista("Revista Veja", "Editora Nova", 20.0, "Semestral");

    System.out.println(livraria.emitirNotaFiscal(OrgulhoEPreconceito, 2, false));
    System.out.println(livraria.emitirNotaFiscal(MobyDick, 3, false));
    System.out.println(livraria.emitirNotaFiscal(LivroDidatico, 1, true));
    System.out.println(livraria.emitirNotaFiscal(Revista, 1, false));
    
    System.out.println("\nRevista Ciência tem mesma editora que Revista Veja? " + Revista.editorasIguais(Revista2));
  }
}