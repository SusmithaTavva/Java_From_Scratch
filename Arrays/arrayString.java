import java.util.*;
public class arrayString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the string");
        int n = sc.nextInt();
        String ar[] = new String[n];
        for(int i=0;i<n;i++){
             ar[i] = sc.next();
            
        }
        for(int i =0;i<n;i++){
        System.out.println("the entered strings are " +ar[i]);
    }
}
}
