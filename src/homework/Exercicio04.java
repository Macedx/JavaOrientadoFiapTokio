package homework;

public class Exercicio04 {
	
	//Exibir os números de 0 a 100, exceto os que estão no intervalo de 50 a 75

	public static void main(String[] args) {
		for (int i = 0; i <= 100; i++) {
			if (i >= 50 && i <= 75) {
				continue;
			}
			System.out.println(i);
		}

	}

}
