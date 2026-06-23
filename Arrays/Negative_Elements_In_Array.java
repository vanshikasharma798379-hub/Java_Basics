import java.util.Scanner;

public class Negativeelement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number");
        int[] arr = new int[50];
        int n = sc.nextInt();
        for( int i = 0; i<n; i++)
        {
             arr[i] = sc.nextInt();
        }
        for( int i = 0; i<n; i++)
        {
            if(arr[i]<0)
            {
                System.out.print(arr[i]+" ");
            }
        }
        sc.close();


    }
    
}
