package application;

import java.util.Locale;
import java.util.Scanner;
import entities.ContaBancaria;

public class Program {
    public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter account number: ");
    String numeroDaConta = sc.nextLine();
    System.out.print("Enter account holder: ");
    String nomeTitular = sc.nextLine();
    System.out.print("Is there na initial deposit (y/n): ");
    char resposta = sc.nextLine().charAt(0);
    if (resposta == 'y') {
        System.out.print("Enter initial deposit value: ");
        double saldoConta = sc.nextDouble();
        ContaBancaria conta = new ContaBancaria(numeroDaConta, nomeTitular, saldoConta);

        System.out.println("Account data:");
        System.out.println(conta);

        System.out.printf("Enter a deposit value: ");
        double valorDeposito = sc.nextDouble();
        conta.depositarDinheiro(valorDeposito);
        System.out.println("Updated account data:");
        System.out.println(conta);

        System.out.printf("Enter a withdraw value: ");
        double valorSaque = sc.nextDouble();
        conta.sacarDinheiro(valorSaque);
        System.out.println("Updated account data:");
        System.out.println(conta);
    }
    else {
        ContaBancaria conta = new ContaBancaria(numeroDaConta, nomeTitular);

        System.out.println("Account data:");
        System.out.println(conta);

        System.out.printf("Enter a deposit value: ");
        double valorDeposito = sc.nextDouble();
        conta.depositarDinheiro(valorDeposito);
        System.out.println("Updated account data:");
        System.out.println(conta);

        System.out.printf("Enter a withdraw value: ");
        double valorSaque = sc.nextDouble();
        conta.sacarDinheiro(valorSaque);
        System.out.println("Updated account data:");
        System.out.println(conta);

    }
    sc.close();
    }
}
