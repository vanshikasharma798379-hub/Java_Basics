import java.util.Scanner;

public class Quadrant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.print("enter a point1 :");
         int x = sc.nextInt();
         System.out.print("enter a point2 :");
         int y = sc.nextInt();
         if(x == 0 && y == 0 )
         {
            System.out.println("origin");
         }
         else if(x == 0)
         {
            System.out.println("y-axis");
         }

         else if(y == 0)
         {
            System.out.println("x-axis");
         }
         else if(x>0 && y>0)
         {
            System.out.println("1st quadrant");
         }
         else if(x>0 && y<0)
         {
            System.out.println("2nd quadrant");
         }
         else if(x<0 && y<0)
         {
            System.out.println("3rd quadrant");
         }
         else
            {
                System.out.println("4th quadrant");
            } 
            sc.close();
       
    }
    
}
