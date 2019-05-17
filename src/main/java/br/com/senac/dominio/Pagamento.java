package br.com.senac.dominio;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;

import br.com.senac.dominio.enums.StatusPagamento;

@Entity
@Inheritance(strategy=InheritanceType.JOINED) //para cada subclasse será criada uma tabela nova
public class Pagamento implements Serializable{

	private static final long serialVersionUID = -135608026013015373L;
	
	@Id
	private Integer id;
		
	private StatusPagamento statusPagamento;
	
	@OneToOne
	@JoinColumn(name="pedido_id")
	@MapsId //para garantir que o id do pedido seja o mesmo do mapeamento
	private Pedido pedido;
	
	public Pagamento(Integer id, StatusPagamento status, Pedido pedido) {
		super();
		this.id = id;
		this.statusPagamento = status;
		this.pedido = pedido;
	}
	
	public Pagamento() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public StatusPagamento getStatusPagamento() {
		return statusPagamento;
	}

	public void setStatusPagamento(StatusPagamento statusPagamento) {
		this.statusPagamento = statusPagamento;
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}
	
	
}
