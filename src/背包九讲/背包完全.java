package 背包九讲;

import tool.MyUtil;

import java.util.Scanner;

/*

有N种物品和一个容量为V的背包，每种物品可以无限使用。
物品个容量为v，价值为w，求价值最大的放法，物品总量不超过容量V
5 12
3 4
5 4
2 3
6 5
4 3

*
* */
public class 背包完全 {
    public static void main(String []args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int m=s.nextInt();
        int data[][]=new int[n][2];
        for(int i=0;i<n;i++){
            data[i][0]=s.nextInt();
            data[i][1]=s.nextInt();
        }


        int dp[]=new int[m+1];

        for(int i=0;i<n;i++){
            for(int j=data[i][0];j<=m;j++){
                dp[j]=Math.max(dp[j],dp[j-data[i][0]]+data[i][1]);
            }
            MyUtil.print(dp,m+1);
            System.out.println();
        }




    }




}
