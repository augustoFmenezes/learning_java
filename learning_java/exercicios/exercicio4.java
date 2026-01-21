/* Faça um programa que receba três números 
e na tela o número de valor médio.
*/

import java.util.Scanner;

public class exercicio4 {
	
	public static void main(String[] Args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira 3 números: ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		
		if ((n1 >= n2 && n1 <= n3) || (n1 >= n3 && n1 <= n2)) {
		    System.out.println("Número médio = " + n1);
		} else if ((n2 >= n1 && n2 <= n3) || (n2 >= n3 && n2 <= n1)) {
		    System.out.println("Número médio = " + n2);
		} else {
		    System.out.println("Número médio = " + n3);
		}


		
		sc.close();
	}
	
}
