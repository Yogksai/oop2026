import java.util.Scanner;

public class Student {
    private final String name;
    private final int id;
    private int yearOfStudy;

    public Student(String name, int id) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name must not be empty.");
        }
        if (id <= 0) {
            throw new IllegalArgumentException("Id must be positive.");
        }
        this.name = name;
        this.id = id;
        this.yearOfStudy = 1;
    }

    public String getName() { return name; }
    public int getId() { return id; }
    public int getYearOfStudy() { return yearOfStudy; }

    public void incrementYearOfStudy() { yearOfStudy++; }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        System.out.print("Enter student id: ");
        int id = scanner.nextInt();

        Student s = new Student(name, id);

        System.out.println("Student created:");
        System.out.println("Name: " + s.getName());
        System.out.println("Id: " + s.getId());
        System.out.println("Year of study: " + s.getYearOfStudy());

        System.out.println("Incrementing year of study...");
        s.incrementYearOfStudy();
        System.out.println("Year of study now: " + s.getYearOfStudy());

        scanner.close();
    }
}
