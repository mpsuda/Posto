package sistema;

import java.util.Scanner;

public class SistemaPosto {
	public static void main(String[] args) {
	
	Scanner entrada = new Scanner(System.in);
		
	System.out.println("Olá! Seja bem vindo ao posto Transforme-se");
	
	System.out.println("Qual serviço deseja fazer? 1-Abastecer");
	int escolhaCliente = entrada.nextInt();
		
	if(escolhaCliente == 1) {
		System.out.println("O preço dos combustíveis: 1-Gasolina R$4.75 2-Etanol R$3.85 3-Diesel R$3.25");
		System.out.println("Qual combustível gostaria de abastecer?");
		int tipoCombustivel = entrada.nextInt();
		
		System.out.println("Quanto gostaria de abastecer?");
		double valorAbastecer = entrada.nextDouble();
		
		entrada.close();
		}
	}
}