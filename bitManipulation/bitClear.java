package bitManipulation;
public class bitClear {
    public static void main(String[] args) {
        int n =7;
        int pos =2;
        int bitMask = 1<<pos;
        int notOp = ~(bitMask);
        int newNum = n & notOp;
        System.out.println(newNum);
    }    
}
