package layer2;

import java.util.Scanner;

import model.Conta;
import model.Operacao;
import service.ContaService;
import service.OperacaoService;

public class Main {

	public static void main(String[] args) {

		Conta conta = new Conta();
		OperacaoService operacao = new OperacaoService();
		ContaService newConta = new ContaService();
		Scanner leitor = new Scanner(System.in);
		int indice = 0;

		System.out.println("Digite o número do seu cpf: ");
		conta.Cpf = leitor.next();

		System.out.println("Digite o número seu nome: ");
		conta.Nome = leitor.next();

		System.out.println("Digite o número do seu Conta: ");
		conta.Conta = leitor.nextInt();

		System.out.println("Digite o número do seu Agência: ");
		conta.Agencia = leitor.nextInt();

		System.out.println("Digite o valor do seu Saldo: ");
		conta.Saldo = leitor.nextInt();

		newConta.SetConta(conta);

		System.out.println("Digite o indice da conta a ser pesquisada: ");
		conta = newConta.GetConta(leitor.nextInt());

		System.out.println("Conta: " + conta.Conta + "\nNome: " + conta.Nome + "\nCpf: " + conta.Cpf + "\nAgencia: "
				+ conta.Agencia + "\nSaldo: " + conta.Saldo);

		int r = 0;
		do {
			System.out.println(
					"Para Depósito digite 1: \n para sáque digite 2: \n para saldo digite 3:\n para sair digite 0:");

			int operacao1 = leitor.nextInt();

			switch (operacao1) {
			case 1:
				System.out.println("Digite o valor à depositar:");
				int deposito = leitor.nextInt();
				conta.Saldo = conta.Saldo + deposito;
				System.out.println("Conta: " + conta.Conta + "\nNome: " + conta.Nome + "\nCpf: " + conta.Cpf
						+ "\nAgencia: " + conta.Agencia + "\nSaldo: " + conta.Saldo);

				break;

			case 2:
				System.out.println("Digite o valor à sacar:");
				int saque = leitor.nextInt();
				if (saque > conta.Saldo) {
					System.out.println("Saldo insuficiente!\n");
					r = 2;

				} else {
					conta.Saldo = conta.Saldo - saque;
					System.out.println("Conta: " + conta.Conta + "\nNome: " + conta.Nome + "\nCpf: " + conta.Cpf
							+ "\nAgencia: " + conta.Agencia + "\nSaldo: " + conta.Saldo);

				}
				break;

			default:

				System.out.println("Este não é um dia válido!");

				break;

			}

		} while (r != 0);
	}

}
		
        
	


