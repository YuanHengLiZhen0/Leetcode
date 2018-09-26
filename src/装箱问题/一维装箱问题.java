package 装箱问题;

import tool.MyUtil;

import java.util.Arrays;
import java.util.Scanner;

/*

假设现有容量n的背包，
第二行为物品的重要，求最少需要几个背包

输入：
4 15
10 5 8 7

*
* */
public class 一维装箱问题 {
    public static void main(String []args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int m=s.nextInt();
        int data[]=new int[n];
        for(int i=0;i<n;i++){
            data[i]=s.nextInt();
        }
        Arrays.sort(data);
        int k=n;
        int rel=0;
        int capacity=m;
        while(k!=0){
            for(int i=n-1;i>=0;i--){
                if(data[i]!=0&&data[i]<=capacity){
                    capacity-=data[i];
                    data[i]=0;
                    k--;
                }
            }
            capacity=m;
            rel++;
        }
        System.out.println(rel);
    }




}
