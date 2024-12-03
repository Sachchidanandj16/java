import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. to find out here...");
        n = sc.nextInt();
        if (n%2==0) {
            System.err.println("Even");
        }
        else{
            System.err.println("Odd");
        }
    }
}
