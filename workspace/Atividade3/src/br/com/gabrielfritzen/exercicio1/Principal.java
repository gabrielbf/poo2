/**
 * Classe que implementa Principal, parte da solução para o
 * primeiro exercício da Atividade Avaliativa 3 - POO2
 */
package br.com.gabrielfritzen.exercicio1;

/**
 * 1. Crie uma classe chamada Funcionario que seja abstrata, com atributos
 * para o número de horas trabalhadas e o valor que o funcionário recebe por
 * hora, esta classe deve possuir o método abstrato calculaSalario, que
 * retorna o salário do funcionário. Após, crie a subclasse Vendedor que
 * herda da classe Funcionario, possui o atributo para o valor da comissão.
 * Crie também a classe Professor que herda da classe Funcionario. Para 
 * implementar o método calculaSalario na classe Vendedor, multiplique o
 * número de horas trabalhadas pelo valor da hora, após some com o valor da
 * comissão. Para implementar o método calculaSalario na classe Professor, 
 * multiplique o número de horas trabalhadas pelo valor da hora. Crie
 * uma classe Principal para testar os métodos desenvolvidos.
 * 
 * @author Gabriel
 *
 */
public class Principal {

	/**
	 * @param args não usado
	 */
	public static void main(String[] args) {
		System.out.println("Atividade Avaliativa 3 - Exercício 1");
		/*
		 * Criar Professor
		 * setar valor de hora e quantidade de horas trabalhadas
		 * buscar valor do salário
		 */
		System.out.println("Criando Professor com 100 horas trabalhadas e valor hora igual a 7");
		Professor prof = new Professor();
		prof.setHorasTrabalhadas(100);
		prof.setValorHora(7);
		
		System.out.println("Salário do professro deve ser 700: " + prof.calculaSalario());
		
		System.out.println();
		
		/*
		 * Criar Vendedor
		 * setar valor de hora, quantidade de horas trabalhadas e valor de comissão
		 * buscar valor salário
		 */
		System.out.println("Criando Vendendor com 100 horas trabalhadas, valor hora igual a 7 e com 72 de comissão");
		Vendedor vend = new Vendedor();
		vend.setHorasTrabalhadas(100);
		vend.setValorHora(7);
		vend.setComissao(72);
		
		System.out.println("Salário do vendedor deve ser 772: " + vend.calculaSalario());
	}
}