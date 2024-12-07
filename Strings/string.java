import java.util.*;
public class string{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // next will print only the first word
        String a = sc.next();
        // using nextLine will print the entire statement which is entered
        String b = sc.nextLine();
        System.out.println("the statement is :" + b);
        System.out.println("the string entered is :" + a + "  the index is " + a.charAt(0));
        System.out.println(a.toUpperCase());
        System.out.println(a.toLowerCase());
    }
}