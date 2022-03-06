package loja.desconto;

import java.math.BigDecimal;

import loja.Pedido;

public class CalculadoraDeDesconto {
	
	public BigDecimal calcular(Pedido pedido) {
		Desconto desconto = new DescontoPorValor(
					new DescontoPorTotalDeItens(
					new SemDesconto()	
			));
		
		return desconto.calcular(pedido);
	
	}
	
}
