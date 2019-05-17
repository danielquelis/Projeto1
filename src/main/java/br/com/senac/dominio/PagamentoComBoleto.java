package br.com.senac.dominio;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;

import br.com.senac.dominio.enums.StatusPagamento;

@Entity
public class PagamentoComBoleto extends Pagamento implements Serializable{

	private static final long serialVersionUID = 8642774022558378718L;
	
	private Date dataVencimento;
	private Date dataPagamento;
	
	public PagamentoComBoleto() {
		super();
	}
	
	public PagamentoComBoleto(Integer id, StatusPagamento status, Pedido pedido, Date dataVencimento, Date dataPagamento) {
		super();
		this.dataPagamento = dataPagamento;
		this.dataVencimento = dataVencimento;
	}
	
	public Date getDataVencimento() {
		return dataVencimento;
	}
	public void setDataVencimento(Date dataVencimento) {
		this.dataVencimento = dataVencimento;
	}
	public Date getDataPagamento() {
		return dataPagamento;
	}
	public void setDataPagamento(Date dataPagamento) {
		this.dataPagamento = dataPagamento;
	}
}
