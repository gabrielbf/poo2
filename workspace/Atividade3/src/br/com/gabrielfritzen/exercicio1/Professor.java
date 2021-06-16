/**
 * 
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