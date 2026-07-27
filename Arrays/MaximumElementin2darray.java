public class Maxin2d {
    public static void main(String[] args) {
        int[][] mat = {{1,3,4,2},{43,36,78,34}};
        int n = mat.length;
        int m = mat[0].length;
        int max = mat[0][0];
        for(int i =0 ;i<n;i++)
        {
            for(int j = 0; j<m; j++)
            {
                if(mat[i][j]>max)
                {
                    max = mat[i][j];
                }
            }
        }
        System.out.println(max);
    }
    
}
