package 动态规划;

import tool.MyUtil;

import java.util.Scanner;
/*
abcdef
adefcb
* */
//子串是连续的
public class 最长公共子串 {

    public static void main(String[] args) {
     Scanner s=new Scanner(System.in);
     String str1=s.nextLine();
     String str2=s.nextLine();
      System.out.println(f(str1,str2));
    }

    public static int f(String str1,String str2){
        if(str1==null||str2==null)return 0;
        int rel=0;
        int len1=str1.length(),len2=str2.length();
        //dp[i][j]代表，str1以i结尾以及str2以j结尾的公共子串长度为多少
        int dp[][]=new int[len1+1][len2+1];
        for(int i=1;i<=len1;i++){
            for(int j=1;j<=len2;j++) {
                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {

                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else dp[i][j] = 0;
                if(dp[i][j]>rel)rel=dp[i][j];
            }
            }
        MyUtil.print(dp,len1+1,len2+1);
        return rel;
    }
}
