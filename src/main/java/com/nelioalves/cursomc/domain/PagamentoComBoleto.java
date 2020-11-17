package com.nelioalves.cursomc.domain;

import java.util.Date;

import javax.persistence.Entity;

import com.nelioalves.cursomc.domain.enums.EstadoPagamento;

@Entity
public class PagamentoComBoleto extends Pagamento  {
	private static final long serialVersionUID = 1L;
	
	private Date dataVencimento;
	private Date dataPAgamento;
	
	public PagamentoComBoleto() {
		
	}
	
	public PagamentoComBoleto(Integer id, EstadoPagamento estado, Pedido pedido, Date dataVencimento,
			Date dataPAgamento) {
		super(id, estado, pedido);
		this.dataVencimento = dataVencimento;
		this.dataPAgamento = dataPAgamento;
	}

	public Date getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(Date dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public Date getDataPAgamento() {
		return dataPAgamento;
	}

	public void setDataPAgamento(Date dataPAgamento) {
		this.dataPAgamento = dataPAgamento;
	}
	
	
}
