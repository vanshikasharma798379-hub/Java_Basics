class Solution {
    public static char getMaxOccuringChar(String s) {
      int n = s.length();
      int maxf = -1;
      char ans = s.charAt(0);
      
      for(int i  = 0; i < n; i++)
      {
          int f = 1;
          for(int j = i+1; j<n; j++)
          {
              if(s.charAt(i)==s.charAt(j))
              {
                  f++;
              }
          }   
              if(f>maxf)
              {
                  maxf = f;
                  ans =s.charAt(i);
              }
              else if(f == maxf && s.charAt(i)<ans)
              {
                  ans = s.charAt(i);
              }
              
          
      }
      return ans;
        
    }
}
