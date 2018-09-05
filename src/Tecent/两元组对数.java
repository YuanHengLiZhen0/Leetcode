package Tecent;

import java.util.Arrays;
import java.util.Scanner;

public class 两元组对数 {
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
       int  n= s.nextInt();
       int data[]=new int[n];
       for(int i=0;i<n;i++){
           data[i]=s.nextInt();
       }
        Arrays.sort(data);
       int min=data[0],max=data[data.length-1];
       if(min==max){
           System.out.println(n*(n-1)/2+" "+n*(n-1)/2);
       }
       int mincount=0,maxcount=0;
       for(int i=0;i<n;i++){
           if(data[i]==min)mincount++;
       }
       for(int i=data.length-1;i>=0;i--){
           if(data[i]==max)maxcount++;
       }
        if(mincount==1)
        System.out.println(n*(n-1)/2+" "+n*(n-1)/2);
    }

}
