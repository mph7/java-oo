package aulapratica1;

public class PessoaApp {
  public static void main(String[] args) {
    Pessoa pessoa1 = new Pessoa(1, "Pedor");
    Pessoa pessoa2 = new Pessoa(2, "Juan");

    System.out.println("Nome do objeto pessoa1: " + pessoa1.getNome());
    System.out.println("Nome do objeto pessoa2: " + pessoa2.getNome());

    pessoa1.setNome("Pedro");

    System.out.println("Novo nome do objeto pessoa1: " + pessoa1.getNome());
  }
}
