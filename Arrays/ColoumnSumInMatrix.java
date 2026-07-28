class Solution {
    public static int[] colSum(int arr[][]) {
        int n = arr.length;
        int m = arr[0].length;
        int[] ans = new int[m];
        for(int i =0;i<m; i++)
        {
            int sum = 0;
            for(int j =0; j<n; j++)
            {
                sum =sum+arr[j][i];
            }
            ans[i] = sum;
        }
        return ans;
        
    }
}
