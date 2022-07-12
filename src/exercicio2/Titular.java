package exercicio2;



public class Titular {
	
	private String nome;
	private Integer idade;
	private String cpf;
	public Titular(String nome, Integer idade, String cpf) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public Integer getIdade() {
		return idade;
	}
	public String getCpf() {
		return cpf;
	}
	@Override
	public String toString() {
		return " [nome=" + nome + ", idade=" + idade + ", cpf=" + cpf + "]";
	}
	
	

}

