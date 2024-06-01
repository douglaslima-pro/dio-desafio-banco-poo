package services;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Telefone {

	public static boolean validarTelefone(String telefone) {
		Pattern padraoCPF = Pattern.compile("\\([0-9]{2}\\)\\s[0-9]{4,5}\\-[0-9]{4}");
		Matcher matcherCPF = padraoCPF.matcher(telefone);
		return matcherCPF.matches();
	}
	
}