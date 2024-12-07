import java.util.*;
public class switchcase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        switch( a % 2 ){
            case 0:
                System.out.println(a + " is even");
                break;
            case 1:
                System.out.println(a + " is odd");
                break;
            default:
                System.out.println(a  + " is neither even nor odd");

        }
            sc.close();

    }
    
}
