package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario1;

public class Program8 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos funcionários serão registrados?");
		int num_funcionarios = sc.nextInt();
		
		List<Funcionario1> lista_funcionarios = new ArrayList<>();
		
		for(int i = 0; i < num_funcionarios; i++) {
			System.out.println();
			
			System.out.println("Funcionario #" + (i+1) + ":");
			
			System.out.println("Id: ");
			Integer id = sc.nextInt();
			while (existeId(lista_funcionarios, id)) {
				System.out.println("Id já existe. Tente novamente.");
				id = sc.nextInt();
			}
			
			System.out.println("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			
			System.out.println("Salário: ");
			Double salario = sc.nextDouble();
			
			Funcionario1 funcionario = new Funcionario1(id, nome, salario);
			
			lista_funcionarios.add(funcionario);
			
		}
		
		System.out.println("Deseja aumentar o salario de algum funcionario? (s/n)");
		char confirmacao = sc.next().toLowerCase().charAt(0);

		while(confirmacao != 's' && confirmacao != 'n') {
		    System.out.println("Entrada inválida. Tente novamente: ");
		    confirmacao = sc.next().toLowerCase().charAt(0);
		}

		while(confirmacao == 's') {
		    Funcionario1 funcionario;

		    do {
		        System.out.println("Insira o funcionario que terá seu salário aumentado: ");
		        int idsalario = sc.nextInt();

		        funcionario = lista_funcionarios.stream().filter(x -> x.getId() == idsalario).findFirst().orElse(null);

		        if (funcionario == null) {
		            System.out.println("Id não existe!");
		        }

		    } while (funcionario == null);

		    System.out.println("Insira a porcentagem de aumento: ");
		    Double porcentagem = sc.nextDouble();
		    funcionario.aumentoSalario(porcentagem);

		    System.out.println();
		    System.out.println("Dados atualizados: ");
		    System.out.println(funcionario);

		    do {
		        System.out.println("\nDeseja aumentar o salario de outro funcionario? (s/n)");
		        confirmacao = sc.next().toLowerCase().charAt(0);
		    } while(confirmacao != 's' && confirmacao != 'n');
		}
			System.out.println();
			System.out.println("Lista de funcionários: ");
			for (Funcionario1 f : lista_funcionarios) {
				System.out.println(f);
			}
		
		System.out.println();
		
	
		
		sc.close();
	}
		
	public static boolean existeId(List<Funcionario1> lista_funcionarios, int id) {
		Funcionario1 funcionario = lista_funcionarios.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return funcionario != null;
	}
}
