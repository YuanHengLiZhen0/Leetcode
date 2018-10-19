package 动态规划;

public class 最长回文子串 {
    public static String longestPalindrome(String s) {
        int n=s.length();
        boolean dp[][]=new boolean[n][n];
        if(n<=1)return s;
        int max=0;
        int maxj=0,maxi=0;
        for(int i=n-1;i>=0;i--){
            for(int j=i;j<n;j++){
                if(j-i==1){
                   if( s.charAt(i)==s.charAt(j))dp[i][j]=true;
                }else if(j==i)dp[i][j]=true;
                else if(j-i>1&&(dp[i+1][j-1]==true&&s.charAt(i)==s.charAt(j)))
                    dp[i][j]=true;
                if(dp[i][j]&&j-i>max){
                    max=j-i;
                    maxj=j;
                    maxi=i;
                }
            }
        }
        return s.substring(maxi,maxj+1);
    }
    public static void main(String[]args){
        System.out.println(longestPalindrome("cbbd"));
    }
}
