package loja.desconto;

import java.math.BigDecimal;

import loja.Pedido;

public class DescontoPorTotalDeItens extends Desconto {

	public DescontoPorTotalDeItens(Desconto proximo) {
		super(proximo);
	}

	@Override
	protected BigDecimal aplicarDesconto(Pedido pedido) {
		return pedido.getValor().multiply(new BigDecimal(0.01));
	}

	@Override
	protected boolean deveAplicar(Pedido pedido) {
		return pedido.getTotalDeItens() > 10;
	}

}
