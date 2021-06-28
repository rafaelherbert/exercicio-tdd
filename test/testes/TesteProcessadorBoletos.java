package testes;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import pagamentos.Boleto;
import pagamentos.Fatura;
import pagamentos.ProcessadorBoletos;

class TesteProcessadorBoletos {
	
	ArrayList<Boleto> boletos;
	Fatura fatura;
	ProcessadorBoletos processadorBoletos;
	
	@BeforeEach
	void initialize() {
		boletos = new ArrayList<Boleto>();
		fatura = new Fatura("Rafael Gouveia", "26/06/2021", 800.00);
		boletos.add(new Boleto("cod1", "27/06/2021", 200.00));
		boletos.add(new Boleto("cod1", "27/06/2021", 200.00));
		boletos.add(new Boleto("cod1", "27/06/2021", 200.00));
		processadorBoletos = new ProcessadorBoletos(fatura, boletos);
	}

	@Test
	void testeValorPago() {
		Assertions.assertEquals(600, processadorBoletos.valorPago());
	}
	
	@Test
	void testeValorDevido() {
		Assertions.assertEquals(200, processadorBoletos.valorDevido());
	}
	
	@Test
	void testeFaturaPaga() {
		Assertions.assertFalse(processadorBoletos.faturaPaga());
	}
}
