package exercicio3;
//Fa�a um programa que contenha a classe autom�vel com um atributo combust�vel e
//duas classes que herdam desta Esportivo e Caminh�o e um programa que receba um
//Esportivo ou um caminh�o e retorne o combust�vel correspondente, a saber: Esportivo
//utiliza Gasolina e Caminh�o utiliza Diesel. (vale 3 pontos)

public class Main {
	
	public static void main(String[] args) {
		
		Caminhao caminhao = new Caminhao();
		caminhao.setCombustivel("Diesel");
		
		Esportivo esportivo = new Esportivo();
		esportivo.setCombustivel("Gasolina");
		
		AutomovelUtil util = new AutomovelUtil();
		System.out.println("Caminh�o tipo de combust�vel: " + util.tipoCombustivel(caminhao));
		System.out.println("Esportivo tipo de combust�vel: " + util.tipoCombustivel(esportivo));
	}

}
