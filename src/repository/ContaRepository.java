package repository;

import java.util.ArrayList;

import model.Conta;

public class ContaRepository {

	public ArrayList<Conta> Lista = new ArrayList<Conta>();

	public Conta GetConta(int indice) {

		Conta conta = new Conta();
		conta.Agencia = 1234;
		conta.Conta = 123456789;
		conta.Cpf = "1234567890";
		conta.Nome = "Fulano";
		conta.Saldo = 2900;
		Lista.add(conta);

		conta = new Conta();
		conta.Agencia = 5678;
		conta.Conta = 987654321;
		conta.Cpf = "0987654321";
		conta.Nome = "Beltrano";
		conta.Saldo = 2700;
		Lista.add(conta);

		conta = new Conta();
		conta.Agencia = 1356;
		conta.Conta = 876543219;
		conta.Cpf = "9876543219";
		conta.Nome = "Isabelly";
		conta.Saldo = 2300;
		Lista.add(conta);

		return Lista.get(indice);

	}

	public void SetConta(Conta conta) {

		Lista.add(conta);
	}
}
