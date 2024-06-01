package model;

import services.CNPJ;
import exceptions.*;

public class Banco {

	private int codigo;
	private String razaoSocial;
	private String nome;
	private String cnpj;

	
	private Banco(int codigo, String razaoSocial, String nome, String cnpj) {
		super();
		this.codigo = codigo;
		this.razaoSocial = razaoSocial;
		this.nome = nome;
		this.cnpj = cnpj;
	}

	public static Banco criarBanco(int codigo, String razaoSocial, String nome, String cnpj) throws CNPJInvalidoException {
		if (!CNPJ.validarCNPJ(cnpj)) {
			throw new CNPJInvalidoException("CNPJ inválido! Insira um CNPJ no formato xx.xxx.xxx/xxxx-xx!");
		}
		return new Banco(codigo, razaoSocial, nome, cnpj);
	}

	public void exibirInformacoesBanco() {
		System.out.println();
		System.out.println();
		System.out.println("Informações do banco");
		System.out.println();
		System.out.printf("%30s %30s%n", "CODIGO", "RAZAO SOCIAL");
		System.out.printf("%30s %30s%n", "------", "------------");
		System.out.printf("%30d %30s%n", this.codigo, this.razaoSocial);
		System.out.println();
		System.out.printf("%30s %30s%n", "NOME", "CNPJ");
		System.out.printf("%30s %30s%n", "----", "----");
		System.out.printf("%30s %30s%n", this.nome, this.cnpj);
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public boolean setCnpj(String cnpj) {
		if (!CNPJ.validarCNPJ(cnpj)) {
			return false;
		}
		this.cnpj = cnpj;
		return true;
	}

}