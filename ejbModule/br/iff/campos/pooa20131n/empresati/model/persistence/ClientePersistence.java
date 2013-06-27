package br.iff.campos.pooa20131n.empresati.model.persistence;

import java.util.List;

import br.iff.campos.pooa20131n.empresati.model.entity.Cliente;

public class ClientePersistence extends AbstractPersistence {

	public Cliente inserir(String uid, String razaosocial, String cnpj,
			String endereco, String telefone, Integer anocadastro, String cidade,
			String uf) {

		Cliente cliente = new Cliente();

		cliente.setUid(uid);
		cliente.setRazaosocial(razaosocial);
		cliente.setCnpj(cnpj);
		cliente.setEndereco(endereco);
		cliente.setTelefone(telefone);
		cliente.setAnocadastro(anocadastro);
		cliente.setCidade(cidade);
		cliente.setUf(uf);
		
		super.insert(cliente);

		return cliente;

	}

	public Cliente update(String uid, String razaosocial, String cnpj,
			String endereco, String telefone, Integer anocadastro, String cidade,
			String uf) {

		Cliente cliente = super.find(Cliente.class, uid);

		cliente.setUid(uid);
		cliente.setRazaosocial(razaosocial);
		cliente.setCnpj(cnpj);
		cliente.setEndereco(endereco);
		cliente.setTelefone(telefone);
		cliente.setAnocadastro(anocadastro);
		cliente.setCidade(cidade);
		cliente.setUf(uf);
		
		super.update(cliente);

		return cliente;

	}

	public Cliente find(String uid) {

		return super.find(Cliente.class, uid);
	}

	public void delete(String uid) {
		super.delete(Cliente.class, uid);
	}

	public List<Cliente> findAll() {
		return super.findAll(Cliente.class);

	}

}