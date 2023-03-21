package sistema;

public class Sistema {
	
	public static void Abastecer(int tipoCombustivel, double valorAbastecer) {
		
		double precoGasolina = 4.75;
		double precoEtanol = 3.85;
		double precoDiesel = 5.25;
		double qtdeCombustivel;
		
		if (tipoCombustivel == 1) {
			qtdeCombustivel = valorAbastecer / precoGasolina;
			System.out.println("Foi abastecido o valor de %.2f, rendendo a quantidade de %.3f");
		} else if (tipoCombustivel == 2) {
			qtdeCombustivel = valorAbastecer / precoEtanol;
		} else {
			qtdeCombustivel = valorAbastecer / precoDiesel;
			System.out.println("Foi abastecido o valor de %.2f, rendendo a quantidade de %.3f");
		}
	}

}
