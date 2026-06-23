import java.util.Scanner;
public class SquareOfNumber {
    public static void main(String args[])
    {
        Scanner Sc= new Scanner(System.in);
        System.out.print("enter a number:");
        int a= Sc.nextInt();
        int sqr = a*a;
        System.out.print("the square of a number is :");
        System.out.println(sqr);
        Sc.close();

    }
   
}
