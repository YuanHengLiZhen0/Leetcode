package tool;

import book.ListNode;

public class MyUtil {
   public static void print(int[]data,int len){
        for(int i=0;i<len;i++)
            System.out.print(data[i]+"  ");
       System.out.println();
    }
    public static void print(byte[][]data,int m,int n){
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++)
            System.out.print(data[i][j]+"  ");
            System.out.println();
        }
    }
    public static void print(ListNode p){
       while(p!=null){
           System.out.print(p.label+"  ");
           p=p.next;
       }
        System.out.println();
    }
}


