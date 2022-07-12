package exercicio4;

import java.util.Scanner;

//A idade permitida para doar sangue é entre 18 e 67 anos. Faça um aplicativo que
//pergunte a idade de uma pessoa e diga se ela pode doar sangue ou não. Use alguns
//dos operadores lógicos OU (||) e E (&&). (vale 2 pontos)
public class Main {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite sua idade para conferir se você pode doar sangue");
		int idade = scanner.nextInt();
		if(idade < 18 || idade > 67 ) {
			System.out.println("Você não está na idade adequada para doar sangue");
		}else {
			System.out.println("Parabens pela iniciativa, você está na idade adequada para doar sangue");
		}
		
		
		
	}
}
