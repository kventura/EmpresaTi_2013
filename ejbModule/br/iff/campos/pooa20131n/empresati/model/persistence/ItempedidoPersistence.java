package br.iff.campos.pooa20131n.empresati.model.persistence;

import java.util.List;

import br.iff.campos.pooa20131n.empresati.model.entity.Itempedido;
import br.iff.campos.pooa20131n.empresati.model.entity.Itempedido;
import br.iff.campos.pooa20131n.empresati.model.entity.Pedido;
import br.iff.campos.pooa20131n.empresati.model.entity.Servico;

public class ItempedidoPersistence extends AbstractPersistence {

	public Itempedido inserir(String uid, Integer diapedido, Integer mespedido, Integer anopedido,
			Servico servico, Pedido pedido) {

		Itempedido itempedido = new Itempedido();

		itempedido.setUid(uid);
		itempedido.setDiapedido(diapedido);
		itempedido.setMespedido(mespedido);
		itempedido.setAnopedido(anopedido);
		itempedido.setServico(servico);
		itempedido.setPedido(pedido);

		super.insert(itempedido);

		return itempedido;

	}

	public Itempedido update(String uid, Integer diapedido, Integer mespedido, Integer anopedido,
			Servico servico, Pedido pedido) {
		
		Itempedido itempedido = super.find(Itempedido.class, uid);

		itempedido.setUid(uid);
		itempedido.setDiapedido(diapedido);
		itempedido.setMespedido(mespedido);
		itempedido.setAnopedido(anopedido);
		itempedido.setServico(servico);
		itempedido.setPedido(pedido);
		
		super.update(itempedido);

		return itempedido;

	}

	public Itempedido find(String uid) {

		return super.find(Itempedido.class, uid);
	}

	public void delete(String uid) {
		super.delete(Itempedido.class, uid);
	}

	public List<Itempedido> findAll() {
		return super.findAll(Itempedido.class);

	}

}