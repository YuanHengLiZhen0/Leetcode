package 美团;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
/*
*数组n中长度为k的子数组中，至少有一个数的个数大于t 输出子数组个数。
* 5 3 2   n k t
* 3 1 1 1 2
*
* 输出：3
*
* */
public class 滑动数组 {
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int k=s.nextInt();
        int t=s.nextInt();
        int data[]=new int[n];
        for(int i=0;i<n;i++)
            data[i]=s.nextInt();
        Map<Integer,Integer> map=new HashMap<>();
        int rel=0;
        boolean flag=false;
        for(int i=0;i<k;i++){
            if(map.containsKey(data[i])){
                map.put(data[i],map.get(data[i])+1);
               if(flag==false&&map.get(data[i])>=t){
                   rel++;
                   flag=true;
               }
            }else map.put(data[i],1);
        }

        for(int i=k;i<=n;i++){
            map.put(data[i-1],map.get(data[i-1])-1);
            if(map.containsKey(data[i])){
                map.put(data[i],map.get(data[i])+1);
                if(map.get(data[i])>=t){
                    rel++;
                    continue;
                }
            }
            else map.put(data[i],1);
        }
        System.out.println(rel);
    }
}
