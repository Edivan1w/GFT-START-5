package exercicio2;

import java.math.BigDecimal;

public class Contacorrente extends Conta {

	public Contacorrente(Integer numro, Titular titular, BigDecimal saldo) {
		super(numro, titular, saldo);
	}

	@Override
	public BigDecimal rendimentoMensal() {
		BigDecimal valor = this.getSaldo().multiply(new BigDecimal("0.05"));
		System.out.println(valor);
		this.setSaldo(this.getSaldo().add(valor));
		return valor;
	}
	
}
