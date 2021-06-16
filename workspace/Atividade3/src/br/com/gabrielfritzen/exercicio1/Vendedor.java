/**
 * Classe que implementa Vendedor, parte da solu��o para o
 * primeiro exerc�cio da Atividade Avaliativa 3 - POO2
 */
package br.com.gabrielfritzen.exercicio1;

/**
 * Ap�s, crie a subclasse Vendedor que
 * herda da classe Funcionario, possui o atributo para o valor da comiss�o.
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
