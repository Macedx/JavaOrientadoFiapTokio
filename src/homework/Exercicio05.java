package homework;

public class Exercicio05 {
	
	//Faça um programa que verifique se o usuário digitado é igual a 'administrador' e
	//se a senha digitada é igual a 123

	public static void main(String[] args) {
		String nome = "administrador";
		int senha = 123;
		
		if (nome.equalsIgnoreCase("adminsitrador") && senha == 123) {
			System.out.println("Logado");
		} else {
			System.out.println("Usuario ou senha invalidos");
		}

	}

}
