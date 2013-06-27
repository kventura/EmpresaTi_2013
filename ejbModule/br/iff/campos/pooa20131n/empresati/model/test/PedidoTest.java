package br.iff.campos.pooa20131n.empresati.model.test;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

import br.iff.campos.pooa20131n.empresati.model.entity.Pedido;
import br.iff.campos.pooa20131n.empresati.model.persistence.ClientePersistence;
import br.iff.campos.pooa20131n.empresati.model.persistence.PedidoPersistence;

public class PedidoTest {

	private ClientePersistence pcli = new ClientePersistence();
	private PedidoPersistence pped = new PedidoPersistence();
	private String uid = "001";

	@Test
	public void testInserir() {
		pcli.inserir(uid, "razaosocial", "cnpj", "endereco", "telefone", 2000,
				"cidade", "uf");
		Pedido ped = pped.inserir(uid, 22, 6, 2013, pcli.find(uid));
		assertEquals(ped.getUid(), uid);
	}

	@Test
	public void testUpdate() {
		Pedido ped = pped.update(uid, 22, 6, 2013, pcli.find(uid));
		assertEquals(ped.getUid(), uid);
	}

	@Test
	public void testFind() {
		Pedido ped = pped.find(uid);
		assertEquals(ped.getUid(), uid);
	}

	@Test
	public void testFindAll1() {
		List<Pedido> lista_pped = pped.findAll();
		for (Pedido pedido : lista_pped) {
			assertEquals(pedido.getUid(), uid);
		}
	}

	@Test
	public void testDelete() {
		pped.delete(uid);
		pcli.delete(uid);
	}

}
