
import java.util.Scanner;
public class sachchi {
    public static void main(String[] args) {
        int x=0;
        int y=0;
        System.out.println("Enter the move");
        Scanner sc = new Scanner(System.in);
        char move = sc.next().charAt(0);
        switch(move){
            case'L':
                x--;
                break;
            case'R':
                x++;
                break;
            case'U':
                y--;
                break;
            case'D':
                y++;
                break;
            default:
                System.out.println("Enter is INvalid");
        }

    }
}