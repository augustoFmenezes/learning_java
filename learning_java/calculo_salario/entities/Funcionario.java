package entities;

public class Funcionario {
	public String nome;
	public double salario_bruto;
	public double imposto;
	
	public Funcionario(String nome, double salario_bruto, double imposto) {
		this.nome = nome;
		this.salario_bruto = salario_bruto;
		this.imposto = imposto;
	}
	
	public double salarioLiquido() {
		return salario_bruto - imposto;
	}
	
	public void aumentoDeSalario(double porcentagem_aumento) {
		salario_bruto += salario_bruto * (porcentagem_aumento / 100);
	}
	
	public String toString() {
		return nome
			+ ", "
			+ String.format("R$%.2f", salarioLiquido());
	}
}
