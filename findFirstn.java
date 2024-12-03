import java.util.Scanner;

public class findFirstn {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(printfirst(n));
    }
    public static int printfirst( int n){
        while(n>10){
            n = n/10;
        }
        return n;
        }
    }
