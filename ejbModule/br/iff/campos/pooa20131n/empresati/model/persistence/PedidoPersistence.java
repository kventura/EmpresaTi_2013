package br.iff.campos.pooa20131n.empresati.model.persistence;

import java.util.List;

import br.iff.campos.pooa20131n.empresati.model.entity.Cliente;
import br.iff.campos.pooa20131n.empresati.model.entity.Pedido;
import br.iff.campos.pooa20131n.empresati.model.entity.Pedido;


public class PedidoPersistence extends AbstractPersistence {

	public Pedido inserir(String uid, Integer diapedido, Integer mespedido, Integer anopedido,
			Cliente cliente) {

		Pedido pedido = new Pedido();

		pedido.setUid(uid);
		pedido.setDiapedido(diapedido);
		pedido.setMespedido(mespedido);
		pedido.setAnopedido(anopedido);
		pedido.setCliente(cliente);
		
		super.insert(pedido);

		return pedido;

	}

	public Pedido update(String uid, Integer diapedido, Integer mespedido, Integer anopedido,
			Cliente cliente) {
		
		Pedido pedido = super.find(Pedido.class, uid);

		pedido.setUid(uid);
		pedido.setDiapedido(diapedido);
		pedido.setMespedido(mespedido);
		pedido.setAnopedido(anopedido);
		pedido.setCliente(cliente);
		
		super.update(pedido);

		return pedido;

	}

	public Pedido find(String uid) {

		return super.find(Pedido.class, uid);
	}

	public void delete(String uid) {
		super.delete(Pedido.class, uid);
	}

	public List<Pedido> findAll() {
		return super.findAll(Pedido.class);

	}

}