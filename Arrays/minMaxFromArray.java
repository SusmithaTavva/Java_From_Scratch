public class minMaxFromArray {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int min = arr[0];
        int max = arr[1];
        if(arr == null || arr.length == 0)
        return;
        for(int i =1;i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
                
            }
            if(arr[i]>max){
                max=arr[i];

            }
           
        }
        System.out.println(min);
        System.out.println(max);
    }
}
