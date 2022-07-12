package exercicio2;


import java.math.BigDecimal;

public abstract class Conta {

	private Integer numro;
	private Titular titular;
	private BigDecimal saldo;

	public Conta(Integer numro, Titular titular, BigDecimal saldo) {
		this.numro = numro;
		this.titular = titular;
		this.saldo = saldo;
	}

	public abstract BigDecimal rendimentoMensal();

	public Integer getNumro() {
		return numro;
	}

	public Titular getTitular() {
		return titular;
	}

	public BigDecimal getSaldo() {
		return saldo;
	}
	
	public void setSaldo(BigDecimal saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "Conta [numro=" + numro + ", titular=" + titular + ", saldo=" + saldo + ", rendimentoMensal="
				+ rendimentoMensal() + "]";
	}

	

	
}

