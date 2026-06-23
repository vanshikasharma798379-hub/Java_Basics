public class Alphabetsquarepattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number of rows");
        int n = sc.nextInt();
        for( int i = 1; i<=n; i++)
        {
            for( int j = 65; j<=68; j++)
            {
                System.out.print((char)j +" ");
            }
            System.out.println( );
        }
        sc.close();
    }
    
}
