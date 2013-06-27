package br.iff.campos.pooa20131n.empresati.model.test;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

import br.iff.campos.pooa20131n.empresati.model.entity.Servico;
import br.iff.campos.pooa20131n.empresati.model.persistence.CargoPersistence;
import br.iff.campos.pooa20131n.empresati.model.persistence.FuncionarioPersistence;
import br.iff.campos.pooa20131n.empresati.model.persistence.ServicoPersistence;

public class ServicoTest {

	private FuncionarioPersistence pfunc = new FuncionarioPersistence();
	private CargoPersistence pcarg = new CargoPersistence();
	private ServicoPersistence pserv = new ServicoPersistence();
	private String uid = "001";

	@Test
	public void testInserir() {
		pfunc.inserir(uid, "matricula", "nome", "cpf", 5, "telefone", "equipe",
				"departamento", pcarg.find(uid));
		pcarg.inserir(uid, "descricao");
		Servico serv = pserv.inserir(uid, "descricao", 5, pfunc.find(uid));
		assertEquals(serv.getUid(), uid);
	}

	@Test
	public void testUpdate() {
		Servico serv = pserv.update(uid, "descricaoUP", 5, pfunc.find(uid));
		assertEquals(serv.getDescricao(), "descricaoUP");
	}

	@Test
	public void testFind() {
		Servico serv = pserv.find(uid);
		assertEquals(serv.getUid(), uid);
	}

	@Test
	public void testFindAll1() {
		List<Servico> lista_pserv = pserv.findAll();
		for (Servico servico : lista_pserv) {
			assertEquals(servico.getUid(), uid);
		}
	}

	@Test
	public void testDelete() {
		pserv.delete(uid);
		pcarg.delete(uid);
		pfunc.delete(uid);
	}

}
