package homework;

public class Exercicio03 {
	
	//Verificar o peso dos metais e informar o mais pesado

	public static void main(String[] args) {
		double ouro = 10;
		double prata = 5;
		double bronze = 20;
		
		if (ouro > prata && ouro > bronze) {
				System.out.println("Ouro e o metal mais pesado");
			} 
			else if (prata > bronze){
				System.out.println("Prata e o metal mais pesado");
			}
			else {
				System.out.println("Bronze e o metal mais pesado");
			}	
	}

}
