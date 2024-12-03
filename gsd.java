import java.util.Scanner;
class gcd{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a ,b ;
        int ans =1;
        System.out.println("Enter the first number");
        a = sc.nextInt();
        System.out.println("Enter the secand number");
        b = sc.nextInt();
        int n  = Math.min(a, b);
        for(int i =1 ;i<=n;i++){
            if(a%i==0 && b%i==0){
                ans = i;
            }
        }
        System.out.println("The GCD of given numbers is "+ans);
    }
}