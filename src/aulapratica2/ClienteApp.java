package aulapratica2;

public class ClienteApp {

	public static void main(String[] args){

		ClientePF clientepf = new ClientePF("Pedro", "Bairro", "1235637245");
		ClientePJ clientepj = new ClientePJ("Argamassas", "Rodovia tal", "058395889");
		
		//System.out.println("Cliente pf nome: " + clientepf.getNome());
		//System.out.println("Cliente pj nome: " + clientepj.getNome());
		
		System.out.println(clientepf.toString());
		System.out.println(clientepj.toString());

	}
}