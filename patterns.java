public class patterns {
    public static void main(String[] args) {
       //Square Pattern
       int i =1;
        while(i<=5){
            int j=1;
            while(j<=i){
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
    }  
}
