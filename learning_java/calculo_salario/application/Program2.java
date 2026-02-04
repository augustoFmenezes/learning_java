package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Funcionario;

public class Program2 {

	public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Funcionario funcionario = new Funcionario();
        
        System.out.println("Insira o nome do funcionário: ");
        funcionario.nome = sc.nextLine();
        
        System.out.println("Insira o salário bruto do funcionário: ");
        funcionario.salario_bruto = sc.nextDouble();
        
        System.out.println("Insira o imposto do salário: ");
        funcionario.imposto = sc.nextDouble();
        
        System.out.println("Funcionario: " + funcionario);
        
        System.out.println("Qual porcentagem de aumento do salário: ");
        double porcenagem = sc.nextDouble();
        funcionario.aumentoDeSalario(porcenagem);
        
        System.out.println("Dados atualizados: " + funcionario);
        
        sc.close();
	}
}
