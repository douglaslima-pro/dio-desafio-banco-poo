package app;

import model.*;
import exceptions.*;

public class AppBanco {

	public static void main(String[] args) {
		try {
			Banco itau = Banco.criarBanco(341, "ITAU UNIBANCO S.A.", "Itaú", "60.701.190/0001-04");
			itau.exibirInformacoesBanco();
		} catch (CNPJInvalidoException e) {
			System.out.println(e.getMessage());
		}
		Cliente ana = new Cliente("Ana Christina de Oliveira");
		ana.setCpf("899.071.005-78");
		ana.setSexo('F');
		ana.setTelefone("(41) 98971-9921");
		Conta ccAna = new ContaCorrente(ana);
		ccAna.exibirInformacoesConta();
		ccAna.depositar(1300);
		ccAna.sacar(150);
	}
}