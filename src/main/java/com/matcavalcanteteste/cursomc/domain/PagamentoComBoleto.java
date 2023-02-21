package com.matcavalcanteteste.cursomc.domain;

import java.util.Date;

import com.matcavalcanteteste.cursomc.domain.enums.EstadoPagamento;

import jakarta.persistence.Entity;

@Entity
public class PagamentoComBoleto extends Pagamento{
	private static final long serialVersionUID = 1L;
	
	private Date DataVencimento;
	private Date DataPagamento;
	public PagamentoComBoleto() {
		super();
	}
	
	public PagamentoComBoleto(Integer id, EstadoPagamento estado, Pedido pedido, Date DataVencimento, Date DataPagamento) {
		super(id, estado, pedido);
		
		this.DataVencimento = DataVencimento;
		this.DataPagamento = DataPagamento;
	}

	public Date getDataVencimento() {
		return DataVencimento;
	}

	public void setDataVencimento(Date dataVencimento) {
		DataVencimento = dataVencimento;
	}

	public Date getDataPagamento() {
		return DataPagamento;
	}

	public void setDataPagamento(Date dataPagamento) {
		DataPagamento = dataPagamento;
	}
	
	
	
	

}
