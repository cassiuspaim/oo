package br.com.ftec.modificadores;

public class PessoaFisica extends Pessoa {

	public void falar() {
		alterarNome();
		System.out.println("this.identidadeDigital = " + identidadeDigital);
	}
	
}
