/**
 * Classe que implementa Funcionario, parte da solução para o
 * primeiro exercício da Atividade Avaliativa 3 - POO2
 */
package br.com.gabrielfritzen.exercicio1;

/**
 * @author Gabriel
 */
public abstract class Funcionario {
	private float horasTrabalhadas;
	private float valorHora;
	
	public abstract float calculaSalario();

	public float getHorasTrabalhadas() {
		return horasTrabalhadas;
	}

	public void setHorasTrabalhadas(float horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}

	public float getValorHora() {
		return valorHora;
	}

	public void setValorHora(float valorHora) {
		this.valorHora = valorHora;
	}
}
