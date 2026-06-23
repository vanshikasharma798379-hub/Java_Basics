import java.util.Scanner;

public class Apattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number of rows");
        int n = sc.nextInt();
        // System.out.print("enter a number of coloumn");
        // int m = sc.nextInt();
        for( int i = 1; i<=n; i++ )
        { 
             for( int j = 1; j<=n; j++ )
            {
                System.out.print(j+" ");
            }
            System.out.println( );

        }
        sc.close();
    }
    
}
