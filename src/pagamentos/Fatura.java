package pagamentos;

// Uma fatura contém data, valor total e nome do cliente.

public class Fatura {
	private double valorTotal;
	private String data;
	private String nomeCliente;
	
	public Fatura(String nomeCliente, String data, double valorTotal) {
		this.nomeCliente = nomeCliente;
		this.data = data;
		this.valorTotal = valorTotal;
	}
	
	public double getValorTotal() {
		return valorTotal;
	}

	public String getData() {
		return data;
	}
	
	public String getNomeCliente() {
		return nomeCliente;
	}
}
