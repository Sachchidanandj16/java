import java.util.Scanner;
class countDigit{
    public static void main(String args[]){
        int count=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to count");
        int a = sc.nextInt();
        while(a>0){
            a = a/10;
            count = count+1;
        }
        System.out.println(count);
    }
}