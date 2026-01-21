
/*Faça um programa que receba a idade de uma pessoa e mostre na
tela “pode tirar habilitação” se a pessoa está apta ou “não
pode tirar habilitação” caso contrário.*/

import java.util.Scanner;
public class Exercicio1 {
	
	public static void main(String[] Args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira sua idade:");
		int idade = sc.nextInt();
		
		if (idade >= 18) {
			System.out.println("Pode tirar habilitação.");
		} else {
			System.out.println("Não pode tirar habilitação");
		}
		
		sc.close();
	}
}
