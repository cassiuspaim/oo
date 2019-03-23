package br.com.ftec.modificadorExterno;

import br.com.ftec.modificadores.Pessoa;

public class PessoaJuridica extends Pessoa{

	private String cnpj;
	
	public void emitirCNPJ() {
		System.out.println("Imprimir nome " + nome );
		
		Pessoa pessoa = new Pessoa();
		System.out.println("pessoa.identidadeDigital = " + pessoa.identidadeDigital);
	}
	
}
