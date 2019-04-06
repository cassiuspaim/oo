
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String [] args) {
		
		//testarEletrodomesticos();
		
		//testeContas();
		
		//testeCalculadora();
		
		testePessoa();

	}

	private static void testePessoa() {
//		Carro carro = new Carro();
//		Pessoa pessoa = new Pessoa();
		//pessoa.setCarro(carro);
//		List<Carro> carros = new ArrayList<Carro>();
//		carros.add(new Carro());
//		carros.add(new Carro());
		//pessoa.setCarros(carros);
		Aluno aluno = new Aluno();
		//aluno.setCarro(new Carro());
		System.out.println(aluno.getNome());
	}

	private static void testeCalculadora() {
		Calculadora calculadora = new Calculadora();
		 calculadora.calcula(1d, 1d);
	}

	private static void testarEletrodomesticos() {
		TesteEletrodomestico testeEletrodomestico = new TesteEletrodomestico();
		testeEletrodomestico.rodar();
	}

	private static void testeContas() {
		Conta conta = new Conta();
		conta.setAgencia("1234");
		conta.setNumero("1244");
		conta.deposito(3000);

		ContaPoupanca contaPoupanca = new ContaPoupanca();
		contaPoupanca.setAgencia("3456");
		contaPoupanca.setNumero("1234");
		contaPoupanca.deposito(3000);
		contaPoupanca.depositoPoupanca(1000);

		ContaEspecial contaEspecial = new ContaEspecial();
		contaEspecial.setAgencia("3432");
		contaEspecial.setLimite(1000);
		contaEspecial.setNumero("1434");
		contaEspecial.deposito(3000);

		fazSaque(conta);
		fazSaque(contaPoupanca);
		fazSaque(contaEspecial);
	}
	
	static void fazSaque(Conta conta) {
		
		float valor = 
				Float.parseFloat(
						JOptionPane.showInputDialog("Digite o valor do saque")
						);
		conta.saque(valor);
		conta.saldo();
	}

}