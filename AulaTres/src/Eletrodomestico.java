
public class Eletrodomestico {
	
	private String voltagem;
	protected String modelo;
	
	public Eletrodomestico(String voltagem) {
		
	}
	
	public void ligar() {
		System.out.println("Ligar do Eletrodomestico");
	}
	
	protected String desligar() {
		System.out.println("Desligar eletrodomestico");
		return "Eletrodomestico desligado";
	}
	
}
