package br.iff.campos.pooa20131n.empresati.model.test;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

import br.iff.campos.pooa20131n.empresati.model.entity.Cargo;
import br.iff.campos.pooa20131n.empresati.model.persistence.CargoPersistence;

public class CargoTest {

	private CargoPersistence pcarg = new CargoPersistence();
	private String uid = "001";

	@Test
	public void testInserir() {
		Cargo carg = pcarg.inserir(uid, "descricao");
		assertEquals(carg.getUid(), uid);
	}

	@Test
	public void testUpdate() {
		Cargo carg = pcarg.update(uid, "descricao");
		assertEquals(carg.getUid(), uid);
	}

	@Test
	public void testFindString() {
		Cargo carg = pcarg.find(uid);
		assertEquals(carg.getDescricao(), "descricao");
	}

	@Test
	public void testFindAll() {
		List<Cargo> lista_proop = pcarg.findAll();
		for (Cargo cargo : lista_proop) {
			assertEquals(cargo.getDescricao(), "descricao");
		}
	}

	@Test
	public void testDeleteString() {
		pcarg.delete(uid);
	}

}