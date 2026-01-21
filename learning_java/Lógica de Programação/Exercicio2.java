/*Faça um programa que receba um número e diga 
se ele é par ou ímpar.
*/

import java.util.Scanner;

public class Exercicio2 {
	
	public static void main(String[] Args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira um número:");
		int numero = sc.nextInt();
		
		if (numero % 2 == 0) {
			System.out.println("Par");
		} else {
			System.out.println("Ímpar");
		}
		
		sc.close();
	}
}
