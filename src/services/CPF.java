package services;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class CPF {

	public static boolean validarCPF(String cpf) {
		Pattern padraoCPF = Pattern.compile("[0-9]{3}\\.[0-9]{3}\\.[0-9]{3}\\-[0-9]{2}");
		Matcher matcherCPF = padraoCPF.matcher(cpf);
		return matcherCPF.matches();
	}

}