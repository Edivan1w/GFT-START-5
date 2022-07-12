package exercicio1;
//1. Utilizando laços de repetição crie uma aplicação que receba a idade e o peso de 10
//pessoas. Calcule e mostre as médias dos pesos das pessoas da mesma faixa etária.
//As faixas etárias são: de 1 a 10 anos, de 11 a 20 anos, de 21 a 30 anos e maiores de
//31 anos.(Vale 2 pontos)
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import java.util.stream.Collectors;

public class Main {

public static void main(String[] args) {
		
		List<Pessoa> list = Arrays.asList(
				new Pessoa(80, 60d),
				new Pessoa(20, 50d),
				new Pessoa(30, 70d),
				new Pessoa(8, 35d),
				new Pessoa(9, 50d),
				new Pessoa(10, 45d),
				new Pessoa(18, 79d),
				new Pessoa(15, 60d),
				new Pessoa(22, 60d),
				new Pessoa(45, 80d));
		
		
		List<Pessoa> collect = list.stream().filter(p -> p.getIdade() >= 1 && p.getIdade() <= 10).collect(Collectors.toList());
		System.out.println("de 1 a 10 anos: média de peso = " +collect.stream().mapToDouble(Pessoa::getPeso).average().getAsDouble());
		
		List<Pessoa> collect2 = list.stream().filter(p -> p.getIdade() > 11 && p.getIdade() < 20).collect(Collectors.toList());
		System.out.println("de 11 a 20 anos: média de peso = " + collect2.stream().mapToDouble(Pessoa::getPeso).average().getAsDouble());
		
		List<Pessoa> collect3 = list.stream().filter(p -> p.getIdade() > 21 && p.getIdade() < 30).collect(Collectors.toList());
		System.out.println("de 21 a  30 anos: média de peso = " + collect3.stream().mapToDouble(Pessoa::getPeso).average().getAsDouble());
		
		List<Pessoa> collect4 = list.stream().filter(p -> p.getIdade() > 21 && p.getIdade() < 30).collect(Collectors.toList());
		System.out.println("maiores de 31: média de peso = " + collect4.stream().mapToDouble(Pessoa::getPeso).average().getAsDouble());
		
		
//		List<Pessoa> listUmADez = new ArrayList<Pessoa>();
//		List<Pessoa> listDezAVinte = new ArrayList<Pessoa>();
//		List<Pessoa> listVinteUmATrinta = new ArrayList<Pessoa>();
//		List<Pessoa> listMaioresTrintaEUm = new ArrayList<Pessoa>();
		
		
		
		
//		for (Pessoa pessoa : list) {
//			if(pessoa.getIdade() >= 1 && pessoa.getIdade() <= 10) {
//				listUmADez.add(pessoa); 
//			}
//			if(pessoa.getIdade() > 11 && pessoa.getIdade() < 20) {
//				listDezAVinte.add(pessoa);
//			}
//			
//				
//			if(pessoa.getIdade() > 21 && pessoa.getIdade() < 30) {
//				listVinteUmATrinta.add(pessoa);
//			}
//			
//			if(pessoa.getIdade() > 21 && pessoa.getIdade() < 30) {
//				listMaioresTrintaEUm.add(pessoa);
//			}
//		}
		
		
		
		
		
		
//		System.out.println("de 1 a 10 anos " +listUmADez.stream().mapToDouble(Pessoa::getPeso).average());
//		System.out.println("de 11 a 20 anos " +listDezAVinte.stream().mapToDouble(Pessoa::getPeso).average());
//		System.out.println("de 21 a  30 anos " +listVinteUmATrinta.stream().mapToDouble(Pessoa::getPeso).average());
//		System.out.println("maiores de 31 " +listUmADez.stream().mapToDouble(Pessoa::getPeso).average());
	
		}
}
