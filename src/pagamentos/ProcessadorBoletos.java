package pagamentos;

import java.util.List;

public class ProcessadorBoletos {
	Fatura fatura;
	List<Boleto> boletos;
	
	public ProcessadorBoletos(Fatura fatura, List<Boleto> boletos) {
		this.fatura = fatura;
		this.boletos = boletos;
	}
	
	public double valorPago () {
		double valorPago = 0;
		for (Boleto boleto:boletos) {
			valorPago += boleto.getValor();
		}
		return valorPago;
	}
	
	public double valorDevido () {
		double valorDevido = fatura.getValorTotal() - this.valorPago();
		return valorDevido > 0 ? valorDevido : 0;
	}
	
	public boolean faturaPaga () {
		return this.valorDevido() == 0;
	}
}
