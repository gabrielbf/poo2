/**
 * Classe que implementa Professor, parte da solu��o para o
 * primeiro exerc�cio da Atividade Avaliativa 3 - POO2
 */
package br.com.gabrielfritzen.exercicio1;

/**
 * @author Gabriel
 *
 */
public class Professor extends Funcionario {

	@Override
	public float calculaSalario() {
		return getHorasTrabalhadas() * getValorHora();
	}

}