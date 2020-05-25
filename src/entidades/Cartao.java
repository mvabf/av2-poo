package entidades;

import java.text.SimpleDateFormat;
import java.util.Date;

import enums.FaturaStatus;

public class Cartao {
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private Integer numeroCartao;
	private Date vencimento;
	private String nomeCartao;
	private Integer codValidacao;
	private String senha;
	
	FaturaStatus faturaStatus;
	
}
