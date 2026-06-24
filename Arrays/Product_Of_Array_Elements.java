import java.util.Scanner;

public class Productofarrayelements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number");
        int[] arr = new int[50];
        int n = sc.nextInt();
        int product = 1;
        for( int i = 0; i<n; i++)
        {
             arr[i] = sc.nextInt();
        }
        for( int i = 0; i < n; i++)
        {
           product = product*arr[i];
        }
        System.out.print(product);
        sc.close();


    }
    
}

    
    

    
    

