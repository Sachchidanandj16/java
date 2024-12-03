import java.util.Scanner;
public class factori {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
       System.out.println("Enter Num to find Factorial ");
        int n = sc.nextInt();
        long fact = 1;
        /* for(int i =1;i<=n;i++){
            System.out.println("Now i Value is "+i);
            fact *= i;
            System.out.println("Now the Fact value is  "+fact);
        }
        // System.out.println("The final ans is "+fact); */
        int i=1;
        while(i<n+1){
            fact *= i;
            i++;
        }
        System.out.println("Factorial is "+fact);
    }
}