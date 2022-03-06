package loja.test;

import java.math.BigDecimal;

import loja.Pedido;
import loja.situacao.Entregue;
import loja.situacao.Pago;

public class TestaSituacao {
	
	public static void main(String[] args) {
		
		Pedido pedido = new Pedido(new BigDecimal(1),1);
		pedido.abrirChamado();
		
		pedido.pagar();
		pedido.abrirChamado();
		
		pedido.entregar();
		pedido.abrirChamado();

		pedido.pagar();
		
		
	}

}
