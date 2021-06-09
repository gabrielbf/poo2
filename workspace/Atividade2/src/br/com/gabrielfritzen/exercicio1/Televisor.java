/**
 * Classe que implementa Televisao, parte da solução para o
 * primeiro exercício da Atividade Avaliativa 2 - POO2
 */
package br.com.gabrielfritzen.exercicio1;

/**
 * 1. Crie uma classe chamada Televisor que possua o atributo volume e
 * os métodos aumentaVolume() e diminuiVolume() que nada retornam. O 
 * método aumentaVolume aumenta em 1 (incrementa) a variável volume, desde que
 * não esteja com volume igual a 40, neste caso, o método não deve realizar
 * nenhuma ação. Já o método diminuiVolume diminui em 1 (decrementa) a variável
 * volume, desde que já não esteja com volume igual a zero. O volume deve ser
 * iniciado no construtor com o valor igual a zero. Crie o método 
 * retornaVolume(), que irá retornar o volume do televisor. Crie a 
 * classe Principal para testar os métodos desenvolvidos. 
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
