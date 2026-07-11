class Solution {
    void pushZerosToEnd(int[] arr) {
        int n = arr.length;
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i =0; i<n;i++)
        {
            if(arr[i]!=0)
            {
                ans.add(arr[i]);
            }
        }
        while(ans.size()<n)
        {
            ans.add(0);
        }
        for (int i = 0; i < ans.size(); i++) {
            arr[i] = ans.get(i);
        }
    }
}
