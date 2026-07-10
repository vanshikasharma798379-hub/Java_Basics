class Solution {
    public ArrayList<Integer> mergeThree(int[] a, int[] b, int[] c) {
        // code here
        int m = a.length;
        int n = b.length;
        int p = c.length;
        ArrayList<Integer> d = new ArrayList<>();
        int i =0 , j= 0, k = 0, l = 0;
        while(i<m && j<n && k<p)
        {
            if(a[i]<=b[j] && a[i]<=c[k])
            {
                d.add(a[i++]);
            }
            else if(b[j]<=a[i] && b[j]<=c[k])
            {
                d.add(b[j++]);
            }   
            else
            {
                d.add(c[k++]);
            }
        }
        while(i<m && j<n)
        {
            if(a[i]<b[j])
            {
                d.add(a[i++]);
            }
            else
            {
                d.add( b[j++]);
            }
        }
        while(j<n && k<p)
        {
            if(b[j]<c[k])
            {
                d.add(b[j++]);
            }
            else
            {
                d.add(c[k++]);
            }
        }
        while(i<m && k<p)
        {
            if(a[i]<c[k])
            {
                d.add(a[i++]);
            }
            else
            {
                d.add(c[k++]);
            }
        }
        while(i<m)
        {
            d.add(a[i++]);
        }
        while(j<n)
        {
            d.add(b[j++]);
        }
        while(k<p)
        {
            d.add(c[k++]);
        }
        return d;
        
    }
}
