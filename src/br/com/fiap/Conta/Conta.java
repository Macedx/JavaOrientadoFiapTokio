package br.com.fiap.Conta;

public class Conta {

	//Atributos
	//Sempre modificador de acesso private, se precisar muda dpeois
	private long numeroConta;
	private double saldo;
	private String nomeCliente, cpfCliente;
	
	//Construtor
	//Ctrl + 3 --> Generate Constructor Using fields
	public Conta(long numeroConta, String nomeCliente, String cpfCliente) {
		super();
		this.numeroConta = numeroConta;
		this.nomeCliente = nomeCliente;
		this.cpfCliente = cpfCliente;
	}
	
	//Métodos Getters and Setters
	//Get lê
	//Set escreve
	public long getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(long numeroConta) {
		this.numeroConta = numeroConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getCpfCliente() {
		return cpfCliente;
	}

	public void setCpfCliente(String cpfCliente) {
		this.cpfCliente = cpfCliente;
	}
	
}