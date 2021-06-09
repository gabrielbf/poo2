/**
 * Classe que implementa Principal, parte da solu��o para o
 * segundo exerc�cio da Atividade Avaliativa 2 - POO2
 */
package br.com.gabrielfritzen.exercicio2;

/**
 * 2. Um banco possui dois tipos de conta: conta corrente e conta corrente
 * especial. O tipo conta corrente possui um n�mero, um cliente e um saldo. Neste
 * tipo de conta � poss�vel fazer dep�sito, consultar saldo e realizar saque. O
 * banco n�o permite saque, neste tipo de conta, se o valor a ser retirado �
 * maior que o saldo da  conta.  Para  as  contas  do  tipo  conta  corrente 
 * especial  deseja-se  saber  o n�mero, o cliente, o saldo e o limite. Para este
 * tipo de conta s�o permitidas as opera��es de dep�sito, consulta de saldo e
 * saque. O banco permite que, para este tipo de conta, o saque seja realizado
 * mesmo que a retirada seja maior que o saldo, desde que n�o ultrapasse o limite
 * da conta. Para resolver este problema utilize os conceitos de heran�a,
 * polimorfismo e sobrescrita de m�todos. Crie uma classe Principal para testar
 * os m�todos criados.
 * 
 * @author Gabriel
 */
public class Principal {

	/**
	 * @param args n�o usado
	 */
	public static void main(String[] args) {
		System.out.println("Atividade Avaliativa 2 - Exerc�cio 2");
		
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
		
		System.out.println("Incluir n�mero da conta");
		cc.setNumeroConta("THX1138");
		System.out.println("N�mero da conta deve ser THX1138: " + cc.getNumeroConta());

		System.out.println("Sacar 10 da conta corrente rec�m criada");
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
		System.out.println("Saldo da conta corrente deve ser 30 ainda - n�o pode sacar mais que o saldo dispon�vel: " +
				cc.consultarSaldo());
		
		
		System.out.println();
		System.out.println("Criando conta corrente especial com saldo 0 e limite 100");
		ContaCorrenteEspecial cce = new ContaCorrenteEspecial(0, 100);
		
		System.out.println("Inclur nome para a conta especial");
		cce.setCliente("Jon Anderson");
		System.out.println("Nome do cliente deve ser Jon Anderson: " + cce.getCliente());

		System.out.println("Incluir n�mero de conta para conta especial");
		cce.setNumeroConta("2112");
		System.out.println("N�mero de conta especial deve ser 2112: " + cce.getNumeroConta());

		System.out.println("Sacar 10 da conta corrente especial");
		sacar(cce, 10);
		System.out.println("Deve ter -10 de saldo: " + cce.consultarSaldo());
		System.out.println("Depositar 20");
		depositar(cce, 20);
		System.out.println("Deve ter um saldo de 10: " + cce.consultarSaldo());
		System.out.println("Sacar 110");
		System.out.println("Qual � o limite da conta especial? " + cce.getLimite());
		sacar(cce, 110);
		System.out.println("Dever ter -100 de saldo - n�o pode sacar mais que o limite: " + cce.consultarSaldo());
		

	}
	
	// M�todos auxiliares que usam polimorfismo
	private static void sacar(ContaCorrente conta, float valor) {
		conta.sacarValor(valor);
	}

	private static void depositar(ContaCorrente conta, float valor) {
		conta.depositarValor(valor);
	}
}
