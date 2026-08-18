 import java.util.Scanner;

class Bank {

    int accountNumber;
    String accountHolderName;
    double amount;

    Scanner sc = new Scanner(System.in);

    void viewMenu() {
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. CheckAmount");
        System.out.println("4. Exit");
    }

    void deposit() {

        System.out.print("Enter Account Number: ");
        accountNumber = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter Account Holder Name: ");
        accountHolderName = sc.nextLine();

        System.out.print("Enter Deposit Amount: ");
        double depositAmount = sc.nextDouble();

        amount = amount + depositAmount;

        System.out.println("Amount Deposited");
        System.out.println("Amount: " + amount);
    }

    void withdraw() {

        System.out.print("Enter Withdraw Amount: ");
        double withdrawAmount = sc.nextDouble();

        if (withdrawAmount <= amount) {

            amount = amount - withdrawAmount;

            System.out.println("Amount Withdrawn");
            System.out.println("Amount: " + amount);

        } else {
            System.out.println("Insufficient Balance");
        }
    }

    void checkAmount() {

        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Amount: " + amount);
    }
}

public class Main {

    public static void main(String[] args) {

        Bank bank = new Bank();

        int choice;

        do {

            bank.viewMenu();

            System.out.print("Enter Choice: ");
            choice = bank.sc.nextInt();

            switch (choice) {

                case 1:
                    bank.deposit();
                    break;

                case 2:
                    bank.withdraw();
                    break;

                case 3:
                    bank.checkAmount();
                    break;

                case 4:
                    System.out.println("Exit");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        } while (choice != 4);
    }
} 
    

