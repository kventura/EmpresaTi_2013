package br.iff.campos.pooa20131n.empresati.model.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the pedido database table.
 * 
 */
@Entity
public class Pedido implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String uid;

	private Integer anopedido;

	private Integer diapedido;

	private Integer mespedido;

	//bi-directional many-to-one association to Itempedido
	@OneToMany(mappedBy="pedido")
	private List<Itempedido> itempedidos;

	//bi-directional many-to-one association to Cliente
	@ManyToOne
	@JoinColumn(name="uidcliente")
	private Cliente cliente;

	public Pedido() {
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

	public List<Itempedido> getItempedidos() {
		return this.itempedidos;
	}

	public void setItempedidos(List<Itempedido> itempedidos) {
		this.itempedidos = itempedidos;
	}

	public Itempedido addItempedido(Itempedido itempedido) {
		getItempedidos().add(itempedido);
		itempedido.setPedido(this);

		return itempedido;
	}

	public Itempedido removeItempedido(Itempedido itempedido) {
		getItempedidos().remove(itempedido);
		itempedido.setPedido(null);

		return itempedido;
	}

	public Cliente getCliente() {
		return this.cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

}