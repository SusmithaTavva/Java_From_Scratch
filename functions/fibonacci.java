import java.util.Scanner;

public class fibonacci {

    // Method to print the Fibonacci series up to n terms
    public static void Fibonacci(int n) {
        int first = 0;
        int second = 1;
        
        System.out.println("Fibonacci series up to " + n + " terms:");
        
        // Print the first two terms
        System.out.println(first);
        if (n > 1) {
            System.out.println(second);
        }
        
        for (int i = 3; i <= n; i++) {
            int next = first + second;
            System.out.println(next);
            first = second;
            second = next;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();
        Fibonacci(n);
        sc.close();
    }
}
