import java.util.Scanner;

public class Searchelement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a size of array");
        int n = sc.nextInt();
        System.out.print("enter a element to be searched");
        int x = sc.nextInt();
        int[] arr = new int[n];    
        for( int i = 0; i<n; i++)
        {
             arr[i] = sc.nextInt();
        } 
        int t = 0;
        for( int i = 0; i<n; i++)
        {
            if(arr[i]==x)
            {
                t=1;
                break;
            }

        }
        if(t==0)
        {
            System.out.print("element not found");
        }
        else{
            System.out.print("element found");
        }
        sc.close();
    }
    
}
