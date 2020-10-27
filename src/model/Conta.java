package model;

import repository.ContaRepository;

public class Conta {

	public String Nome;
	public int Conta;
	public int Agencia;
	public String Cpf;
	public double Saldo;

	public void SetConta(Conta conta) {
		ContaRepository repository = new ContaRepository();

		repository.SetConta(conta);
	}

}