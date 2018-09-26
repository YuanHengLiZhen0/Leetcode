package book;

import tool.MyUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/*
6 5
1 1 0 1 1
1 0 1 1 1
1 0 1 0 0
1 0 1 1 1
1 1 1 0 1
1 1 1 1 1

*/
public class 深搜 {
    public  static  void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int m=scanner.nextInt();

        int [][]data=new int[n][m];
        int[][]d=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                data[i][j]= scanner.nextInt();
            }
        }
        dfs(data,0,0,n,m,d);


    }

    public static void dfs(int [][]data,int x,int y,int n,int m,int [][]d){
       if(x<0||y<0||x>=n||y>=m||data[x][y]==0||d[x][y]==1){
           return;
       }
        d[x][y]=1;
        dfs(data,x,y-1,n,m,d);
        dfs(data,x,y+1,n,m,d);
        dfs(data,x-1,y,n,m,d);
        dfs(data,x+1,y,n,m,d);

        MyUtil.print(d,n,m);
        System.out.println();
        d[x][y]=0;

    }
}
