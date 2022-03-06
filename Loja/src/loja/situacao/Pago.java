package loja.situacao;

import loja.Pedido;

public class Pago extends Situacao{

	@Override
	public void abrirChamado() {
		System.out.println("Abrir chamado para LOGISTICA");
	}

	@Override
	public void cancelar(Pedido pedido) {
		pedido.setSituacao(new Cancelado());
	}

	@Override
	public void entregar(Pedido pedido) {
		pedido.setSituacao(new Entregue());
	}
	

	



}
