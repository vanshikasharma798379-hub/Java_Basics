public class Maxsumofrows {
    public static void main(String[] args) {
        int[][] mat = {{1,3,4,2},{43,36,78,34},{4,67,5,18}};
        int maxsum = Integer.MIN_VALUE;
        for(int i =0; i<mat.length; i++)
        {
            int sum = 0;
            for(int j =0; j<mat[0].length;j++)
            {
                  sum = sum +mat[i][j];
            }
            maxsum =Math.max(maxsum,sum);
        }
        System.out.println(maxsum);
    }
}
