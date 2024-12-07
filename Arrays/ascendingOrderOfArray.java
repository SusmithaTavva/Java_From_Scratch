public class ascendingOrderOfArray {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        int arr[] = {1,3,4,7};
        boolean isAscending=true;
        for(int i =0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                isAscending=false;
            }
        }
        if(isAscending==true){
        System.out.println("the given array is in ascending order");
    }
    else{
        System.out.println("the given array is not in ascending order");
    }
}
}
