
public class Teste {

	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno();
		aluno1.matricula = "1234";
		aluno1.nome = "Marcelo";
		aluno1.curso = "ADS";
		aluno1.alterarNome();
		//System.out.println("Matrícula do aluno1 = " 
		//		+ aluno1.matricula );
//		Aluno aluno2 = new Aluno("NOME", "CURSO", "MATRICULA");
//		aluno2.matricula = "1234";
//		aluno2.nome = "Marcelo";
//		aluno2.curso = "ADS";
		//System.out.println("Matrícula do aluno2 = " 
		//		+ aluno2.matricula );
		
		//Uso do comportamento
//		aluno2.alterarNome();
		
		//Uso das propriedades
		System.out.println("Nome do aluno1 = " 
				+ aluno1.nome );
//		System.out.println("Nome do aluno2 = " 
//				+ aluno2.nome);
		
//		Pessoa pessoa1 = new Pessoa();
//		pessoa1.setTelefone("977097099999999");
//		pessoa1.telefone = "98989898";
//		System.out.println("Telefone é " + pessoa1.getTelefone());
		
	}
	
}
