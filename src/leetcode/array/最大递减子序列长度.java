package leetcode.array;

import tool.MyUtil;

import java.util.Scanner;

public class 最大递减子序列长度 {

    public static void main(String[] args) {
        /*
        * 4  3
        * 10 3 7 5
        *
        * */
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int m=s.nextInt();
        int data[]=new int[n*m];
        for(int i=0;i<n;i++){
            data[i]=s.nextInt();
        }

        int dp[]=new int[n*m+1];
        dp[1]=1;
        for(int i=2;i<=m*n;i++){
            int max=1;
            for(int j=1;j<i;j++){
                if(data[(i-1)%n]>data[(j-1)%n]&&dp[j]+1>max) max=dp[j]+1;
            }
            dp[i]=max;
        }
   MyUtil.print(dp,n*m+1);
    }
  public static  long f(int n){
        if(n==1)return 10;
        if(n==2)return 100;
        return f(n-2)*21+10*f(n-1);
  }
}

