package br.iff.campos.pooa20131n.empresati.model.persistence;
import java.util.List;

import br.iff.campos.pooa20131n.empresati.model.entity.Cargo;

public class CargoPersistence extends AbstractPersistence {

	public Cargo inserir(String uid, String descricao) {

		Cargo cargo = new Cargo();

		cargo.setUid(uid);
		cargo.setDescricao(descricao);
				
		super.insert(cargo);

		return cargo;

	}

	public Cargo update(String uid, String descricao) {

		Cargo cargo = super.find(Cargo.class, uid);

		cargo.setUid(uid);
		cargo.setDescricao(descricao);
				
		super.update(cargo);

		return cargo;

	}

	public Cargo find(String uid) {

		return super.find(Cargo.class, uid);
	}

	public void delete(String uid) {
		super.delete(Cargo.class, uid);
	}

	public List<Cargo> findAll() {
		return super.findAll(Cargo.class);

	}

}