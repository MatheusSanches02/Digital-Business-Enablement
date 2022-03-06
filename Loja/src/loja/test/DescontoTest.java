package loja.test;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;
import java.math.RoundingMode;

import org.junit.jupiter.api.Test;

import loja.Pedido;
import loja.desconto.CalculadoraDeDesconto;

class DescontoTest {

	@Test
	void deveAplicarDescontoParaPedidosCaros() {
		Pedido pedido = new Pedido(new BigDecimal(600), 1);
		CalculadoraDeDesconto calculadoraDeDesconto = new CalculadoraDeDesconto();
		BigDecimal desconto = calculadoraDeDesconto.calcular(pedido);
		
		assertEquals(desconto.setScale(2, RoundingMode.DOWN), new BigDecimal("24.00"));
	}
	
	// desconto por qtde
	@Test
	void deveAplicarDescontoParaPedidosGrandes() {
		Pedido pedido = new Pedido(new BigDecimal(100), 20);
		CalculadoraDeDesconto calculadoraDeDesconto = new CalculadoraDeDesconto();
		BigDecimal desconto = calculadoraDeDesconto.calcular(pedido);
		
		assertEquals(desconto.setScale(2, RoundingMode.DOWN), new BigDecimal("1.00"));
	}
	
	// sem desconto
	@Test
	void deveRetornarZeroSeNaoAplicarOsDescontosAnteriores() {
		Pedido pedido = new Pedido(new BigDecimal(100), 1);
		CalculadoraDeDesconto calculadoraDeDesconto = new CalculadoraDeDesconto();
		BigDecimal desconto = calculadoraDeDesconto.calcular(pedido);
		
		assertEquals(desconto, BigDecimal.ZERO);
	}
}
