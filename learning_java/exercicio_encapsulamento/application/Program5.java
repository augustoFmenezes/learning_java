package application;

import java.util.Locale;
import java.util.Scanner;

import entities.ContaBanco;

public class Program5 {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        ContaBanco conta_banco = null;
        
        System.out.println("Insira número da conta:");
        int numero_conta = sc.nextInt();
        sc.nextLine();

        System.out.println("Insira o nome do titular da conta:");
        String nome_titular = sc.nextLine();
        
        
        double deposito;
        char confirmacao_deposito_inicial;
        
    	System.out.println("Haverá um depósito inicial (s/n)?");
    	confirmacao_deposito_inicial = sc.next().toLowerCase().charAt(0);
 
    	while (confirmacao_deposito_inicial != 's' && confirmacao_deposito_inicial != 'n') {
    	    System.out.println("Opção inválida. Tente novamente:");
    	    confirmacao_deposito_inicial = sc.next().toLowerCase().charAt(0);
    	}

    	if (confirmacao_deposito_inicial == 's') {
    	    System.out.println("Insira o valor do depósito:");
    	    deposito = sc.nextDouble();
    	    conta_banco = new ContaBanco(numero_conta, nome_titular, deposito);
    	} else {
    	    conta_banco = new ContaBanco(numero_conta, nome_titular);
    	}

        System.out.println("\nDados da conta: " + conta_banco);
        
        System.out.println("\nInsira um valor de depósito:");
        deposito = sc.nextDouble();
        conta_banco.valorDeposito(deposito);
        System.out.println("\nDados atualizados da conta:\n" + conta_banco);
        
        System.out.println("\nInsira um valor de saque:");
        double saque = sc.nextDouble();
        conta_banco.valorSaque(saque);
        System.out.println("Dados atualizados da conta:\n" + conta_banco);
        
    	sc.close();
    }
}