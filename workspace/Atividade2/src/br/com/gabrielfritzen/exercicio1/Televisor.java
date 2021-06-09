/**
 * Classe que implementa Televisao, parte da solu��o para o
 * primeiro exerc�cio da Atividade Avaliativa 2 - POO2
 */
package br.com.gabrielfritzen.exercicio1;

/**
 * 1. Crie uma classe chamada Televisor que possua o atributo volume e
 * os m�todos aumentaVolume() e diminuiVolume() que nada retornam. O 
 * m�todo aumentaVolume aumenta em 1 (incrementa) a vari�vel volume, desde que
 * n�o esteja com volume igual a 40, neste caso, o m�todo n�o deve realizar
 * nenhuma a��o. J� o m�todo diminuiVolume diminui em 1 (decrementa) a vari�vel
 * volume, desde que j� n�o esteja com volume igual a zero. O volume deve ser
 * iniciado no construtor com o valor igual a zero. Crie o m�todo 
 * retornaVolume(), que ir� retornar o volume do televisor. Crie a 
 * classe Principal para testar os m�todos desenvolvidos. 
 * 
 * @author Gabriel
 *
 */
public class Televisor {
	private int volume;
	
	public Televisor() {
		this.volume = 0;
	}
	
	public void aumentaVolume() {
		if (this.volume < 40) {
			this.volume++;
		}
	}

	public void diminuiVolume() {
		if (this.volume > 0) {
			this.volume--;
		}
	}
	
	public int retornaVolume() {
		return this.volume;
	}


}
