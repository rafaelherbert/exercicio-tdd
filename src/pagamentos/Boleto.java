package pagamentos;

// Um boleto contém código do boleto, data, e valor pago.

public class Boleto {
	
	private String data;
	private String codBoleto;
	private double valor;
	
	public Boleto(String codBoleto, String data, double valor) {
		this.codBoleto = codBoleto;
		this.data = data;
		this.valor = valor;
	}
	
	public String getData() {
		return data;
	}
	
	public String getCodBoleto() {
		return codBoleto;
	}

	public double getValor() {
		return valor;
	}
}
