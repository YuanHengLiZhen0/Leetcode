package book;
import tool.MyUtil;
public class 堆排序 {
    public static void main(String[]args){
     int []data={51, 46, 20, 18, 65, 97, 82, 30, 77, 50 };
     createHeap(data);
        MyUtil.print(data,data.length);
      for(int i=data.length-1;i>=1;i--){
          int temp=data[0];
          data[0]=data[i];
          data[i]=temp;
          f(data,0,i);
      }
      MyUtil.print(data,data.length);
    }
    public static  void createHeap(int []num){
        int len=num.length;
        for(int i=(len-1)/2;i>=0;i--)
            f(num,i,len);
    }

    public static  void f(int []num,int k,int len){
        int tmp=num[k];
       for(int i=2*k+1;i<len-1;i=2*i+1){
            if(num[i]<num[i+1])
                i++;
            if(num[i]>tmp){
                tmp=num[i];
                num[i]=num[i/2];
            }else{
                break;
            }
        }
        num[k]=tmp;
    }
}
