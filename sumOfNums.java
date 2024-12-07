import java.util.*;
public class sumOfNums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int  i = 0; i<= n;i++){
            sum +=i;
            
        }
        System.out.println("the sum of the n natural numbers is " + sum);
    }
}

