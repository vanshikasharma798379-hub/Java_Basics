import java.util.Scanner;

public class ProfitorLosspercentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a cost price: ");
        int cp =sc.nextInt();
        System.out.print("enter a selling price: ");
        int sp =sc.nextInt();
        if(sp>cp)
        {
            System.out.println("profit");
            double profit =(sp-cp)/100.0;
            System.out.println(profit);
        }
        else{
            System.out.println("loss");
            double loss =(cp-sp)/100;
            System.out.println(loss);

        }

        sc.close();

    }
    
}
