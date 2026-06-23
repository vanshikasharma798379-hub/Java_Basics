import java.util.Scanner;
public class area_of_circle {
    public static void main (String args[])
        {
          Scanner sc= new Scanner(System.in);
          double radius = sc.nextDouble();
           double area_of_circle= 3.14*radius*radius;
           System.out.println(area_of_circle);
           sc.close();
        }  
}
