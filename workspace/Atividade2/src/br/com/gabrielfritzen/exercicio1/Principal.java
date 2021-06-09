/**
 * Classe que implementa Principal, parte da solução para o
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
public class Principal {

	/**
	 * @param args não utilizado
	 */
	public static void main(String[] args) {
		System.out.println("Atividade Avaliativa 2 - Exercício 1");
		//System.out.println();

		Televisor tv = new Televisor();
		
		System.out.println("Teste valor inicial de volume em classe Televisor. Deve ser zero.");
		System.out.println("Valor de volume após instanciar classe Televisor: " + tv.retornaVolume());
		System.out.println();
		
		System.out.println("Teste reduzir volume abaixo de 0. Deve continuar com zero.");
		tv.diminuiVolume();
		System.out.println("Valor do volume após reduzir quando era 0: " + tv.retornaVolume());
		System.out.println();
		
		System.out.println("Teste aumentar volume acima de 40. Deve continuar quarenta.");
		System.out.println("Aumentando volume 51 vezes.");
		for(int i = 0; i<50; i++) {
			tv.aumentaVolume();
		}
		System.out.println("Valor do volume após aumentar 51 vezes. Deve ser 40: " + tv.retornaVolume());

	}

}
