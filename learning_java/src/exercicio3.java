/* Faça um programa que receba três números 
e mostre na tela o maior deles. */

import java.util.Scanner;

public class exercicio3 {
	
	public static void main(String[] Args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira 3 números: ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		
		if (n1 >= n2 && n1 >= n3) {
			System.out.println("Maior número = " + n1);
		} else if (n2 >= n3) {
			System.out.println("Maior número = " + n2);
		} else {
			System.out.println("Maior número = " + n3);
		}
		
		sc.close();
	}
	
}
