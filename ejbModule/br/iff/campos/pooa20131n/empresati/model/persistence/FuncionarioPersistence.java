package br.iff.campos.pooa20131n.empresati.model.persistence;

import java.util.List;

import br.iff.campos.pooa20131n.empresati.model.entity.Cargo;
import br.iff.campos.pooa20131n.empresati.model.entity.Funcionario;

public class FuncionarioPersistence extends AbstractPersistence {

	public Funcionario inserir(String uid, String matricula, String nome, String cpf,
			double salario, String telefone, String equipe, String departamento,
			Cargo cargo) {

		Funcionario funcionario = new Funcionario();

		funcionario.setUid(uid);
		funcionario.setMatricula(matricula);
		funcionario.setNome(nome);
		funcionario.setCpf(cpf);
		funcionario.setSalario(salario);
		funcionario.setTelefone(telefone);
		funcionario.setEquipe(equipe);
		funcionario.setDepartamento(departamento);
		funcionario.setCargo(cargo);
				
		super.insert(funcionario);

		return funcionario;

	}

	public Funcionario update(String uid, String matricula, String nome, String cpf,
			double salario, String telefone, String equipe, String departamento,
			Cargo cargo) {

		Funcionario funcionario = super.find(Funcionario.class, uid);

		funcionario.setUid(uid);
		funcionario.setMatricula(matricula);
		funcionario.setNome(nome);
		funcionario.setCpf(cpf);
		funcionario.setSalario(salario);
		funcionario.setTelefone(telefone);
		funcionario.setEquipe(equipe);
		funcionario.setDepartamento(departamento);
		funcionario.setCargo(cargo);
				
		super.update(funcionario);

		return funcionario;

	}

	public Funcionario find(String uid) {

		return super.find(Funcionario.class, uid);
	}

	
	public List<Funcionario> findAll() {
		return super.findAll(Funcionario.class);

	}
	
	public void delete(String uid) {
		super.delete(Funcionario.class, uid);
	}


}
