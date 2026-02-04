import java.util.Scanner;

public class StarTriangle {
    private final int width;

    public StarTriangle(int width) {
        if (width <= 0) {
            throw new IllegalArgumentException("Width must be >= 1.");
        }
        this.width = width;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (int row = 1; row <= width; row++) {
            for (int i = 0; i < row; i++) {
                sb.append("[*]");
            }
            if (row < width) sb.append('\n');
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter triangle width: ");
        int w = scanner.nextInt();

        StarTriangle t = new StarTriangle(w);

        System.out.println("Triangle:");
        System.out.println(t.toString());

        scanner.close();
    }
}


