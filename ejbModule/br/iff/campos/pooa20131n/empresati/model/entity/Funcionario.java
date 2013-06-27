package br.iff.campos.pooa20131n.empresati.model.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the funcionario database table.
 * 
 */
@Entity
public class Funcionario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String uid;

	private String cpf;

	private String departamento;

	private String equipe;

	private String matricula;

	private String nome;

	private double salario;

	private String telefone;

	//bi-directional many-to-one association to Cargo
	@ManyToOne
	@JoinColumn(name="uidcargo")
	private Cargo cargo;

	//bi-directional many-to-one association to Servico
	@OneToMany(mappedBy="funcionario")
	private List<Servico> servicos;

	public Funcionario() {
	}

	public String getUid() {
		return this.uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getCpf() {
		return this.cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getDepartamento() {
		return this.departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public String getEquipe() {
		return this.equipe;
	}

	public void setEquipe(String equipe) {
		this.equipe = equipe;
	}

	public String getMatricula() {
		return this.matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return this.salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getTelefone() {
		return this.telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Cargo getCargo() {
		return this.cargo;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}

	public List<Servico> getServicos() {
		return this.servicos;
	}

	public void setServicos(List<Servico> servicos) {
		this.servicos = servicos;
	}

	public Servico addServico(Servico servico) {
		getServicos().add(servico);
		servico.setFuncionario(this);

		return servico;
	}

	public Servico removeServico(Servico servico) {
		getServicos().remove(servico);
		servico.setFuncionario(null);

		return servico;
	}

}