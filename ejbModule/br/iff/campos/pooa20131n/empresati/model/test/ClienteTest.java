package br.iff.campos.pooa20131n.empresati.model.test;

import static org.junit.Assert.*;

import java.util.List;
import org.junit.Test;
import br.iff.campos.pooa20131n.empresati.model.entity.Cliente;
import br.iff.campos.pooa20131n.empresati.model.persistence.ClientePersistence;

public class ClienteTest {

	private ClientePersistence pcli = new ClientePersistence();
	private String uid = "001";

	@Test
	public void testInserir() {
		Cliente cli = pcli.inserir(uid, "razaosocial", "cnpj", "endereco",
				"telefone", 2000, "cidade", "uf");
		assertEquals(cli.getUid(), uid);
	}

	@Test
	public void testUpdate() {
		Cliente cli = pcli.update(uid, "razaosocialUPDATE", "cnpj", "endereco",
				"telefone", 2000, "cidade", "uf");
		assertEquals(cli.getRazaosocial(), "razaosocialUPDATE");
	}

	@Test
	public void testFindString() {
		Cliente cli = pcli.find(uid);
		assertEquals(cli.getCidade(), "cidade");
	}

	@Test
	public void testFindAll() {
		List<Cliente> lista_proop = pcli.findAll();
		for (Cliente cliente : lista_proop) { //verificar esse lista_proop
			assertEquals(cliente.getCidade(), "cidade");
		}
	}

	@Test
	public void testDeleteString() {
		pcli.delete(uid);
	}

}