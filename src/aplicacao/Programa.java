package aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;

import entidades.Cartao;
import entidades.Cliente;
import entidades.Fatura;
import enums.FaturaStatus;

public class Programa {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Cliente cliente = new Cliente(12345, 1350.00, "José Wilker", "Avenida das goiabeiras", "(85) 99999-123", "jose_wilker@gmail.com");
		
		System.out.println(cliente);
		
		Cartao cartao = new Cartao(8887776, "08/2020", "José Wilker", 123, "12345", new Fatura(sdf.parse("10/12/2020"), 5000.75, 0.13, FaturaStatus.PAGAMENTO_PENDENTE));
		
		System.out.println(cartao);

	}

}
