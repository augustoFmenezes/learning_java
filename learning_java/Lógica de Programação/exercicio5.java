/* Faça um programa que receba três números 
e na tela o número de valor médio.
*/

import java.util.Scanner;

public class exercicio5 {
	
	public static void main(String[] Args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira 1 número: ");
		
		int n1 = sc.nextInt();

		if (n1 < 0) {
			System.out.println("Número absoluto: " + Math.abs(n1));
		} else {
			System.out.println(n1 + " * 100 = " + n1 * 100);
		}

		
		sc.close();
	}
	
}
