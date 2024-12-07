import java.util.*;
public class factorial {
   public static void Fact( int a){
    if(a<0){
        System.out.println("invalid number");
        return;
    }
    if(a==1){
        System.out.println("factorial is 1");
        return;
    }
        int factorial=1;
        for(int i = a ;i>=1;i--){
            factorial*=i;
        }
            System.out.println("the factorial of the given number is:" + factorial);
            return;
        }
    
        public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        
            Fact(a);
        } 
    
}
