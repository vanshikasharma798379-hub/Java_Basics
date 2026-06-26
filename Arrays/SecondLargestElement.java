import java.util.Scanner;

public class Secondlargestelement {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];    
        for( int i = 0; i<n; i++)
        {
             arr[i] = sc.nextInt();
        } 
        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;
        for( int i = 0; i<n; i++)
        {
            if(arr[i]>max)
            {
                max = arr[i];
            }
        }
        for( int i = 0; i<n; i++)
        {
            if( arr[i]>smax && arr[i]!=max)
            {
                smax=arr[i];
            }
        }
        if (smax == Integer.MIN_VALUE) {
            System.out.println(-1);
        }
        System.out.println(max);
        System.out.println(smax);
        sc.close();
    }
}
