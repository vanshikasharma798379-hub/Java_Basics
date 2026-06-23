import java.util.Scanner;

public class Greatestof3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.print("enter a number :");
         int a = sc.nextInt();
         System.out.print("enter a number :");
         int b = sc.nextInt();
         System.out.print("enter a number :");
         int c = sc.nextInt();
         if(a>b && a>c)
         {
            System.out.println("a is greatest number");
         }
         else if(b>c && b>a)
         {
            System.out.println("b is greatest number");
         }
         else
         {
            System.out.println("c is greatest number");
         }
         sc.close();
    }
    
}
