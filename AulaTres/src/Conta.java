public class Conta {

	private String agencia;
	private String numero;
	protected float saldo;
	
	public void saque(float valor) {
		if (saldo < valor) {
			System.out.println("O saldo � insuficiente!");
		} else {
			saldo -= valor;
		}
	}


	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public void deposito(float valor) {
		saldo += valor;
	}

	public void saldo() {
		System.out.println("O saldo �: " + saldo);
	}

}