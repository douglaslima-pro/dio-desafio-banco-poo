package model;

import java.util.Objects;

public abstract class Conta implements Comparable<Conta> {

	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1000;

	private int agencia;
	private int numero;
	private double saldo = 0.0;
	protected String tipoConta;
	private Cliente titular;

	public Conta(Cliente cliente) {
		this.agencia = AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.titular = cliente;
	}

	public boolean depositar(double valorDeposito) {
		System.out.println();
		double saldoInicial = this.saldo;
		if (valorDeposito > 0.0) {
			this.saldo += valorDeposito;
			System.out.println("Depósito realizado com sucesso!");
			System.out.printf("R$ %,.2f foram depositados na conta.%n", valorDeposito);
			System.out.println();
			System.out.printf("%30s %30s%n", "SALDO INICIAL (R$)", "SALDO FINAL (R$)");
			System.out.printf("%30s %30s%n", "------------------", "----------------");
			System.out.printf("%,30.2f %,30.2f%n", saldoInicial, this.saldo);
			return true;
		} else {
			System.out.println("Falha ao realizar o depósito!");
			System.out.println("Valor de depósito deve ser positivo e maior que zero!");
			return false;
		}
	}
	
	public boolean sacar(double valorSaque) {
		double saldoInicial = this.saldo;
		System.out.println();
		if (valorSaque <= this.saldo && valorSaque > 0) {
			this.saldo -= valorSaque;
			System.out.println("Saque realizado com sucesso!");
			System.out.printf("R$ %,.2f foram sacados da conta.%n", valorSaque);
			System.out.println();
			System.out.printf("%30s %30s%n", "SALDO INICIAL (R$)", "SALDO FINAL (R$)");
			System.out.printf("%30s %30s%n", "------------------", "----------------");
			System.out.printf("%,30.2f %,30.2f%n", saldoInicial, this.saldo);
			return true;
		} else {
			System.out.println("Falha ao realizar o saque!");
			System.out.println("Valor de saque deve ser positivo e maior que zero e não pode ser maior que o saldo disponível na conta!");
			return false;
		}
	}
	
	public void exibirInformacoesConta() {
		System.out.println();
		System.out.println();
		System.out.println("Informações do titular");
		System.out.println();
		System.out.printf("%30s %30s%n", "NOME COMPLETO", "SEXO");
		System.out.printf("%30s %30s%n", "-------------", "----");
		System.out.printf("%30s %30c%n", this.titular.getNome(), this.titular.getSexo());
		System.out.println();
		System.out.printf("%30s %30s%n", "TELEFONE", "CPF");
		System.out.printf("%30s %30s%n", "--------", "---");
		System.out.printf("%30s %30s%n", this.titular.getTelefone(), this.titular.getCpf());
		System.out.println();
		System.out.println();
		System.out.println("Informações da conta");
		System.out.println();
		System.out.printf("%30s %30s%n", "AGENCIA", "NUMERO");
		System.out.printf("%30s %30s%n", "-------", "------");
		System.out.printf("%30d %30d%n", this.agencia, this.numero);
		System.out.println();
		System.out.printf("%30s %30s%n", "TIPO DA CONTA", "SALDO (R$)");
		System.out.printf("%30s %30s%n", "-------", "------");
		System.out.printf("%30s %,30.2f%n", this.tipoConta, this.saldo);
		System.out.println();
	}

	@Override
	public int compareTo(Conta conta) {
		int compararPorAgencia = Integer.compare(this.agencia, conta.getAgencia());
		if (compararPorAgencia != 0) {
			return compararPorAgencia;
		} else {
			return Integer.compare(this.numero, conta.getNumero());
		}
	}

	@Override
	public int hashCode() {
		return Objects.hash(this.agencia, this.numero);
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (!(o instanceof Conta c)) {
			return false;
		}
		return this.agencia == c.getAgencia() && this.numero == c.getNumero();
	}

	public int getAgencia() {
		return this.agencia;
	}

	public int getNumero() {
		return this.numero;
	}

	public double getSaldo() {
		return this.saldo;
	}

	public Cliente getTitular() {
		return this.titular;
	}

	public String getTipoConta() {
		return this.tipoConta;
	}

}
