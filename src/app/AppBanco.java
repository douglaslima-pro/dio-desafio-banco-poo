package app;

import model.*;
import exceptions.*;

public class AppBanco {

	public static void main(String[] args) {
		Banco itau = null;
		try {
			itau = Banco.criarBanco(341, "ITAU UNIBANCO S.A.", "Itaú", "60.701.190/0001-04");
		} catch (CNPJInvalidoException e) {
			System.out.println(e.getMessage());
		}
		if (itau != null) {
			itau.exibirInformacoesBanco();
		}
		Cliente ana = new Cliente("Ana Christina de Oliveira");
		ana.setCpf("899.071.005-78");
		ana.setSexo('F');
		ana.setTelefone("(41) 98971-9921");
		Conta ccAna = new ContaCorrente(ana);
		ccAna.exibirInformacoesConta();
		ccAna.depositar(1300);
		ccAna.exibirInformacoesConta();
		ccAna.sacar(150);
		ccAna.exibirInformacoesConta();
	}
}