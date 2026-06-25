package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Contrato;
import entities.Departamento;
import entities.Trabalhador;
import entities.enums.NivelOperacional;

public class ComposicaoProgram {

	public static void main (String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Insira o nome do departamento: ");
		String nomeDepartamento = sc.nextLine();
		
		System.out.println("Insira os dados do trabalhador: ");
		System.out.print("Nome: ");
		String nomeTrabalhador = sc.nextLine();
		System.out.print("Nivel Operacional: ");
		String nivelOperacional = sc.nextLine();
		System.out.print("Salário base: ");
		double salario = sc.nextDouble();
		
		Trabalhador trabalhador = new Trabalhador(nomeTrabalhador, NivelOperacional.valueOf(nivelOperacional) , salario, new Departamento(nomeDepartamento));

		System.out.println("Quantos contratos associados a esse trabalhador? ");
		int num_contratos = sc.nextInt();
		
		for (int i= 1; i <= num_contratos; i++) {
			System.out.println("Insira os dados do " + i +"º contrato");
			System.out.print("Data (DD/MM/AAA): ");
			Date dataContrato = sdf.parse(sc.next());
			
			System.out.print("Valor por Hora: ");
			double valorPorHora = sc.nextDouble();
			
			System.out.print("Duração do contrato (horas): ");
			int horas = sc.nextInt();
			
			Contrato contrato = new Contrato(dataContrato, valorPorHora, horas);
			trabalhador.adicionarContrato(contrato);
		}
		
		System.out.println();
		System.out.print("Insira o mês e o ano para calcular a renda do trabalhador (MM/AAAA): ");
		String mesEAno = sc.next();
		int mes = Integer.parseInt(mesEAno.substring(0, 2));
		int ano = Integer.parseInt(mesEAno.substring(3));
		
		System.out.println("Nome do trabalhador: " + trabalhador.getNome());
		System.out.println("Nome do departamento: " + trabalhador.getDepartamento().getNomeDepartamento());
		System.out.println("Renda no período " + mesEAno + ": " + String.format("%.2f", trabalhador.renda(ano, mes)));

		sc.close();
	}
}
