package 美团;



import java.util.Scanner;
/*
* 给定一组非负整数组成的数组h，代表一组柱状图的高度，其中每个柱子的宽度都为1。
* 在这组柱状图中找到能组成的最大矩形的面积（如图所示）。 入参h为一个整型数组，代表每个柱子的高度，返回面积的值。
* 输入例子1:
6
2 1 5 6 2 3

输出例子1:
10
* */
public class 最大矩形面积 {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int data[]=new int[n];
        for(int i=0;i<n;i++)
            data[i]=scanner.nextInt();
        int max=0;

        for(int i=0;i<n;i++){
            int min=data[i];
            for(int j=i;j>=0;j--){
                if(data[j]<min)min=data[j];
                if(max<min*(i-j+1))max=min*(i-j+1);

            }
        }
        System.out.println(max);

    }
}
