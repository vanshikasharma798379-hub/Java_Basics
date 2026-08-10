public class ReverseusingRecursion {
    static int Reverse(int n , int r)
    {
        if(n==0)
        {
            return r ;
        }
         return Reverse(n/10,r*10+(n%10));
    }
    public static void main(String[] args) {
        int n = 5674;
        System.out.println(Reverse(n,0));
    }
    
}
