package entidades;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

	private Integer numConta;
	private Double saldoConta;
	private String nomeCliente;
	private String endereco;
	private String telefone;
	private String email;
	
	private CategoriaCliente categoria;
	private List<Cartao> cartoes = new ArrayList<>();

	public Cliente(Integer numConta, Double saldoConta, String nomeCliente, String endereco, String telefone,
			String email, CategoriaCliente categoria) {
		this.numConta = numConta;
		this.saldoConta = saldoConta;
		this.nomeCliente = nomeCliente;
		this.endereco = endereco;
		this.telefone = telefone;
		this.email = email;
		this.categoria = categoria;
	}

	public Integer getNumConta() {
		return numConta;
	}

	public void setNumConta(Integer numConta) {
		this.numConta = numConta;
	}

	public Double getSaldoConta() {
		return saldoConta;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
	public void addCartao(Cartao cartao) {
		cartoes.add(cartao);
	}
	
	public void removerCartao(Cartao cartao) {
		cartoes.remove(cartao);
	}
	
	
	public void pagarFatura(double valorFatura) {
		saldoConta -= valorFatura;
	}

	@Override
	public String toString() {
		return "Cliente [numConta=" + numConta + ", saldoConta=" + saldoConta + ", nomeCliente=" + nomeCliente
				+ ", endereco=" + endereco + ", telefone=" + telefone + ", email=" + email + ", categoria=" + categoria
				+ ", cartoes=" + cartoes + "]";
	}
	
}
