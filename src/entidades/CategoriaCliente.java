package entidades;

import java.util.ArrayList;
import java.util.List;

public class CategoriaCliente {

	private String tipo;
	
	private List<Cliente> clientes = new ArrayList<>();

	public CategoriaCliente(String tipo) {
		this.tipo = tipo;
	}
	
	public void addCliente(Cliente cliente) {
		clientes.add(cliente);
	}
	
	public void removerCliente(Cliente cliente) {
		clientes.remove(cliente);
	}

	@Override
	public String toString() {
		return "CategoriaCliente [tipo=" + tipo + "]";
	}
	
	
}
