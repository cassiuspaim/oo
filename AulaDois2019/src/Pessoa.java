
public class Pessoa {

	public String telefone= "";
	
	public void setTelefone(String telefoneParam) {
		if (telefoneParam.length() != 9) {
			System.out.println("Telefone no formato inválido");
		} else {
			telefone = telefoneParam;
		}
		System.out.println("Meu telefone é " + getTelefone() );
	}
	
	public String getTelefone() {
		if (telefone.length() < 9) {
			return "9" + telefone;
		} else {
			return telefone;
		}
	}
	
}
