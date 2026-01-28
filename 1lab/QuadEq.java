import java.util.Scanner;

public class QuadEq {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter coefficient a: ");
        int a = scanner.nextDouble();

        System.out.print("Enter coefficient b: ");
        int b = scanner.nextDouble();

        System.out.print("Enter coefficient c: ");
        int c = scanner.nextDouble();

        double discr = b * b - 4 * a * c;

        if (discr > 0) {
            double root1 = (-b + Math.sqrt(discr)) / (2 * a);
            double root2 = (-b - Math.sqrt(discr)) / (2 * a);
            System.out.printf("Two roots:");
            System.out.printf("x1 = %.2f%n", root1);
            System.out.printf("x2 = %.2f%n", root2);
        } else if (discr == 0) {
            double root = -b / (2 * a);
            System.out.printf("One real root: %.2f%n", root);
        } else {
            System.out.println("No real roots.");
        }

        scanner.close();
    }
}

