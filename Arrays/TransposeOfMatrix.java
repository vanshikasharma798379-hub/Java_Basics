public class TransposeOfMat {
    public static void main(String[] args) {
        int[][] arr= {{1,3,4,2},{43,36,78,34},{4,67,5,18},{5,4,3,2}};
        int n = arr.length;
        int m = arr[0].length;
        int[][] ans = new int[m][n];
        for(int i =0; i<m; i++)
        {
            for(int j = 0; j<n; j++)
            {
                ans[i][j]=arr[j][i];     
            }
        }
        for(int i =0; i<n; i++)
        {
            for(int j = 0; j<m; j++)
            {
                System.err.print(ans[i][j]+" ");     
            }
            System.out.println( );
        }


    }
    
}
