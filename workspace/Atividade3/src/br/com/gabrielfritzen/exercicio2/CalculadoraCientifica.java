/**
 * Classe que implementa CalculadoraCientifica, parte da solução para o
 * segundo exercício da Atividade Avaliativa 3 - POO2
 */
package br.com.gabrielfritzen.exercicio2;

/**
 * @author Gabriel
 *
 */
public class CalculadoraCientifica extends Calculadora {
	private static int instancia;

	public CalculadoraCientifica( ) {
		instancia++;
	}

	public double raizQuadrada(int valor) {
		return Math.sqrt((double) valor);
	}
	
	public double potencia(int base, int expoente) {
		return Math.pow(base, expoente);
	}

	public static int getInstancia() {
		return instancia;
	}
}
