/**
 * 
 */
package br.com.gabrielfritzen.exercicio1;

/**
 * Após, crie a subclasse Vendedor que
 * herda da classe Funcionario, possui o atributo para o valor da comissão.
 * @author Gabriel
 *
 */
public class Vendedor extends Funcionario {
	private float comissao;

	@Override
	public float calculaSalario() {
		return (getHorasTrabalhadas() * getValorHora()) + getComissao();
	}

	public float getComissao() {
		return comissao;
	}

	public void setComissao(float comissao) {
		this.comissao = comissao;
	}
}
