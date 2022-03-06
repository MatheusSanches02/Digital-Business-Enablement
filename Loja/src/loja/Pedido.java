package loja;

import java.math.BigDecimal;

import loja.situacao.Aberto;
import loja.situacao.Situacao;

public class Pedido {

	private BigDecimal valor;
	private int totalDeItens;
	private Situacao situacao;

	public Pedido(BigDecimal valor, int totalDeItens) {
		super();
		this.valor = valor;
		this.totalDeItens = totalDeItens;
		this.situacao = new Aberto();
	}
	
	public void abrirChamado() {
		situacao.abrirChamado();
	}
	
	public void pagar() {
		situacao.pagar(this);
	}
	
	public void cancelar() {
		situacao.cancelar(this);
	}
	
	public void entregar() {
		situacao.entregar(this);
	}
	
	public void reabrir() {
		situacao.reabrir(this);
	}
	
	
	
	public void setSituacao(Situacao situacao) {
		this.situacao = situacao;
	}

	public BigDecimal getValor() {
		return valor;
	}
	
	public int getTotalDeItens() {
		return totalDeItens;
	}
	
	
}
