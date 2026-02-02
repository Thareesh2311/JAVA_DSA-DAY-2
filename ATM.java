import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int balance = 100000;
        int choice;

        do{
            System.out.println("Welcome to the ATM");
            System.out.println("1. Check Balance");
            System.out.println("2. Withdraw Amount");
            System.out.println("3. Deposit Amount");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            
            choice = sc.nextInt();

            if (choice == 1) {
                System.out.println("Your balance is: " + balance);

            } else if (choice == 2) {
                System.out.println("Enter the amount to withdraw:");
                int withdraw = sc.nextInt();
                if (withdraw > balance) {
                    System.out.println("Invalid balance");
                } else {
                    balance -= withdraw;
                    System.out.println("Please collect the cash");
                    System.out.println("Your new balance is: " + balance);
                }
            } else if (choice == 3) {
                System.out.println("Enter the amount to deposit:");
                int deposit = sc.nextInt();
                balance += deposit;
                System.out.println("Amount deposited successfully");
                System.out.println("Your new balance is: " + balance);
            }
            else if (choice == 4) {
                System.out.println("Thank you for using the ATM. Goodbye!");
                break;
            }
            else {
                System.out.println("Invalid choice. Please try again.");
            }
        } while(choice != 4);
    }
}

