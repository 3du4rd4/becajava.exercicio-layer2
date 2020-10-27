package service;

import model.Conta;
import repository.ContaRepository;

public class ContaService {
	public Conta GetConta(int indice) {

		ContaRepository repository = new ContaRepository();
		Conta result = repository.GetConta(indice);

		return result;
	}

	public void SetConta(Conta conta) {
		ContaRepository repository = new ContaRepository();

		repository.SetConta(conta);
	}
}
