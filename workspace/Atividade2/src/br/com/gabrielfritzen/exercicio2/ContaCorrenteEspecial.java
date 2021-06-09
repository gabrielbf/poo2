/**
 * Classe que implementa ContaCorrenteEspecial, parte da solução do segundo
 * exercício da Atividade Avaliativa 2. 
 */
package br.com.gabrielfritzen.exercicio2;


/**
 * @author Gabriel
 *
 */
public class ContaCorrenteEspecial extends ContaCorrente {
	private float limite;

	public ContaCorrenteEspecial(float saldo, float limite) {
		super(saldo);
		this.limite = limite;
	}

	@Override
	public void sacarValor(float valor) {
		if (valor <= super.saldo + limite) {
			super.saldo -= valor;
		}
	}

	public float getLimite() {
		return limite;
	}

	public void setLimite(float limite) {
		this.limite = limite;
	}
		
	

}
