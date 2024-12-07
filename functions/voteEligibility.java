import java.util.*;
public class voteEligibility {
    public static void Eligible(int age){
        if(age>18){
            System.out.println("you are eligible to vote");
        }
        else if(age<18){
            System.out.println("you are not eligible to vote");


        }
        else{
            System.out.println("enter valid input");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter age: ");
        int age = sc.nextInt();
        Eligible(age);
    }
}
