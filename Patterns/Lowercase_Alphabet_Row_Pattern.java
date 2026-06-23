import java.util.Scanner;

public class Lowercasealphabetrowpattern {
 public static void main(String[] args) {
        {
            Scanner sc = new Scanner(System.in);
        System.out.print("enter a number of rows");
        int n = sc.nextInt();
        for( int i = 97; i<=n; i++)
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
