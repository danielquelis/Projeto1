package br.com.senac.dominio;

import java.io.Serializable;

import javax.persistence.Entity;

import br.com.senac.dominio.enums.StatusPagamento;

@Entity
public class PagamentoComCartao extends Pagamento implements Serializable{

	private static final long serialVersionUID = -1322105845971354538L;
	
	private Integer numeroDeParcelas;
	
	public PagamentoComCartao() {
		
	}
	
	public PagamentoComCartao(Integer id, StatusPagamento status, Pedido pedido, Integer numeroDeParcelas) {
		super(id, status, pedido);
		this.numeroDeParcelas = numeroDeParcelas;
	}

	public Integer getNumeroDeParcelas() {
		return numeroDeParcelas;
	}

	public void setNumeroDeParcelas(Integer numeroDeParcelas) {
		this.numeroDeParcelas = numeroDeParcelas;
	}
}
