public class ChangetheString {
    public static void main(String[] args) {
        String s = "gopi";
        int n= s.length();
        for(int i =0 ; i<n ; i++ )
        {
            for(int j = i; j<n+1; j++)
                System.out.println(s.substring(i,j));
        }
    }
    
}
