package aulapratica3;

public class ContaCorrenteApp {

  public static void main(String[] args) {
    ContaCorrente contacomum = new ContaCorrente(37345, 2564);
    ContaCorrente contaespecial = new ContaCorrente(1932, 2564, 3500.00f);

    System.out.println("Cliente Comum");
    System.out.println("Numero: " + contacomum.getNumero());
    System.out.println("Agencia: " + contacomum.getAgencia());
    System.out.println("---------------------------------------------------");
    System.out.println("Cliente Especial");
    System.out.println("Numero: " + contaespecial.getNumero());
    System.out.println("Agencia: " + contaespecial.getAgencia());
    System.out.println("Numero: " + contaespecial.getLimite());
  }
}
