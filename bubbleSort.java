public class bubbleSort {
    public static void bubblesort(int[] arr){
        for(int turns = 0;turns < arr.length-1;turns++){
            for(int i = 0;i<arr.length-1-turns;i++){
                if(arr[i]>arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }
    }
    public static void printArr(int arr[]){
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String [] args){
        int arr[] = {5,4,1,3,2};
        bubblesort(arr);
        printArr(arr);
    }
}
