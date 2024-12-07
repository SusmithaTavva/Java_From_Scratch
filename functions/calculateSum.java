import java.util.*;
public class calculateSum {
    public static void Sum(int a ,int b){
        int c=a + b;
        System.out.println("the sum of the two numbers is :" +c);
        return;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        Sum(a,b);
    }
}
