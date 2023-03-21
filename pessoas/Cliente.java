package pessoas;

public class Cliente {
	public String nome;
	public String sobreNome;
	public int idade;
	
	public Cliente(String nomeRecebido, String SobreNomeRecebido) {
		nome = nomeRecebido;
		sobreNome = SobreNomeRecebido;
	}
	
	public void dizNomeCliente(String nomeCliente) {
		System.out.println("Olá! Meu nome é: " + nomeCliente);
	}
}
