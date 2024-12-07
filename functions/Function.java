import java.util.*;
public class Function {
    public static void PrintMyName(String name){
        System.out.println("your name is: " + name);
        return;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        PrintMyName(name);
        
    }
}

