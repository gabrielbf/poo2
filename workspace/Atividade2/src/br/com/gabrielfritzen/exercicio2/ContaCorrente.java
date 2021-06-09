/**
 * Classe que implementa ContaCorrente, parte da solu��o do segundo exerc�cio
 * da Atividade Avaliativa 2.
 */
package br.com.gabrielfritzen.exercicio2;

/**
 * @author Gabriel
 *
 */
public class ContaCorrente {
	private String numeroConta;
	private String cliente;

	// Deveria ser BigDecimal para dinheiro, mas t� tarde e eu preciso terminar a atividade
	//private BigDecimal saldo;
	float saldo;
	
	public ContaCorrente(float saldo) {
		this.saldo = saldo;
	}
	public void depositarValor(float valor) {
		if (valor > 0) {
			saldo += valor;
		}
	}

	public float consultarSaldo() {
		return this.saldo;
	}

	public void sacarValor(float valor) {
		if (valor <= saldo) {
			saldo -= valor;
		}
	}

	public String getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
}
