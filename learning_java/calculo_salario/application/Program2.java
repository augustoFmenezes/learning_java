package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Funcionario1;

public class Program2 {

	public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Insira o nome do funcionário: ");
        String nome = sc.nextLine();
        
        System.out.println("Insira o salário bruto do funcionário: ");
        double salario_bruto = sc.nextDouble();
        
        System.out.println("Insira o imposto do salário: ");
        double imposto = sc.nextDouble();
        
        Funcionario1 funcionario = new Funcionario1(nome, salario_bruto, imposto);
        
        System.out.println("Funcionario: " + funcionario);
        
        System.out.println("Qual porcentagem de aumento do salário: ");
        double porcenagem = sc.nextDouble();
        funcionario.aumentoDeSalario(porcenagem);
        
        System.out.println("Dados atualizados: " + funcionario);
        
        sc.close();
	}
}
