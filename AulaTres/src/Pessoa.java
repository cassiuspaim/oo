import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pessoa {

	protected String nome;
	protected String endereco;
	protected String telefone;
	protected Date dataNascimento;
	
	//getters e setters omitidos
	// Relacionamento com a classe Carro
	//private List<Carro> carros = new ArrayList<Carro>();
	// Relacionamento com a classe Carro
	private Carro carro;

	public String getNome() {
		return nome + " " + carro.getModelo();
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	 public Carro getCarro() {
		 return carro;
	 }

	 public void setCarro(Carro carro) {
		 this.carro = carro;
	 }

}