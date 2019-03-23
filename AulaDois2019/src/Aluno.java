
public class Aluno {

	//Características, atríbutos, propriedades, estados
	public String matricula;
	public String nome;
	public String curso;
	
	public Aluno() {
		//igual ao construtor padrão fornecido pelo java
	}
	
	public Aluno(String nomeParam, String cursoParam) {
		nome = nomeParam;
		curso = cursoParam;
	}
	
	
	
	
	public void alterarNome() {
		nome = nome + " (ALTERADO)";
	}
	
}
