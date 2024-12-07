import java.util.*;
public class averageOfNums {
    public static void Avg(float a,float b,float c){
        float answer=(a+b+c)/3; 
        System.out.println("the average of three numbers is :"+ answer);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 1st number");
        float a=sc.nextFloat();
        System.out.println("enter 2nd number");
        float b=sc.nextFloat();
        System.out.println("enter 3rd number");
        float c =sc.nextFloat();
        Avg(a,b,c);
        sc.close();
    }
}

