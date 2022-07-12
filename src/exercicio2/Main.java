package exercicio2;

import java.math.BigDecimal;

//Considerando os conceitos de Orientação a Objetos, crie uma classe abstrata Pai de
//nome Conta com os seguintes atributos (número, titular e saldo) e mais duas classes
//Filhas (ContaCorrente e ContaPoupanca). Na classe Conta deve existir um método
//de nome rendimento que retorna o rendimento mensal da conta, nas classes filhas
//deve existir o mesmo método rendimento, porém com as seguintes regras:
//⦁ Para ContaCorrente, o método rendimento deve retornar o saldo * 0.03;
//⦁ Para ContaPoupanca, o método rendimento deve retornar o saldo * 0.05;
//Por fim, criar uma classe principal que instancie objetos de ContaCorrente e
//ContaPoupanca, adicione no mínimo um valor para cada atributo e imprima cada
//conta (ContaCorrente e ContaPoupanca) com seus devidos rendimentos.
//Obs: Encapsular atributos das classes.(vale 3 pontos)

public class Main {
	public static void main(String[] args) {

		Contacorrente cc = new Contacorrente(556, new Titular("Edivan", 29, "123"), new BigDecimal("15000"));
		cc.rendimentoMensal();

		ContaPoupanca cp = new ContaPoupanca(556, new Titular("Edivan", 29, "123"), new BigDecimal("20000"));
		cp.rendimentoMensal();

		System.out.println(cc);
		System.out.println();
		System.out.println(cp);

	}
}