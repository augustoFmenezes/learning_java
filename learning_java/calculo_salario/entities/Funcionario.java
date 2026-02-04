package entities;

public class Funcionario {
	public String nome;
	public Double salario_bruto;
	public Double imposto;
	
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
