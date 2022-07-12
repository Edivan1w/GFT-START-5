package exercicio2;

import java.math.BigDecimal;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(Integer numro, Titular titular, BigDecimal saldo) {
		super(numro, titular, saldo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public BigDecimal rendimentoMensal() {
		return this.getSaldo().multiply(new BigDecimal("0.07"));
	}
	
	

}
