package conta;

import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int numero;
		String agencia;
		String nomeCliente;
		float saldo;
		System.out.println("Por favor digite o numero da conta: ");
		numero = leia.nextInt();
		leia.nextLine();
		System.out.println("Digite o numero da agencia: ");
		agencia = leia.nextLine();
		System.out.println("Digite o nome do Cliente: ");
		nomeCliente = leia.nextLine();
		System.out.println("Digite o saldo: ");
		saldo = leia.nextFloat();
		
		System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é: "+ agencia + ", conta: "
				+ numero + " e seu saldo "+ saldo +" já está disponível para saque.");
	

	}

}
