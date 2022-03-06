package loja.situacao;

import loja.Pedido;
import loja.exception.StateException;

public abstract class Situacao {
	
	public abstract void abrirChamado();
	
	public void pagar(Pedido pedido) {
		throw new StateException("N�o pode mudar para situa��o Pago");
	}
	
	public void cancelar(Pedido pedido) {
		throw new StateException("N�o pode mudar para situa��o Cancelado");
	}
	
	public void entregar(Pedido pedido) {
		throw new StateException("N�o pode mudar para situa��o Entregue");
	}
	
	public void reabrir(Pedido pedido) {
		throw new StateException("N�o pode mudar para situa��o Aberto");
	}

}
