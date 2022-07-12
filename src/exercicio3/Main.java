package exercicio3;
//Faça um programa que contenha a classe automóvel com um atributo combustível e
//duas classes que herdam desta Esportivo e Caminhão e um programa que receba um
//Esportivo ou um caminhão e retorne o combustível correspondente, a saber: Esportivo
//utiliza Gasolina e Caminhão utiliza Diesel. (vale 3 pontos)

public class Main {
	
	public static void main(String[] args) {
		
		Caminhao caminhao = new Caminhao();
		caminhao.setCombustivel("Diesel");
		
		Esportivo esportivo = new Esportivo();
		esportivo.setCombustivel("Gasolina");
		
		AutomovelUtil util = new AutomovelUtil();
		System.out.println("Caminhão tipo de combustìvel: " + util.tipoCombustivel(caminhao));
		System.out.println("Esportivo tipo de combustìvel: " + util.tipoCombustivel(esportivo));
	}

}
