class Solution {
    public int countZeros(int[][] arr) {
        int n = arr.length;
        if(n==0)
        {
            return 0;
        }
        int count= 0;
        for(int i =0; i<n; i++)
        {
            for(int j= 0;j<n;j++)
            {
                if(arr[i][j]==0)
                {
                    count++;
                }
            }
        }
        return count;
        
        
    }
}
