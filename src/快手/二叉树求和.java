package 快手;

import java.util.Scanner;
/*
给定先序数组和中序数组
输出二叉树求和之后的中序数组
* */
public class 二叉树求和 {

    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        String data1[]=s.nextLine().split(" ");
        String data2[]=s.nextLine().split(" ");
        int pre[]=new int[data1.length];
        int in[]=new int[data2.length];
        for(int i=0;i<data1.length;i++)pre[i]=Integer.valueOf(data1[i]);
        for(int i=0;i<data2.length;i++)in[i]=Integer.valueOf(data2[i]);
        f(pre,in);
    }


    public static  void f(int [] pre,int [] in) {
        if (pre.length == 0 || in.length == 0) {
            return ;
        }
        int rel[]=new int[pre.length];
        dfs(pre, 0, pre.length - 1, in, 0, in.length - 1,rel);
        for(int i:rel)
            System.out.print(i+" ");
    }
    public static void dfs(int [] pre,int pstart, int pend, int [] in, int istart, int iend,int []rel) {
        if (pstart > pend || istart > iend) {
            return ;
        }
        int sum=0;
        for(int i=pstart+1;i<=pend;i++)sum+=pre[i];
        for(int i = istart; i <= iend; i++)
            if(in[i] == pre[pstart]){
                 rel[i]=sum;
                 dfs(pre, pstart + 1, pstart + i - istart, in, istart, i - 1,rel);
                 dfs(pre, i - istart + pstart + 1, pend, in, i + 1, iend,rel);
            }
        return ;
    }
}

