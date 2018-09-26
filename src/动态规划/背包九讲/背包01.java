package 动态规划.背包九讲;

import tool.MyUtil;

import java.util.Scanner;
/*

假设现有n个物品，容量v的背包，
这些物品单个容量为v,价值为c。则将哪些物品放入背包可使得背包中的总价值最大？

输入：
3 10
3 4
4 5
5 6

*
* */
public class 背包01 {
    public static void main(String []args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int m=s.nextInt();
        int data[][]=new int[n][2];
        for(int i=0;i<n;i++){
            data[i][0]=s.nextInt();
            data[i][1]=s.nextInt();
        }


        int dp[][]=new int[n+1][m+1];
        for (int i = 0; i < n + 1; i++)
            dp[i][0] = 0;
        for (int j = 0; j < m + 1; j++)
            dp[0][j] = 0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(j-data[i-1][0]>=0){
                    dp[i][j]=Math.max(dp[i-1][j],dp[i-1][j-data[i-1][0]]+data[i-1][1]);
                }
                else dp[i][j]=dp[i-1][j];
            }
        }
        MyUtil.print(dp,n+1,m+1);

    }




}
