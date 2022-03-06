package loja.situacao;

import loja.Pedido;
import loja.exception.StateException;

public abstract class Situacao {
	
	public abstract void abrirChamado();
	
	public void pagar(Pedido pedido) {
		throw new StateException("Não pode mudar para situação Pago");
	}
	
	public void cancelar(Pedido pedido) {
		throw new StateException("Não pode mudar para situação Cancelado");
	}
	
	public void entregar(Pedido pedido) {
		throw new StateException("Não pode mudar para situação Entregue");
	}
	
	public void reabrir(Pedido pedido) {
		throw new StateException("Não pode mudar para situação Aberto");
	}

}
