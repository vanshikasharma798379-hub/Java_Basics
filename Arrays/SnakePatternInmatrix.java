public class SnakePatterninmtrix {
    public static void main(String[] args) {
        int[][] mat = {{1,3,4,2},{43,36,78,34},{4,67,5,18}};
        for(int i =0; i<mat.length; i++)
        {
            if(i%2==0)
            {
                for(int j =0; j<mat[0].length; j++)
                {
                    System.out.print(mat[i][j]+" ");
                }
            }
            else
            {
              for(int j =mat[0].length-1; j>=0; j--)
                {
                    System.out.print(mat[i][j]+" ");
                }  
            }

            }
    }
}
    

