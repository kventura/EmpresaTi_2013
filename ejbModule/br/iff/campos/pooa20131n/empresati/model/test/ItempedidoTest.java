package br.iff.campos.pooa20131n.empresati.model.test;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

import br.iff.campos.pooa20131n.empresati.model.entity.Itempedido;
import br.iff.campos.pooa20131n.empresati.model.entity.Servico;
import br.iff.campos.pooa20131n.empresati.model.persistence.ClientePersistence;
import br.iff.campos.pooa20131n.empresati.model.persistence.FuncionarioPersistence;
import br.iff.campos.pooa20131n.empresati.model.persistence.ItempedidoPersistence;
import br.iff.campos.pooa20131n.empresati.model.persistence.PedidoPersistence;
import br.iff.campos.pooa20131n.empresati.model.persistence.ServicoPersistence;


public class ItempedidoTest {

	private ServicoPersistence pserv = new ServicoPersistence();
	private ClientePersistence pcli = new ClientePersistence();
	private PedidoPersistence pped = new PedidoPersistence();
	private FuncionarioPersistence pfunc = new FuncionarioPersistence();
	private ItempedidoPersistence pitemped = new ItempedidoPersistence();
	private String uid = "001";

	@Test
	public void testInserir() {
		
		pfunc.inserir(uid, "matricula", "nome", "cpf", 5, "telefone", "equipe",
				"departamento", null);
		pserv.inserir(uid, "descricao", 5, pfunc.find(uid));
		pcli.inserir(uid, "razaosocial", "cnpj", "endereco", "telefone", 2000,
				"cidade", "uf");
		pped.inserir(uid, 22, 6, 2013, pcli.find(uid));
		Itempedido itemped = pitemped.inserir(uid, 20, 6, 2013,
				pserv.find(uid), pped.find(uid));
		assertEquals(itemped.getUid(), uid);
	}

	@Test
	public void testUpdate() {
		Itempedido itemped = pitemped.update(uid, 20, 6, 2013, pserv.find(uid),
				pped.find(uid));
		assertEquals(itemped.getUid(), uid);
	}

	@Test
	public void testFind() { //buscar alguma coisa
		Itempedido itemped = pitemped.find(uid);
		assertEquals(itemped.getUid(), uid);
	}

	@Test
	public void testFindAll() { //busca de todos
		List<Itempedido> lista_pitemped = pitemped.findAll();
		for(Itempedido itempedido : lista_pitemped){
			assertEquals(itempedido.getUid(), uid);
		}
	}

	@Test
	public void testDelete() {
		pitemped.delete(uid);
		pped.delete(uid);
		pcli.delete(uid);
		pserv.delete(uid);
		pfunc.delete(uid);
	}

}
