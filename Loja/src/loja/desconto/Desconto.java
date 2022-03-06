package loja.desconto;

import java.math.BigDecimal;

import loja.Pedido;

public abstract class Desconto {
	
	private Desconto proximo;
	
	public Desconto(Desconto proximo) {
		super();
		this.proximo = proximo;
	}

	public BigDecimal calcular(Pedido pedido) {
		if ( deveAplicar(pedido) ) {
			return aplicarDesconto(pedido);
		}
		
		return proximo.calcular(pedido);
	
	}

	protected abstract BigDecimal aplicarDesconto(Pedido pedido);
	protected abstract boolean deveAplicar(Pedido pedido);

	public Desconto getProximo() {
		return proximo;
	}
}
