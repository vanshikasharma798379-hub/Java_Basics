import java.util.Scanner;

public class Divisible_By_3_Or_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number");
        int num = sc.nextInt();
        if(num % 3 == 0 || num % 5 == 0)
        {
             System.out.println("number divisible by 3 or 5" );
        }
        else{
             System.out.println("number not divisible by 3 or 5");
        }
        sc.close();
    }
    
}
