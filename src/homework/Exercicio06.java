package homework;

public class Exercicio06 {
	
	//Faça um programa 

	public static void main(String[] args) {
		double totalCompra = 2000;
		String cupom = "DESCONTO10";
		
		if (totalCompra > 500 || cupom.equalsIgnoreCase("DESCONTO10")) {
			double desconto = totalCompra *0.1;
			totalCompra = totalCompra - desconto;
			System.out.println("Desconto de: R$" + desconto);
			System.out.println("Valor total de compra de: R$" + totalCompra);
		} else {
			System.out.println("Nao ganhou desconto");
		}

	}

}
