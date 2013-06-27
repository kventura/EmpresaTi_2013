package br.iff.campos.pooa20131n.empresati.model.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the servico database table.
 * 
 */
@Entity
public class Servico implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String uid;

	private String descricao;

	private double valorunitario;

	//bi-directional many-to-one association to Itempedido
	@OneToMany(mappedBy="servico")
	private List<Itempedido> itempedidos;

	//bi-directional many-to-one association to Funcionario
	@ManyToOne
	@JoinColumn(name="uidfuncionario")
	private Funcionario funcionario;

	public Servico() {
	}

	public String getUid() {
		return this.uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getValorunitario() {
		return this.valorunitario;
	}

	public void setValorunitario(double valorunitario) {
		this.valorunitario = valorunitario;
	}

	public List<Itempedido> getItempedidos() {
		return this.itempedidos;
	}

	public void setItempedidos(List<Itempedido> itempedidos) {
		this.itempedidos = itempedidos;
	}

	public Itempedido addItempedido(Itempedido itempedido) {
		getItempedidos().add(itempedido);
		itempedido.setServico(this);

		return itempedido;
	}

	public Itempedido removeItempedido(Itempedido itempedido) {
		getItempedidos().remove(itempedido);
		itempedido.setServico(null);

		return itempedido;
	}

	public Funcionario getFuncionario() {
		return this.funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

}