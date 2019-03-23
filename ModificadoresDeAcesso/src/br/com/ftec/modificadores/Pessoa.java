package br.com.ftec.modificadores;

public class Pessoa {
	
	protected String nome;
	
	String identidadeDigital;
	
	private String telefone;
	
	protected void alterarNome() {
		
	}
	
	public String getTelefone() {
		return telefone;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
}
