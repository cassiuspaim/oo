//Exercício 1
public class Carro {
	
	public String placa;
	
	public String modelo;
	
	public String combustivel;
	
	public double valor;
	
	public String fabricante;
	
	public String chassi;
	
	public int anoModelo;
	//public Integer anoModelo;
	
	public int anoFabricacao;
	
	public String potencia;
	
	public boolean automatico;
	
	public boolean temAirBag;
	
	public int portas;

	public int quantidadePassageiros;

	public String tipo;

	public String motor;
	
	public final double VALOR_CARRO_LUXO = 100000;

	public Carro(String placa, String modelo, String combustivel, double valor,
			String fabricante, String chassi, int anoModelo, int anoFabricacao,
			String potencia, boolean automatico, boolean temAirBag, int portas,
			int quantidadePassageiros, String tipo, String motor) {
		super();
		
		this.placa = placa;
		this.modelo = modelo;
		this.combustivel = combustivel;
		this.valor = valor;
		this.fabricante = fabricante;
		this.chassi = chassi;
		this.anoModelo = anoModelo;
		this.anoFabricacao = anoFabricacao;
		this.potencia = potencia;
		this.automatico = automatico;
		this.temAirBag = temAirBag;
		this.portas = portas;
		this.quantidadePassageiros = quantidadePassageiros;
		this.tipo = tipo;
		this.motor = motor;
	}
	
	public String getDescricaoDoObjeto() {
		return    placa 
				+ modelo 
				+ combustivel 
				+ valor 
				+ (automatico ? 
						" é automático " 
						: "não é automático")
				+ portas
				/* concatenar com o 
				 * resto das propriedades */ ;
	}
	
	public boolean ehDeLuxo() {
		boolean ehDeLuxo = false;
		if (valor > VALOR_CARRO_LUXO) {
			ehDeLuxo = true;
		}
		
		return ehDeLuxo;
	}
	
	
//	
//	public Carro(String placaParam,
//				 String modeloParam,
//				 String combustivelParam,
//				 double valorParam,
//				 int portasParam,
//				 int quantidadePassageirosParam,
//				 String fabricanteParam,
//				 String chassiParam,
//				 int anoModeloParam,
//				 int anoFabricacaoParam,
//				 String potenciaParam,
//				 boolean automaticoParam,
//				 boolean temAirBagParam,
//				 String tipoParam,
//				 String motorParam) {
//		
//		placa = placaParam;
//		modelo = modeloParam;
//		combustivel = combustivelParam;
//		valor = valorParam;
//		portas = portasParam;
//		quantidadePassageiros = quantidadePassageirosParam;
//		fabricante = fabricanteParam;
//		chassi = chassiParam;
//		anoModelo = anoModeloParam;
//		anoFabricacao = anoFabricacaoParam;
//		potencia = potenciaParam;
//		automatico = automaticoParam;
//		temAirBag = temAirBagParam;
//		tipo = tipoParam;
//		motor = motorParam;
//		
//	}
	
}
