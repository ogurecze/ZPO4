import java.util.*;

public class TheProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers (0 to choose counting option):");
        int input;
        while ((input = scanner.nextInt()) != 0) {
        }

        System.out.println("Choose counting type:");
        System.out.println("1: Count numbers > 0");
        System.out.println("2: Count numbers = 3");
        System.out.println("3: Count numbers divisible by 2");

        int choice = scanner.nextInt();
        NumberSubject subject = new NumberSubject();

        switch (choice) {
            case 1:
                subject.attach(new GreaterThanZeroObserver());
                break;
            case 2:
                subject.attach(new EqualThreeObserver());
                break;
            case 3:
                subject.attach(new DivisibleByTwoObserver());
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + choice);
        }

        System.out.println("Enter numbers to count (Type '999' to exit):");
        while ((input = scanner.nextInt()) != 999) {
            subject.notifyObservers(input);
        }
        
        subject.displayFinalCount();
        scanner.close();
    }
}
