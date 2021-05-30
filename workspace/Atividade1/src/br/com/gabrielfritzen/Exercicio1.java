package br.com.gabrielfritzen;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Classe com solução para o primeiro exercício da Atividade Avaliativa 1 - POO2
 */

/**
 * 1. Faça um programa que leia quatro valores. 
 * Faça a divisão do primeiro valor pelo segundo. 
 * Na sequência, subtraia o resultado pelo terceiro valor informado.
 * Após,  multiplique o resultado obtido pelo quarto valor informado pelo usuário.
 * Realize tratamento de exceção para caso um dos valores digitados seja inválido.
 * 
 * @author Gabriel
 *
 */
public class Exercicio1 {

	/**
	 * @param args não usado
	 */
	public static void main(String[] args) {
		System.out.println("Atividade Avaliativa 1 - Exercício 1");
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
			// Acho que poderia fazer um catch sem exceção por que eu não estou usando no bloco
			} catch(InputMismatchException e) {
				System.out.println("Primeiro valor precisa ser um número");
				System.out.print("Insira o primeiro valor: ");
				s.next();
			}
		}

		System.out.print("Insira o segundo valor: ");
		while(segundoValor == null) {
			try {
				segundoValor = s.nextInt();
			} catch(InputMismatchException e) {
				System.out.println("Segundo valor precisa ser um número");
				System.out.print("Insira o segundo valor: ");
				s.next();
			}
		}

		System.out.print("Insira o terceiro valor: ");
		while(terceiroValor == null) {
			try {
				terceiroValor = s.nextInt();
			} catch(InputMismatchException e) {
				System.out.println("Terceiro valor precisa ser um número");
				System.out.print("Insira o terceiro valor: ");
				s.next();
			}
		}

		System.out.print("Insira o quarto valor: ");
		while(quartoValor == null) {
			try {
				quartoValor = s.nextInt();
			} catch(InputMismatchException e) {
				System.out.println("Quarto valor precisa ser um número");
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

		System.out.println("Resultado de (((" + primeiroValor + " / " + segundoValor + ") - " + terceiroValor + ") * " + quartoValor + ") é " + resultadoMult);
	}
}
