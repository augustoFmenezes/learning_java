package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Estudante;


public class Program3 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Estudante estudante = new Estudante();
		
		
		System.out.println("Insira o nome do estudante: ");
		estudante.nome = sc.nextLine();
		
		System.out.println("Isnira a nota 1 do estudante: ");
		estudante.nota1 = sc.nextDouble();
		
		System.out.println("Isnira a nota 2 do estudante: ");
		estudante.nota2 = sc.nextDouble();
		
		System.out.println("Isnira a nota 3 do estudante: ");
		estudante.nota3 = sc.nextDouble();
		
		System.out.println(estudante);
		
		sc.close();
	}
}
