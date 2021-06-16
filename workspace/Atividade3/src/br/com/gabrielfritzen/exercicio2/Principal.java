/**
 * Classe que implementa Principal, parte da solução para o
 * segundo exercício da Atividade Avaliativa 3 - POO2
 */
package br.com.gabrielfritzen.exercicio2;

/**
 * 2. Crie uma classe Calculadora. Esta classe deve ser abstrata e implementar
 * as operações básicas (soma, subtração, divisão e multiplicação). 
 * Utilizando o conceito de herança crie uma calculadora científica que
 * implementa os seguintes cálculos: raiz quadrada e a potência. Dica: 
 * utilize a classe Math do pacote java.lang. Crie também um contador de
 * instâncias (contador de objetos da classe) para a classe da calculadora
 * científica. Crie uma classe Principal para testar os métodos desenvolvidos e o
 * contador criado.
 * 
 * @author Gabriel
 *
 */
public class Principal {

	/**
	 * @param args não usado
	 */
	public static void main(String[] args) {
		System.out.println("Atividade Avaliativa 3 - Exercício 2");
		System.out.println();
		
		/**
		 * Criar CalculadoraCientifica 
		 * chamar soma, subtracao, divisao, multiplicacao
		 * chamar raizQuadrada, potencia
		 * criar mais duas CalculadoraCientifica
		 */
		System.out.println("Criando calculadora");
		CalculadoraCientifica calc = new CalculadoraCientifica();

		System.out.println();
		System.out.println("Quantidade de calculadoras: " + calc.getInstancia());

		System.out.println("Testando soma - 2 + 3: " + calc.soma(2, 3));
		System.out.println("Testando subtraçao - 2 - 3: " + calc.subtracao(2, 3));
		System.out.println("Testando divisão - 2 / 3: " + calc.divisao(2, 3));
		System.out.println("Testando multiplicação - 2 * 3: " + calc.multiplicacao(2, 3));
		
		System.out.println("Testando raiz quadrada - raiz quadrada de 4: " + calc.raizQuadrada(4));
		System.out.println("Testando potenciação - base 2 na 3 potência: " + calc.potencia(2, 3));
		
		System.out.println();
		System.out.println("Criando mais duas instâncias de CalculadoraCientifica");
		CalculadoraCientifica calc2 = new CalculadoraCientifica();
		CalculadoraCientifica calc3  = new CalculadoraCientifica();
		
		System.out.println("Quantidade de instâncias de CalculadoraCientifica: " + calc.getInstancia());
	}

}
