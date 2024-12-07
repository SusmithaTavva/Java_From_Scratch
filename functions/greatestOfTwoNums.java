import java.util.*;
public class greatestOfTwoNums {
    public static void Greater(int a, int b){
        if(a>b){
            System.out.println("a is greater than b");
        }
        else{
            System.out.println("a is smaller than b");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter value of a");
        int a =sc.nextInt();
        System.out.println("enter value of b");
        int b = sc.nextInt();
        Greater(a,b);
    }
}
