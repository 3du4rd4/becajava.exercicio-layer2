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

		System.out.println("Digite o n�mero do seu cpf: ");
		conta.Cpf = leitor.next();

		System.out.println("Digite o n�mero seu nome: ");
		conta.Nome = leitor.next();

		System.out.println("Digite o n�mero do seu Conta: ");
		conta.Conta = leitor.nextInt();

		System.out.println("Digite o n�mero do seu Ag�ncia: ");
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
					"Para Dep�sito digite 1: \n para s�que digite 2: \n para saldo digite 3:\n para sair digite 0:");

			int operacao1 = leitor.nextInt();

			switch (operacao1) {
			case 1:
				System.out.println("Digite o valor � depositar:");
				int deposito = leitor.nextInt();
				conta.Saldo = conta.Saldo + deposito;
				System.out.println("Conta: " + conta.Conta + "\nNome: " + conta.Nome + "\nCpf: " + conta.Cpf
						+ "\nAgencia: " + conta.Agencia + "\nSaldo: " + conta.Saldo);

				break;

			case 2:
				System.out.println("Digite o valor � sacar:");
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

				System.out.println("Este n�o � um dia v�lido!");

				break;

			}

		} while (r != 0);
	}

}
		
        
	


