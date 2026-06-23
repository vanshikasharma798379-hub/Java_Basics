import java.util.Scanner;

public class Sumofelementofarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number");
        int[] arr = new int[50];
        int n = sc.nextInt();
        int sum = 0;
        for( int i = 0; i<n; i++)
        {
             arr[i] = sc.nextInt();
        }
        for( int i = 0; i<n; i++)
        {
            sum = sum + arr[i];
        }
        System.out.print(sum);
        sc.close();


    }
    
}

    
    
