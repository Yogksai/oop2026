
import java.util.Scanner;
public class Interent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter initial balance: ");
        int initialBalance = scanner.nextInt();

        System.out.print("Enter interest rate (in %): ");
        int interestRate = scanner.nextInt();


        double interest = initialBalance * (interestRate / 100.0);
        double newBalance = initialBalance + interest;

        System.out.printf("Initial Balance: %d%n", initialBalance);
        System.out.printf("Interest Amount: %.2f%n", interest);
        System.out.printf("New Balance: %.2f%n", newBalance);

        scanner.close();
    }
}

