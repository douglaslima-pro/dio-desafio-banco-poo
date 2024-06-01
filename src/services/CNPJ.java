package services;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class CNPJ {

	public static boolean validarCNPJ(String cnpj) {
		Pattern padraoCNPJ = Pattern.compile("[0-9]{2}\\.[0-9]{3}\\.[0-9]{3}\\/[0-9]{4}\\-[0-9]{2}");
		Matcher matcherCNPJ = padraoCNPJ.matcher(cnpj);
		return matcherCNPJ.matches();
	}
}
