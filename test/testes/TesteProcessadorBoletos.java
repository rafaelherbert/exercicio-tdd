package testes;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import pagamentos.Boleto;
import pagamentos.Fatura;

class TesteProcessadorBoletos {
	
	List<Boleto> boletos;
	Fatura fatura;
	ProcessadorBoletos processadorBoletos;
	
	@BeforeEach
	void initialize() {
		boletos.add(new Boleto("cod1", "27/06/2021", 200.00));
		boletos.add(new Boleto("cod1", "27/06/2021", 200.00));
		boletos.add(new Boleto("cod1", "27/06/2021", 200.00));
		fatura = new Fatura("Rafael Gouveia", "26/06/2021", 800.00);
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
