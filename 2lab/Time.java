import java.util.Scanner;

public class Time {
    private int hour;   
    private int minute; 
    private int second; 

    public Time(int hour, int minute, int second) {
        setTime(hour, minute, second);
    }

    public void setTime(int hour, int minute, int second) {
        if (!isValid(hour, minute, second)) {
            throw new IllegalArgumentException("Invalid time input.");
        }
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    private boolean isValid(int h, int m, int s) {
        return (h >= 0 && h <= 23) && (m >= 0 && m <= 59) && (s >= 0 && s <= 59);
    }

    // 24-hour format
    public String toUniversal() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    // 12-hour format 
    public String toStandard() {
        int displayHour = hour % 12;
        if (displayHour == 0) displayHour = 12;

        String ampm = (hour < 12) ? "AM" : "PM";
        return String.format("%02d:%02d:%02d %s", displayHour, minute, second, ampm);
    }

    public void add(Time other) {
        if (other == null) {
            throw new IllegalArgumentException("Other time must not be null.");
        }

        int totalSeconds = this.second + other.second;
        int carryMinutes = totalSeconds / 60;
        this.second = totalSeconds % 60;

        int totalMinutes = this.minute + other.minute + carryMinutes;
        int carryHours = totalMinutes / 60;
        this.minute = totalMinutes % 60;

        int totalHours = this.hour + other.hour + carryHours;
        this.hour = totalHours % 24;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter time t (hour minute second):");
        int h1 = scanner.nextInt();
        int m1 = scanner.nextInt();
        int s1 = scanner.nextInt();

        Time t = new Time(h1, m1, s1);

        System.out.println("Universal: " + t.toUniversal());
        System.out.println("Standard: " + t.toStandard());

        System.out.println("Enter time t2 (hour minute second) to add:");
        int h2 = scanner.nextInt();
        int m2 = scanner.nextInt();
        int s2 = scanner.nextInt();

        Time t2 = new Time(h2, m2, s2);
        t.add(t2);

        System.out.println("After add:");
        System.out.println("Universal: " + t.toUniversal());
        System.out.println("Standard: " + t.toStandard());

        scanner.close();
    }
}