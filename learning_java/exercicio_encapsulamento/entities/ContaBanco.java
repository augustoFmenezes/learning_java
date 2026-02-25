package entities;

public class ContaBanco {
	private int numero_conta;
	private String nome_titular;
	private double saldo;
	
	public ContaBanco(int numero_conta, String nome_titular) {
		this.numero_conta = numero_conta;
		this.nome_titular = nome_titular;
		this.saldo = 0;
	}

	public int getNumeroConta() {
		return numero_conta;
	}

	public String getNomeTitular() {
		return nome_titular;
	}

	public void setNomeTitular(String nome_titular) {
		this.nome_titular = nome_titular;
	}

	public void valorDeposito(double valor) {
		this.saldo += valor;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void valorSaque(double valor) {
		this.saldo -= valor + 5;
	}
	
	public String toString() {
		return String.format("Conta %d, Titular: %s, Saldo: R$ %.2f",
				numero_conta, nome_titular, saldo);	
	}
}
