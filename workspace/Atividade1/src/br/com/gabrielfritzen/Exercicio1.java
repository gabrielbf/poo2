package br.com.gabrielfritzen;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Classe com solu��o para o primeiro exerc�cio da Atividade Avaliativa 1 - POO2
 */

/**
 * 1. Fa�a um programa que leia quatro valores. 
 * Fa�a a divis�o do primeiro valor pelo segundo. 
 * Na sequ�ncia, subtraia o resultado pelo terceiro valor informado.
 * Ap�s,  multiplique o resultado obtido pelo quarto valor informado pelo usu�rio.
 * Realize tratamento de exce��o para caso um dos valores digitados seja inv�lido.
 * 
 * @author Gabriel
 *
 */
public class Exercicio1 {

	/**
	 * @param args n�o usado
	 */
	public static void main(String[] args) {
		System.out.println("Atividade Avaliativa 1 - Exerc�cio 1");
		System.out.println();
		
		Scanner s = new Scanner(System.in);

		Integer primeiroValor = null;
		Integer segundoValor = null;
		Integer terceiroValor = null;
		Integer quartoValor = null;
		
		System.out.print("Insira o primeiro valor: ");
		while(primeiroValor == null) {
			try {
				primeiroValor = s.nextInt();
			// Acho que poderia fazer um catch sem exce��o por que eu n�o estou usando no bloco
			} catch(InputMismatchException e) {
				System.out.println("Primeiro valor precisa ser um n�mero");
				System.out.print("Insira o primeiro valor: ");
				s.next();
			}
		}

		System.out.print("Insira o segundo valor: ");
		while(segundoValor == null) {
			try {
				segundoValor = s.nextInt();
			} catch(InputMismatchException e) {
				System.out.println("Segundo valor precisa ser um n�mero");
				System.out.print("Insira o segundo valor: ");
				s.next();
			}
		}

		System.out.print("Insira o terceiro valor: ");
		while(terceiroValor == null) {
			try {
				terceiroValor = s.nextInt();
			} catch(InputMismatchException e) {
				System.out.println("Terceiro valor precisa ser um n�mero");
				System.out.print("Insira o terceiro valor: ");
				s.next();
			}
		}

		System.out.print("Insira o quarto valor: ");
		while(quartoValor == null) {
			try {
				quartoValor = s.nextInt();
			} catch(InputMismatchException e) {
				System.out.println("Quarto valor precisa ser um n�mero");
				System.out.print("Insira o quarto valor: ");
				s.next();
			}
		}
		
		//Casts para poder dividir os Integers
		Double primeiroValorDouble = (double) primeiroValor;
		Double segundoValorDouble = (double) segundoValor;
		Double resultadoDiv = primeiroValorDouble / segundoValorDouble;
		Double resultadoSub = resultadoDiv - terceiroValor;
		Double resultadoMult = resultadoSub * quartoValor;

		System.out.println("Resultado de (((" + primeiroValor + " / " + segundoValor + ") - " + terceiroValor + ") * " + quartoValor + ") � " + resultadoMult);
	}
}
