import java.util.Scanner;

public class Alphabetrowpattern {
    public static void main(String[] args) {
        {
            Scanner sc = new Scanner(System.in);
        System.out.print("enter a number of rows");
        int n = sc.nextInt();
        for( int i = 65; i<=68; i++)
        {
            for( int j = 1; j<=n; j++)
            {
                System.out.print((char)i+" ");
            }
            System.out.println( );
        }
        sc.close();
    }
    
}    
}
