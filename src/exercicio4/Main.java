package exercicio4;

import java.util.Scanner;

//A idade permitida para doar sangue � entre 18 e 67 anos. Fa�a um aplicativo que
//pergunte a idade de uma pessoa e diga se ela pode doar sangue ou n�o. Use alguns
//dos operadores l�gicos OU (||) e E (&&). (vale 2 pontos)
public class Main {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite sua idade para conferir se voc� pode doar sangue");
		int idade = scanner.nextInt();
		if(idade < 18 || idade > 67 ) {
			System.out.println("Voc� n�o est� na idade adequada para doar sangue");
		}else {
			System.out.println("Parabens pela iniciativa, voc� est� na idade adequada para doar sangue");
		}
		
		
		
	}
}
