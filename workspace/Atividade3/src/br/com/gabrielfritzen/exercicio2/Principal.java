/**
 * Classe que implementa Principal, parte da solu��o para o
 * segundo exerc�cio da Atividade Avaliativa 3 - POO2
 */
package br.com.gabrielfritzen.exercicio2;

/**
 * 2. Crie uma classe Calculadora. Esta classe deve ser abstrata e implementar
 * as opera��es b�sicas (soma, subtra��o, divis�o e multiplica��o). 
 * Utilizando o conceito de heran�a crie uma calculadora cient�fica que
 * implementa os seguintes c�lculos: raiz quadrada e a pot�ncia. Dica: 
 * utilize a classe Math do pacote java.lang. Crie tamb�m um contador de
 * inst�ncias (contador de objetos da classe) para a classe da calculadora
 * cient�fica. Crie uma classe Principal para testar os m�todos desenvolvidos e o
 * contador criado.
 * 
 * @author Gabriel
 *
 */
public class Principal {

	/**
	 * @param args n�o usado
	 */
	public static void main(String[] args) {
		System.out.println("Atividade Avaliativa 3 - Exerc�cio 2");
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
		System.out.println("Testando subtra�ao - 2 - 3: " + calc.subtracao(2, 3));
		System.out.println("Testando divis�o - 2 / 3: " + calc.divisao(2, 3));
		System.out.println("Testando multiplica��o - 2 * 3: " + calc.multiplicacao(2, 3));
		
		System.out.println("Testando raiz quadrada - raiz quadrada de 4: " + calc.raizQuadrada(4));
		System.out.println("Testando potencia��o - base 2 na 3 pot�ncia: " + calc.potencia(2, 3));
		
		System.out.println();
		System.out.println("Criando mais duas inst�ncias de CalculadoraCientifica");
		CalculadoraCientifica calc2 = new CalculadoraCientifica();
		CalculadoraCientifica calc3  = new CalculadoraCientifica();
		
		System.out.println("Quantidade de inst�ncias de CalculadoraCientifica: " + calc.getInstancia());
	}

}
