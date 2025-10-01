import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String accountHolder = sc.nextLine();
        int accountNumber = sc.nextInt();
        double initialBalance = sc.nextDouble();
        double depositAmount = sc.nextDouble();
        double withdrawAmount = sc.nextDouble();
        if (accountNumber <= 0 || initialBalance < 0 || depositAmount < 0 || withdrawAmount < 0) {
            System.out.println("Invalid input values");
            return;
        }
        double currentBalance = initialBalance + depositAmount;
        if (withdrawAmount > currentBalance) {
            System.out.println("Insufficient balance");
        } else {
            currentBalance -= withdrawAmount;
            System.out.println(currentBalance);
        }
    }
}
