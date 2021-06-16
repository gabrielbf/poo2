/**
 * Classe que implementa Calculadora, parte da solução para o
 * segundo exercício da Atividade Avaliativa 3 - POO2
 */
package br.com.gabrielfritzen.exercicio2;

public abstract class Calculadora {
	public int soma(int primeiroValor, int segundoValor) {
		return primeiroValor + segundoValor;
	}

	public int subtracao(int minuendo, int subtraendo) {
		return minuendo - subtraendo;
	}

	public float divisao(int dividendo, int divisor) {
		if (divisor != 0) {
			float divid = (float)dividendo;
			float divis = (float)divisor;
			return  divid/divis;
		} else {
			throw new ArithmeticException();
		}
	}

	public int multiplicacao(int multiplicando, int multiplicador) {
		return multiplicando * multiplicador;
	}
}
