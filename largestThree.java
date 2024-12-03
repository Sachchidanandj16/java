
import java.util.Scanner;

public class largestThree {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter First Number");
        a = sc.nextInt();
        System.err.println("Enter Second Number");
        b = sc.nextInt();
        System.err.println("Enter third number");
        c = sc.nextInt();
        if(a>=b && a>=c){
            System.out.println("a = "+a);
        }
        else if(b>=a && b>=c){
            System.err.println("b = "+b);
        }
        else{
            System.err.println("c = "+c);
        }
    }
}
