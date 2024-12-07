import java.util.*;
public class SumOfOddNums {
    public static void Odd(int n){
        int sum =0;
        for(int i =1;i<=n;i++){
            if(i%2!=0){
                sum += i;
            }
        }
            System.out.println("sum of all odd numbers from 1 to " + n + " is:" + sum);
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n value: ");
        int n =sc.nextInt();
        Odd(n);
    }
}
