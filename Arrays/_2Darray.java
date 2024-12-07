import java.util.*;
public class _2Darray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter rows");
        int row = sc.nextInt();
        System.out.println("enter columns");
        int cols = sc.nextInt();
        System.out.println("enter the number to be searched");
        int x = sc.nextInt();
        int arr[][] = new int[row][cols];
         for(int i =0 ;i<row;i++){
            for(int j = 0;j<cols;j++){
                arr[i][j]= sc.nextInt();
            }
         }
         for(int i =0;i<row;i++){
            for(int j =0;j<cols;j++){
                if(x == arr[i][j]){
                    System.out.println("the number which you've asked is in the index of: " + i + "," + j);
                }
            }
         }

    }
}
