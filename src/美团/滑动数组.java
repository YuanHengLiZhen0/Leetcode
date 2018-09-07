package 美团;

import java.util.*;

/*
*数组n中长度为k的子数组中，至少有一个数的个数大于t 输出子数组个数。
* n k t
5 3 2
3 1 1 1 2
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
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<k;i++){
            if(map.containsKey(data[i])){
                map.put(data[i],map.get(data[i])+1);
               if(flag==false&&map.get(data[i])>=t){
                   rel++;
                   flag=true;
               }
            }else map.put(data[i],1);
            if(map.get(data[i])>=t)set.add(data[i]);
        }

        for(int i=k,j=0;i<=n-1;i++,j++){
            map.put(data[j],map.get(data[j])-1);
            if(map.containsKey(data[i]))
                map.put(data[i],map.get(data[i])+1);
            else map.put(data[i],1);
            if(set.contains(data[j])&&map.get(data[j])<t)set.remove(data[j]);
            if(!set.contains(data[i])&&map.get(data[i])>=t)
                set.add(data[i]);
            if(set.size()>0)rel++;



        }
        System.out.println(rel);
    }
}
