import java.util.*;
public class arrayDeclaration2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of an array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i =0;i<n;i++){
            System.out.println("enter the elements of array");
            arr[i]=sc.nextInt();
        }
        System.out.println("the elements that are present in the array are :");
        for(int i=0;i<n;i++){
            
            System.out.println(arr[i]);
        }
        

    }
}
