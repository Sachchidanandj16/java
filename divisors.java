
import java.util.Scanner;

public class divisors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find it's divisors...");
        int a = sc.nextInt();
        int i =1;
        while(i<=a){
            if(a%i==0){
                System.out.print(i+" ");
            }
            i++;
        }
    }
}
