package entidades;

import java.text.SimpleDateFormat;
import java.util.Date;

import enums.FaturaStatus;

public class Fatura {
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private Date dataFatura;
	private Double valorFatura;
	private Double juros;
	
	private FaturaStatus status;

	public Fatura(Date dataFatura, Double valorFatura, Double juros, FaturaStatus status) {
		this.dataFatura = dataFatura;
		this.valorFatura = valorFatura;
		this.juros = juros;
		this.status = status;
	}

	public Date getDataFatura() {
		return dataFatura;
	}

	public void setDataFatura(Date dataFatura) {
		this.dataFatura = dataFatura;
	}

	public Double getValorFatura() {
		return valorFatura;
	}

	public Double getJuros() {
		return juros;
	}

	public void setJuros(Double juros) {
		this.juros = juros;
	}
	
	public void valorFaturaJuros(int diasAtraso) {
		valorFatura += diasAtraso * juros;
	}

	@Override
	public String toString() {
		return "Fatura [dataFatura=" + sdf.format(dataFatura) + ", valorFatura=" + valorFatura + ", juros=" + juros + ", status="
				+ status + "]";
	}
	
	
	
}
