package br.iff.campos.pooa20131n.empresati.model.persistence;

import java.util.List;


import br.iff.campos.pooa20131n.empresati.model.entity.Funcionario;
import br.iff.campos.pooa20131n.empresati.model.entity.Servico;
import br.iff.campos.pooa20131n.empresati.model.entity.Servico;


public class ServicoPersistence extends AbstractPersistence {

	public Servico inserir(String uid, String descricao, double valorunitario,
			Funcionario funcionario) {

		Servico servico = new Servico();

		servico.setUid(uid);
		servico.setDescricao(descricao);
		servico.setValorunitario(valorunitario);
		servico.setFuncionario(funcionario);
		
		super.insert(servico);

		return servico;

	}

	public Servico update(String uid, String descricao, double valorunitario,
			Funcionario funcionario) {
		
		Servico servico = super.find(Servico.class, uid);

		servico.setUid(uid);
		servico.setDescricao(descricao);
		servico.setValorunitario(valorunitario);
		servico.setFuncionario(funcionario);
		
		super.update(servico);

		return servico;

	}

	public Servico find(String uid) {

		return super.find(Servico.class, uid);
	}

	public void delete(String uid) {
		super.delete(Servico.class, uid);
	}

	public List<Servico> findAll() {
		return super.findAll(Servico.class);

	}

}