/**
 * Classe que implementa Professor, parte da solução para o
 * primeiro exercício da Atividade Avaliativa 3 - POO2
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