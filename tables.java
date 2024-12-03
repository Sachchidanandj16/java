import java.util.Scanner;
public class tables {
    public static void main(String[] args) {
        int N,j;
        int i=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find the table");
        N = sc.nextInt();
        System.out.println("the table is:");
        while(i<11){
            j = i*N;
            System.out.println(N+"*"+i+"="+j);
            i = i+1;
        }
    }
}
