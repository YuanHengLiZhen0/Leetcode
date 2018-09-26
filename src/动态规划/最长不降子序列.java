package 动态规划;

import tool.MyUtil;

import java.util.Scanner;
/*
abcdef
adefcb
* */

public class 最长不降子序列 {

    public static void main(String[] args) {
     Scanner s=new Scanner(System.in);
     int  n=s.nextInt();
     int data[]=new int[n];
     for(int i=0;i<n;i++)
         data[i]=s.nextInt();
      System.out.println(f(data,n));
    }

    public static int f(int []data,int n){
        int dp[]=new int[n];
        int rel=0;
        for(int i=0;i<n;i++){
            dp[i]=1;
            for(int j=0;j<i;j++){
               if(data[j]<=data[i])
                   dp[i]=Math.max(dp[i],dp[j]+1);
            }
           rel=rel>dp[i]?rel:dp[i];
        }
        MyUtil.print(dp,n);
        return rel;
    }
}
