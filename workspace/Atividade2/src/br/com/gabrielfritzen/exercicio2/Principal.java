/**
 * Classe que implementa Principal, parte da solução para o
 * segundo exercício da Atividade Avaliativa 2 - POO2
 */
package br.com.gabrielfritzen.exercicio2;

/**
 * 2. Um banco possui dois tipos de conta: conta corrente e conta corrente
 * especial. O tipo conta corrente possui um número, um cliente e um saldo. Neste
 * tipo de conta é possível fazer depósito, consultar saldo e realizar saque. O
 * banco não permite saque, neste tipo de conta, se o valor a ser retirado é
 * maior que o saldo da  conta.  Para  as  contas  do  tipo  conta  corrente 
 * especial  deseja-se  saber  o número, o cliente, o saldo e o limite. Para este
 * tipo de conta são permitidas as operações de depósito, consulta de saldo e
 * saque. O banco permite que, para este tipo de conta, o saque seja realizado
 * mesmo que a retirada seja maior que o saldo, desde que não ultrapasse o limite
 * da conta. Para resolver este problema utilize os conceitos de herança,
 * polimorfismo e sobrescrita de métodos. Crie uma classe Principal para testar
 * os métodos criados.
 * 
 * @author Gabriel
 */
public class Principal {

	/**
	 * @param args não usado
	 */
	public static void main(String[] args) {
		System.out.println("Atividade Avaliativa 2 - Exercício 2");
		
		/* Criar objeto conta corrente
		 * Tentar sacar com saldo zero
		 * Continuar com saldo zero
		 * Adicionar valor e checar saldo
		 * Remover valor e checar saldo
		 */
		System.out.println("Criando conta corrente com saldo 0");
		ContaCorrente cc = new ContaCorrente(0);

		System.out.println("Incluir cliente");
		cc.setCliente("Gabriel");
		System.out.println("Nome do cliente deve ser Gabriel: " + cc.getCliente());
		
		System.out.println("Incluir número da conta");
		cc.setNumeroConta("THX1138");
		System.out.println("Número da conta deve ser THX1138: " + cc.getNumeroConta());

		System.out.println("Sacar 10 da conta corrente recém criada");
		sacar(cc, 10);
		System.out.println("Saldo da conta corrente. Deve ser 0: " + cc.consultarSaldo());
		
		System.out.println("Adicionar 50 de saldo na conta corrente");
		depositar(cc, 50);
		System.out.println("Saldo da conta corrente agora deve ser 50: " + cc.consultarSaldo());
		
		System.out.println("Sacar 20");
		sacar(cc, 20);
		System.out.println("Saldo da conta corrente agora deve ser 30: " + cc.consultarSaldo());
		
		System.out.println("Sacar 40");
		sacar(cc, 40);
		System.out.println("Saldo da conta corrente deve ser 30 ainda - não pode sacar mais que o saldo disponível: " +
				cc.consultarSaldo());
		
		
		System.out.println();
		System.out.println("Criando conta corrente especial com saldo 0 e limite 100");
		ContaCorrenteEspecial cce = new ContaCorrenteEspecial(0, 100);
		
		System.out.println("Inclur nome para a conta especial");
		cce.setCliente("Jon Anderson");
		System.out.println("Nome do cliente deve ser Jon Anderson: " + cce.getCliente());

		System.out.println("Incluir número de conta para conta especial");
		cce.setNumeroConta("2112");
		System.out.println("Número de conta especial deve ser 2112: " + cce.getNumeroConta());

		System.out.println("Sacar 10 da conta corrente especial");
		sacar(cce, 10);
		System.out.println("Deve ter -10 de saldo: " + cce.consultarSaldo());
		System.out.println("Depositar 20");
		depositar(cce, 20);
		System.out.println("Deve ter um saldo de 10: " + cce.consultarSaldo());
		System.out.println("Sacar 110");
		System.out.println("Qual é o limite da conta especial? " + cce.getLimite());
		sacar(cce, 110);
		System.out.println("Dever ter -100 de saldo - não pode sacar mais que o limite: " + cce.consultarSaldo());
		

	}
	
	// Métodos auxiliares que usam polimorfismo
	private static void sacar(ContaCorrente conta, float valor) {
		conta.sacarValor(valor);
	}

	private static void depositar(ContaCorrente conta, float valor) {
		conta.depositarValor(valor);
	}
}
