package aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;

import entidades.Cartao;
import entidades.CategoriaCliente;
import entidades.Cliente;
import entidades.Fatura;
import enums.FaturaStatus;

public class Programa {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		Cliente cliente1 = new Cliente(12345, 1350.00, "Fred Viana", "Avenida das goiabeiras, 123", "(85) 99999-123",
				"fred_viana@gmail.com", new CategoriaCliente("Master"));

		cliente1.addCartao(new Cartao(8887776, "08/2020", "Fred Viana", 123, "12345",
				new Fatura(sdf.parse("10/12/2020"), 5000.75, 0.30, FaturaStatus.PAGAMENTO_PENDENTE)));

		System.out.println(cliente1);

		Cliente cliente2 = new Cliente(676543, 7000.00, "Diego Barros", "Avenida dos gamers, 789", "(85) 98765-456",
				"diego_barros@gmail.com", new CategoriaCliente("Premium"));

		cliente2.addCartao(new Cartao(999008, "12/2024", "Diego Barros", 656, "89764",
				new Fatura(sdf.parse("15/06/2020"), 1240.93, 0.25, FaturaStatus.PAGA)));

		System.out.println(cliente2);
		
		Cliente cliente3 = new Cliente(8887776, 15000.00, "Renato Padilha", "Avenida dos matemáticos, 456", "(85) 98654-456",
				"renato_padilha@gmail.com", new CategoriaCliente("Comum"));

		cliente3.addCartao(new Cartao(7776665, "05/2023", "Renato Padilha", 987, "999876",
				new Fatura(sdf.parse("18/07/2020"), 9675.33, 0.10, FaturaStatus.INADIMPLENCIA)));

		System.out.println(cliente3);

	}

}
