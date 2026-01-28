package JAVA_PRG.OOP;

import java.util.Scanner;
import java.lang.System;

class bank {
    String name;
    String acctype;
    int accno;
    double bal;

    void initial(String n, String at, int m, double d) {
        name = n;
        acctype = at;
        accno = m;
        bal = d;
        System.out.println("Welcome in our bank");
    }

    void deposit(double m) {
        bal = bal + m;
    }

    void withdrawl(double n) {
        if ((bal - n) <= 500) {
            System.out.println("Sorry you have insufficient balance");
        } else {
            bal = bal - n;
        }
    }

    void display() {
        System.out.println("Name = " + name);
        System.out.println("Account no. = " + accno);
        System.out.println("Balance = " + bal);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        bank b1 = new bank();
        char ch1;

        do {
            int ch;

            System.out.println("1. Create an account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdrawl");
            System.out.println("4. Display");
            System.out.println("5. Exit");
            System.out.println("Enter your choice between 1 to 5 : ");
            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    b1.initial("Amit", "S/A", 1234, 600.0);
                    break;

                case 2:
                    double m;
                    System.out.println("Enter the amount to be deposit ");
                    m = sc.nextDouble();
                    b1.deposit(m);
                    break;

                case 3:
                    double n;
                    System.out.println("Enter the amount to be withdrawl ");
                    n = sc.nextDouble();
                    b1.withdrawl(n);
                    break;

                case 4:
                    b1.display();
                    break;

                case 5:
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

            System.out.println("Do you want to continue...(y/n)?");
            ch1 = sc.next().charAt(0);

        } while (ch1 == 'y' || ch1 == 'Y');
    }
}
