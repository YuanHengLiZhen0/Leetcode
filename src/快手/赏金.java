package 快手;

import java.util.*;
/*
*
*
* 赏金分为3份，第一份和第三份可以为空，但必须相等。求最大赏金，赏金是第一份的数目
5
1 2 3 4 5
* */
public class 赏金 {



    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int data[]=new int[n];
        for(int i=0;i<n;i++)data[i]=in.nextInt();
        System.out.println(f(data,n));
    }

    public static long f(int data[],int len){
        if(len==1)return 0;
        long rel=0;
        int low=0;int hi=len-1;
        long count1=0,count2=0;
        while(low<=hi){
            while(count1==0||count1<count2){
                count1+=data[low++];
            }
            while(count2==0||count1>count2){
                count2+=data[hi--];
            }
            if(count1==count2){
                if(count1>rel)rel=count1;
                count1+=data[low++];
            }

        }
        return rel;
    }
}