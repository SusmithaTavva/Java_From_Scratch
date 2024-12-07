import java.util.*;
public class power {
    public static void Power(int n , int x){
        int value=1;
        for(int i =1;i<=n;i++){
            value *= x;

        }
        System.out.println("the value of x power n is " + value);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter value of power: ");
        int n =sc.nextInt();
        System.out.print("enter the base value: ");
        int x= sc.nextInt();
        Power(n,x);
    }
}
