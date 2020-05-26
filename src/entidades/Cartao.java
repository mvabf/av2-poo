package entidades;

public class Cartao {

	private Integer numeroCartao;
	private String vencimento;
	private String nomeCartao;
	private Integer codValidacao;
	private String senha;
	
	Fatura fatura;

	public Cartao(Integer numeroCartao, String vencimento, String nomeCartao, Integer codValidacao, String senha,
			Fatura fatura) {
		this.numeroCartao = numeroCartao;
		this.vencimento = vencimento;
		this.nomeCartao = nomeCartao;
		this.codValidacao = codValidacao;
		this.senha = senha;
		this.fatura = fatura;
	}

	public Integer getNumeroCartao() {
		return numeroCartao;
	}

	public void setNumeroCartao(Integer numeroCartao) {
		this.numeroCartao = numeroCartao;
	}

	public String getVencimento() {
		return vencimento;
	}

	public void setVencimento(String vencimento) {
		this.vencimento = vencimento;
	}

	public String getNomeCartao() {
		return nomeCartao;
	}

	public void setNomeCartao(String nomeCartao) {
		this.nomeCartao = nomeCartao;
	}

	public Integer getCodValidacao() {
		return codValidacao;
	}

	public void setCodValidacao(Integer codValidacao) {
		this.codValidacao = codValidacao;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
	
	@Override
	public String toString() {
		return "Cartao [numeroCartao=" + numeroCartao + ", vencimento=" + vencimento + ", nomeCartao=" + nomeCartao
				+ ", codValidacao=" + codValidacao + ", senha=" + senha + ", fatura=" + fatura + "]";
	}

}
