package application;

import java.util.Scanner;
import entities.Estudante1;

public class Program7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos quartos serão alugados? ");
        int alugados = sc.nextInt();

        Estudante1[] quartos = new Estudante1[10];

        for (int i = 0; i < alugados; i++) {
            System.out.println("\nAluguel #" + (i + 1) + ":");

            sc.nextLine();

            System.out.print("Nome: ");
            String nome = sc.nextLine();

            System.out.print("Email: ");
            String email = sc.nextLine();

            System.out.print("Quarto (0 a 9): ");
            int quarto = sc.nextInt();

            while (quarto < 0 || quarto > 9 || quartos[quarto] != null) {
                System.out.print("Quarto inválido ou já ocupado! Digite novamente: ");
                quarto = sc.nextInt();
            }

            quartos[quarto] = new Estudante1(nome, email, quarto);
        }

        System.out.println("\nQuartos ocupados:");
        for (int i = 0; i < 10; i++) {
            if (quartos[i] != null) {
                System.out.println(i + ": " + quartos[i]);
            }
        }

        sc.close();
    }
}