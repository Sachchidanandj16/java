
import java.util.Scanner;

class isPrime{
    boolean isPr(int n){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        if (n==1){
            return false;
        }
        for(int i =2;i<n;i++){
            if(i%n==0){
                return false;
            }
            return true;
        }
    }
}