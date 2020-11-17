package com.nelioalves.cursomc.domain;

import javax.persistence.Entity;

import com.nelioalves.cursomc.domain.enums.EstadoPagamento;

@Entity
public class PagamentoComCartao extends Pagamento {
	private static final long serialVersionUID = 1L;

	private Integer numeroDeParcelas;
	
	public PagamentoComCartao() {
		
	}

	public PagamentoComCartao(Integer id, EstadoPagamento estado, Pedido pedido, Integer numeroDeParecelas) {
		super(id, estado, pedido);
		this.numeroDeParcelas = numeroDeParecelas;
	}

	public Integer getNumeroDeParecelas() {
		return numeroDeParcelas;
	}

	public void setNumeroDeParecelas(Integer numeroDeParecelas) {
		this.numeroDeParcelas = numeroDeParecelas;
	}
	
	
}
