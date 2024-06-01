package model;

import services.CPF;
import services.Telefone;

public class Cliente {

	private String nome;
	private char sexo;
	private String telefone;
	private String cpf;

	public Cliente(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public char getSexo() {
		return sexo;
	}

	public boolean setSexo(char sexo) {
		if (sexo != 'M' && sexo != 'F') {
			return false;
		}
		this.sexo = sexo;
		return true;
	}

	public String getTelefone() {
		return telefone;
	}

	public boolean setTelefone(String telefone) {
		if (!Telefone.validarTelefone(telefone)) {
			return false;
		}
		this.telefone = telefone;
		return true;
	}

	public String getCpf() {
		return cpf;
	}

	public boolean setCpf(String cpf) {
		if (!CPF.validarCPF(cpf)) {
			return false;
		}
		this.cpf = cpf;
		return true;
	}

}