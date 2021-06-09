/**
 * Classe que implementa Principal, parte da solu��o para o
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
public class Principal {

	/**
	 * @param args n�o utilizado
	 */
	public static void main(String[] args) {
		System.out.println("Atividade Avaliativa 2 - Exerc�cio 1");
		//System.out.println();

		Televisor tv = new Televisor();
		
		System.out.println("Teste valor inicial de volume em classe Televisor. Deve ser zero.");
		System.out.println("Valor de volume ap�s instanciar classe Televisor: " + tv.retornaVolume());
		System.out.println();
		
		System.out.println("Teste reduzir volume abaixo de 0. Deve continuar com zero.");
		tv.diminuiVolume();
		System.out.println("Valor do volume ap�s reduzir quando era 0: " + tv.retornaVolume());
		System.out.println();
		
		System.out.println("Teste aumentar volume acima de 40. Deve continuar quarenta.");
		System.out.println("Aumentando volume 51 vezes.");
		for(int i = 0; i<50; i++) {
			tv.aumentaVolume();
		}
		System.out.println("Valor do volume ap�s aumentar 51 vezes. Deve ser 40: " + tv.retornaVolume());

	}

}
