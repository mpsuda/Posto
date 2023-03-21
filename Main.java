import pessoas.Cliente;
import pessoas.Funcionario;

public class Main {

	public static void main(String[] args) {
		
		//Cliente c1 = new Cliente();
		//c1.nome = "Gabriel";
		//c1.sobreNome = "Nunes";
		
		Cliente c2 = new Cliente("Gilcemar", "Borges");
		Cliente c3 = new Cliente("Renan", "Teixeira");
		Cliente c4 = new Cliente("Ariel", "Xavier");
		
		System.out.println(c2.nome);
		System.out.println(c2.sobreNome);
		
		System.out.println(Funcionario.enderecoPosto);
		
		Credito.pagoNoCredito("Richard");
		Credito.pagoNoCredito("Qualquer nome");

	}

}
