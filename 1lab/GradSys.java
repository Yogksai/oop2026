import java.util.Scanner;

public class GradSys{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your score(between 0 and 100): ");
        int score = scanner.nextInt();

        String grade;

        if (score >= 98 && score <= 100){
            grade = "A";
        }else if(score >= 96){
            grade = "B";
        } else if(score >= 94){
            grade = "C";
        } else if(score >= 90){
            grade = "D";
        } else if(score >= 88){
            grade = "E";
        } else if(score <= 87){
            grade = "F";
        } else {
            grade = "Invalid score";
        }

        System.out.println("Your grade is: " + grade);
        scanner.close();
    }
}