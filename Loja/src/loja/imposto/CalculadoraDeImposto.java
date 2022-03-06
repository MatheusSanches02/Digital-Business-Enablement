package loja.imposto;

import java.math.BigDecimal;

import loja.Pedido;

public class CalculadoraDeImposto {

	public BigDecimal calcular(Pedido pedido, Imposto imposto){
		return imposto.calcular(pedido);
	}
	
}
