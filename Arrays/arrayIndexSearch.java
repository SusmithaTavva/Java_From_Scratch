import java.util.*;
public class arrayIndexSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("enter the value that need to be searched:");
        int x = sc.nextInt();
        for(int  i= 0;i<n;i++){
            if(x == arr[i]){
                System.out.println("x is present in the index of: "+i);
            }
            
        }
       
            System.out.println("please enter the existed value in the array");
        
    }
}
