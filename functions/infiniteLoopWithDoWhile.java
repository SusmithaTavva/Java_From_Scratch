public class infiniteLoopWithDoWhile {
    public static void InfiniteLoop(){
        int i =1;
        do { 
            System.out.println(i);
            i++;
        } while (i>=1);
        
        System.out.println(i);
        
    }
    public static void main(String[] args) {
        InfiniteLoop();
    }
}
