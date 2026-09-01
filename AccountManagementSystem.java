import java.util.Scanner;

class AccountManagementSystem {

    String username;
    long acNo;
    String ifsc;
    int dep;
    int withdrawal;
    short pin;
    double amount = 0.0;
    String address;

    Scanner sc = new Scanner(System.in);

    AccountManagementSystem() {
        System.out.println("=== CREATE ACCOUNT ===");
        System.out.print("Enter your Name: ");
        username = sc.nextLine();

        System.out.print("Enter your Account Number: ");
        acNo = sc.nextLong();
        sc.nextLine(); 

        System.out.print("Enter your IFSC code: ");
        ifsc = sc.nextLine();

        System.out.print("Enter your Opening Amount: ");
        amount = sc.nextDouble();

        System.out.print("Enter your PIN: ");
        pin = sc.nextShort();
        sc.nextLine();

        System.out.print("Enter your Address: ");
        address = sc.nextLine();

        System.out.println("Account created successfully!\n");
    }

    void viewMenu() {
        System.out.println("\n--- BANK MENU ---");
        System.out.println("1. Deposit Money");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Change PIN");
        System.out.println("4. Check Balance / Details");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
    }

    public void changePIN() {
        System.out.print("Enter old PIN: ");
        short a = sc.nextShort();

        if (a == pin) {
            System.out.print("Enter new PIN: ");
            pin = sc.nextShort();
            System.out.println("PIN updated successfully!");
        } else {
            System.out.println("Incorrect PIN!");
        }
    }

    public void deposit() {
        System.out.print("Enter amount to deposit: ");
        dep = sc.nextInt();

        if (dep > 0) {
            amount = amount + dep;
            System.out.println("Deposit successful! Current Balance: " + amount);
        } else {
            System.out.println("Invalid amount! Transaction declined.");
        }
    }

    public void withdraw() {
        System.out.print("Enter your PIN: ");
        short enteredPin = sc.nextShort();

        if (enteredPin != pin) {
            System.out.println("Incorrect PIN! Transaction declined.");
            return;
        }

        System.out.print("Enter amount to withdraw: ");
        withdrawal = sc.nextInt();

        if (withdrawal <= 0) {
            System.out.println("Invalid withdrawal amount!");
        } else if (withdrawal <= amount) {
            amount = amount - withdrawal;
            System.out.println("Withdrawal successful! Remaining Balance: " + amount);
        } else {
            System.out.println("Insufficient funds! Current Balance: " + amount);
        }
    }

    public void checkDetails() {
        System.out.println("\n--- Account Details ---");
        System.out.println("Account Holder: " + username);
        System.out.println("Account Number: " + acNo);
        System.out.println("IFSC Code:      " + ifsc);
        System.out.println("Address:        " + address);
        System.out.println("Total Balance:  " + amount);
    }

    public static void main(String[] args) {
        AccountManagementSystem obj = new AccountManagementSystem();
        int choice;

        do {
            obj.viewMenu();
            choice = obj.sc.nextInt();

            switch (choice) {
                case 1:
                    obj.deposit();
                    break;
                case 2:
                    obj.withdraw();
                    break;
                case 3:
                    obj.changePIN();
                    break;
                case 4:
                    obj.checkDetails();
                    break;
                case 5:
                    System.out.println("Exit.");
                    break;
                default:
                    System.out.println("Invalid choice! Please select between 1 and 5.");
            }
        } while (choice != 5);
    }
}