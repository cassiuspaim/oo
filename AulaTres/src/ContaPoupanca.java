public class ContaPoupanca extends Conta {

	 private float saldoPoupanca;

	 public void saque(float valor) {
		 if (saldo + saldoPoupanca < valor) {
			 System.out.println("O saldo é insuficiente!");
		 } else {                
			 if (saldo < valor) {
				 valor -= saldo;
				 saldo = 0;
				 saldoPoupanca -= valor;
			 } else {
				 saldo -= valor;
			 }
			 System.out.println("Saque efetuado com sucesso!");
		 }
	 }

	 public void depositoPoupanca(float valor) {
		 saldoPoupanca += valor;
	 }
   
	 private float getSaldoPoupanca() {
		 return saldoPoupanca;
	 }
   
	 private void setSaldoPoupanca(float saldoPoupanca) {
		 this.saldoPoupanca = saldoPoupanca;
	 }

}