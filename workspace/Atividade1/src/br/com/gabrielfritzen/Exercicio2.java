/**
 * Classe com solução para o segundo exercício da Atividade Avaliativa 1 - POO2
 */
package br.com.gabrielfritzen;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 2. Declare um vetor de quatro posições do tipo de dados inteiro,
 * o software deve permanecer  pedindo  para  o  usuário  digitar  um
 * valor, até que o mesmo digite quatro valores válidos, os valores
 * válidos devem ser armazenados no vetor. 
 * 
 * @author Gabriel
 *
 */
public class Exercicio2 {

	/**
	 * @param args não são usados
	 */
	public static void main(String[] args) {
		System.out.println("Atividade Avaliativa 1 - Exercício 2");
		System.out.println();
		
		Scanner s = new Scanner(System.in);

		Integer[] vetor = new Integer[4];
		int valoresEntrados = 0;
		
		while(valoresEntrados < 4) {
			System.out.print("Entre o "+ (valoresEntrados + 1) + "º valor: ");
			try {
				vetor[valoresEntrados] = s.nextInt();
				valoresEntrados++;
			} catch(InputMismatchException e) { 
				System.out.println("Entro um valor inteiro.");
				s.next();
			}
		}
		
		System.out.println();
		System.out.println("Valores entrados: ");
		for (int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
		}
	}

}
