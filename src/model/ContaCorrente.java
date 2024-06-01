package model;

public class ContaCorrente extends Conta {

	public ContaCorrente(Cliente cliente) {
		super(cliente);
		super.tipoConta = "Corrente";
	}

}
