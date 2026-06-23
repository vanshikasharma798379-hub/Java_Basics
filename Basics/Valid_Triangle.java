import java.util.Scanner;

public class Sidesoftriangle {
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
        System.out.print("enter a 1st side");
        int a = sc.nextInt();
         System.out.print("enter a 2nd side");
        int b = sc.nextInt();
         System.out.print("enter a 3rd side");
        int c = sc.nextInt();
        if(a+b>c && b+c>a && c+a>b){
            System.out.println("yes,these can be a sides of a triangle");
        }
        else{
            System.out.println("no,these cannot be a sides of a triangle");
        }
        sc.close();
  
    }
}
