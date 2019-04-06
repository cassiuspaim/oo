
public class TesteEletrodomestico {

	public void rodar() {
		Eletrodomestico eletrodomestico = new Eletrodomestico();
		Geladeira geladeira = new Geladeira();
		Televisao televisao = new Televisao();
		geladeira.modelo = "Linha branca";
		geladeira.voltagem = "220v";

		ligarEletrodomestico(eletrodomestico);
		ligarEletrodomestico(geladeira);
		ligarEletrodomestico(televisao);
	}
	
	public void ligarEletrodomestico (Eletrodomestico eletrodomestico) {
		eletrodomestico.ligar();
	}
	
}
