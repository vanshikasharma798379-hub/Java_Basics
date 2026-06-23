import java.util.Scanner;

public class Invertedalphabettriangle{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number of rows");
        int n = sc.nextInt();
        for ( int i = n; i>=1; i--)
        {
            for(int j = 1; j<=i; j++)
            {
                System.err.print((char)(j+64)+" ");
            }
            System.out.println( );
        }
        sc.close();
    }
    
}
