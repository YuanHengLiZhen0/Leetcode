package book;

import tool.MyUtil;

public class QuikSort {
    public static void main(String[]args){
        int []data={51, 46, 20, 18, 65, 97, 82, 77, 77, 50 };
        sort(data,0,data.length-1);
        MyUtil.print(data,data.length);
    }
    public static void sort(int[]data,int l,int h){
        if(l>=h){
            return ;
        }
        int m=f(data,l,h);
        sort(data,l,m-1);
        sort(data,m+1,h);
    }
    public static int f(int[]data,int l,int h){
        int tmp=data[l];
        while(l<h){
            while (l<h&&data[h]>=tmp)h--;
            data[l]=data[h];
            while (l<h&&data[l]<=tmp)l++;
            data[h]=data[l];
        }
        data[l]=tmp;
        return  l;
    }
}
