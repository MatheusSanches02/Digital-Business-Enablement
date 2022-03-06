package loja.test;

import java.math.BigDecimal;

import loja.Pedido;
import loja.imposto.CalculadoraDeImposto;
import loja.imposto.IPI;
import loja.imposto.Icms;
import loja.imposto.Iss;

public class TestaImposto {
	public static void main(String[] args) {
	 	Pedido pedido = new Pedido(new BigDecimal(100),1);
	 	CalculadoraDeImposto calculadoraDeImposto = new CalculadoraDeImposto();
	 	BigDecimal imposto = calculadoraDeImposto.calcular(pedido, new IPI());
	 	
	 	System.out.println(imposto);
	}
}
