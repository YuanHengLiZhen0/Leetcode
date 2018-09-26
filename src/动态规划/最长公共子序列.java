package 动态规划;

import tool.MyUtil;

import java.util.*;
/*
abcdef
adefcb
* */

public class 最长公共子序列 {

    public static void main(String[] args) {
     Scanner s=new Scanner(System.in);
     String str1=s.nextLine();
     String str2=s.nextLine();
      System.out.println(f(str1,str2));
    }

    public static int f(String str1,String str2){
        if(str1==null||str2==null)return 0;
        int len1=str1.length(),len2=str2.length();
        int dp[][]=new int[len1+1][len2+1];
        for(int i=1;i<=len1;i++){
            for(int j=1;j<=len2;j++){
                if(str1.charAt(i-1)==str2.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1]+1;
                }else dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);

            }
        }
        MyUtil.print(dp,len1+1,len2+1);
        return dp[len1][len2];
    }
}
