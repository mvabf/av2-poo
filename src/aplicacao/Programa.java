package aplicacao;

import java.util.Locale;

import entidades.Cliente;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Cliente cliente = new Cliente(12345, 1350.00, "José Wilker", "Avenida das goiabeiras", "(85) 99999-123", "jose_wilker@gmail.com");
		
		System.out.println(cliente);

	}

}
