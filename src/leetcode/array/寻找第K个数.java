package leetcode.array;

import tool.MyUtil;

public class 寻找第K个数 {
    /*复杂度n     计算得复杂小于2n
    快排找到哨兵的位置，如果小于k则在前半，否则在后半
    递归，知道找到哨兵位置就是k
    * */
    public static void main(String[]args){
        int []data={3,4,1,7,90,56,23,89,17};
        int k=5-1;
        System.out.println(sort(k,data,0,data.length-1));
    }
    public  static  int sort(int k,int[]data,int low,int hi){
           if(low>=hi){
            return low;
           }
            int m=f(data,low,hi);
            if(m==k)return m;
            MyUtil.print(data,data.length);
            if(m<k){
              return sort(k,data,m+1,hi);
            }
            else{
            return  sort(k,data,low,m-1);
            }

    }

    public static int f(int []data,int low,int hi){
        int tmp=data[low];
        while(low<hi){
            while(low<hi&&data[hi]>=tmp)hi--;
            data[low]=data[hi];
            while(low<hi&&data[low]<=tmp)low++;
            data[hi]=data[low];
        }
        data[low]=tmp;
        return low;
    }
}
