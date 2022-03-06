package loja.desconto;

import java.math.BigDecimal;

import loja.Pedido;

public class SemDesconto extends Desconto {

	public SemDesconto(Desconto proximo) {
		super(proximo);
	}
	
	public SemDesconto() {
		super(null);
	}

	@Override
	public BigDecimal calcular(Pedido pedido) {
		return BigDecimal.ZERO;
	}

	@Override
	protected BigDecimal aplicarDesconto(Pedido pedido) {
		return BigDecimal.ZERO;
	}

	@Override
	protected boolean deveAplicar(Pedido pedido) {
		return true;
	}

}
