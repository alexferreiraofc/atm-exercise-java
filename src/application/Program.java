package application;

import entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Account account;

        System.out.println("Enter account number: ");
        int conta = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter account holder name: ");
        String nome = sc.nextLine();
        System.out.println("You want make a first deposit? [y/n]");
        char response = sc.next().charAt(0);
        if (response == 'y') {
            System.out.println("Enter the amount to be deposited: $ ");
            double primeiroDeposito = sc.nextDouble();
            account = new Account(conta, nome, primeiroDeposito);
        } else {
            account = new Account(conta, nome);
        }
        System.out.println();
        System.out.println("Enter a deposit value: ");
        double depositoValor = sc.nextDouble();
        account.depositCash(depositoValor);
        System.out.println("Updated account data: ");
        System.out.println(account);

        System.out.println();
        System.out.println("Enter a withdraw value: ");
        double saqueValor = sc.nextDouble();
        account.withdrawCash(saqueValor);
        System.out.println("Updated account data: ");
        System.out.println(account);


        sc.close();
    }
}
