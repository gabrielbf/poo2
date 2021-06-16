/**
 * Classe que implementa Principal, parte da solu��o para o
 * primeiro exerc�cio da Atividade Avaliativa 3 - POO2
 */
package br.com.gabrielfritzen.exercicio1;

/**
 * 1. Crie uma classe chamada Funcionario que seja abstrata, com atributos
 * para o n�mero de horas trabalhadas e o valor que o funcion�rio recebe por
 * hora, esta classe deve possuir o m�todo abstrato calculaSalario, que
 * retorna o sal�rio do funcion�rio. Ap�s, crie a subclasse Vendedor que
 * herda da classe Funcionario, possui o atributo para o valor da comiss�o.
 * Crie tamb�m a classe Professor que herda da classe Funcionario. Para 
 * implementar o m�todo calculaSalario na classe Vendedor, multiplique o
 * n�mero de horas trabalhadas pelo valor da hora, ap�s some com o valor da
 * comiss�o. Para implementar o m�todo calculaSalario na classe Professor, 
 * multiplique o n�mero de horas trabalhadas pelo valor da hora. Crie
 * uma classe Principal para testar os m�todos desenvolvidos.
 * 
 * @author Gabriel
 *
 */
public class Principal {

	/**
	 * @param args n�o usado
	 */
	public static void main(String[] args) {
		System.out.println("Atividade Avaliativa 3 - Exerc�cio 1");
		/*
		 * Criar Professor
		 * setar valor de hora e quantidade de horas trabalhadas
		 * buscar valor do sal�rio
		 */
		System.out.println("Criando Professor com 100 horas trabalhadas e valor hora igual a 7");
		Professor prof = new Professor();
		prof.setHorasTrabalhadas(100);
		prof.setValorHora(7);
		
		System.out.println("Sal�rio do professro deve ser 700: " + prof.calculaSalario());
		
		System.out.println();
		
		/*
		 * Criar Vendedor
		 * setar valor de hora, quantidade de horas trabalhadas e valor de comiss�o
		 * buscar valor sal�rio
		 */
		System.out.println("Criando Vendendor com 100 horas trabalhadas, valor hora igual a 7 e com 72 de comiss�o");
		Vendedor vend = new Vendedor();
		vend.setHorasTrabalhadas(100);
		vend.setValorHora(7);
		vend.setComissao(72);
		
		System.out.println("Sal�rio do vendedor deve ser 772: " + vend.calculaSalario());
	}
}