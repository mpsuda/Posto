package pagamento;

import	java.util.Scanner;

public class Pagamento {
	
	public static void formaPagamento(int formaEscolhida, double valorAbastecido) {
		
		Scanner entrada = new Scanner(System.in);
		
		switch (formaEscolhida) {
		case 1:
			System.out.println("Será pago em dinheiro?");
			
			System.out.println("Qual será a quantia paga?");
			double quantiaDinheiro = entrada.nextDouble();
			
			break;
			
		default:
			break;
		}
	}

}
