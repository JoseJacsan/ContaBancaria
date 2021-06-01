package pacoteCriaConta;

import java.util.Locale;
import java.util.Scanner;
import pacoteConta.Conta;

public class CriaConta {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner leitor = new Scanner(System.in);
		Conta contaCliente = new Conta();
		contaCliente.titular = leitor.nextLine();
		contaCliente.agencia = leitor.nextInt();
		contaCliente.numero = leitor.nextInt();
		contaCliente.saldo = leitor.nextDouble();
		
		System.out.println("-----Conta-------");
		System.out.println("Titular: " + contaCliente.titular);
		System.out.println("Agência: " + contaCliente.agencia);
		System.out.println("Número da conta: " + contaCliente.numero);
		System.out.printf("Saldo: R$ %.2f%n", contaCliente.saldo);
		
		leitor.close();
	}
}
