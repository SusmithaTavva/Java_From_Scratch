import java.util.Scanner;

public class countOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int positiveCount = 0, negativeCount = 0, zeroCount = 0;
        char choice;

        do {
            System.out.println("Enter a number: ");
            int number = scanner.nextInt();

            switch (Integer.signum(number)) {
                case 1:
                    positiveCount++;
                    break;
                case -1:
                    negativeCount++;
                    break;
                case 0:
                    zeroCount++;
                    break;
            }

            System.out.println("Do you want to enter another number? (y/n): ");
            choice = scanner.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');

        System.out.println("Positive numbers: " + positiveCount);
        System.out.println("Negative numbers: " + negativeCount);
        System.out.println("Zeroes: " + zeroCount);
    }
}
 