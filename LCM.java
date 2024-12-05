//Find LCM of given 2 Number given by User
import java.util.Scanner;
public class LCM{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st Number");
        int a = sc.nextInt();
        System.out.println("Enter 2nd Number");
        int b = sc.nextInt();
        int n = Math.max(a, b);
        int x = a*b;
        int ans = n;
        for(int i =1;i<=n;i++){
            if(a%i==0 && b%i==0){
                ans = i;
            }
        }
        System.out.println("The LCM of given number is "+ans);
    }
}
