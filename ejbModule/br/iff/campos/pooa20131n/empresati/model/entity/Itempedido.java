package br.iff.campos.pooa20131n.empresati.model.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the itempedido database table.
 * 
 */
@Entity
public class Itempedido implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String uid;

	private Integer anopedido;

	private Integer diapedido;

	private Integer mespedido;

	//bi-directional many-to-one association to Pedido
	@ManyToOne
	@JoinColumn(name="uidpedido")
	private Pedido pedido;

	//bi-directional many-to-one association to Servico
	@ManyToOne
	@JoinColumn(name="uidservico")
	private Servico servico;

	public Itempedido() {
	}

	public String getUid() {
		return this.uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public Integer getAnopedido() {
		return this.anopedido;
	}

	public void setAnopedido(Integer anopedido) {
		this.anopedido = anopedido;
	}

	public Integer getDiapedido() {
		return this.diapedido;
	}

	public void setDiapedido(Integer diapedido) {
		this.diapedido = diapedido;
	}

	public Integer getMespedido() {
		return this.mespedido;
	}

	public void setMespedido(Integer mespedido) {
		this.mespedido = mespedido;
	}

	public Pedido getPedido() {
		return this.pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	public Servico getServico() {
		return this.servico;
	}

	public void setServico(Servico servico) {
		this.servico = servico;
	}

}