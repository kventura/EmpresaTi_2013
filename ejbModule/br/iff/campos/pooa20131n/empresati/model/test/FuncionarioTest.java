package br.iff.campos.pooa20131n.empresati.model.test;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

import br.iff.campos.pooa20131n.empresati.model.entity.Funcionario;
import br.iff.campos.pooa20131n.empresati.model.persistence.CargoPersistence;
import br.iff.campos.pooa20131n.empresati.model.persistence.FuncionarioPersistence;

public class FuncionarioTest {

	private CargoPersistence pcarg = new CargoPersistence();
	private FuncionarioPersistence pfunc = new FuncionarioPersistence();
	private String uid = "001";

	@Test
	public void testInserir() {
		pcarg.inserir(uid, "descricao");
		Funcionario func = pfunc.inserir(uid, "matricula", "nome", "cpf", 5,
				"telefone", "equipe", "departamento", pcarg.find(uid));
		assertEquals(func.getUid(), uid);
	}

	@Test
	public void testUpdate() {
		Funcionario func = pfunc.update(uid, "matriculaUP", "nome", "cpf", 5,
				"telefone", "equipe", "departamento", pcarg.find(uid));
		assertEquals(func.getMatricula(), "matriculaUP");
	}

	@Test
	public void testFind() {
		Funcionario func = pfunc.find(uid);
		assertEquals(func.getNome(), "nome");//não colocar igual o metodo de cima
	}

	@Test
	public void testFindAll() {
		List<Funcionario> lista_pfunc = pfunc.findAll();
		for (Funcionario funcionario : lista_pfunc) {
			assertEquals(funcionario.getUid(), uid); //igual o nome do atributo do metodo inserir
		}
	}

	@Test
	public void testDelete() {
		pfunc.delete(uid);
		pcarg.delete(uid);
	}

}
