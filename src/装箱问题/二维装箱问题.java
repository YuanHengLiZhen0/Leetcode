package 装箱问题;

import java.util.Scanner;
/*
0 0 4 0 0 1
7 5 1 0 0 0
0 0 0 0 0 0
* */
public class 二维装箱问题 {
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        while(s.hasNextLine()){
            String str[]=s.nextLine().split(" ");
            int data[]=new int[6];
            for(int i=0;i<6;i++){
                data[i]=Integer.parseInt(str[i]);
            }
              System.out.println(f(data));

        }
    }
    public static int  f(int data[]){
        int rel=0;
        int left2x2,left1x1;
           rel=data[5]+data[4]+data[3]+(data[2]+3)/4;  //6,5,4,3需要的箱子

           //将2*2的箱子插入间隙中
           left2x2=data[3]*5;
            if (data[2] % 4 == 3) //3 * 3的箱子装完了还剩下3个，只留下了1个2 * 2的空间
            {
                left2x2 += 1;
            }
            else if (data[2] % 4 == 2) //这种情况下留下了3个2 * 2的空间
            {
                left2x2 += 3;
            }
            else if (data[2] % 4 == 1) //注意哦，这种情况下最多可以留下5个2 * 2的空间哈
            {
                left2x2 += 5;
            }

            if (left2x2 < data[1])
            {
                rel += (((data[1] - left2x2) + 8) / 9);  //2 * 2箱子没地方的，开新箱子。
            }


            //将1*1插入间隙中
            left1x1 = 36 * rel - 36 * data[5] - 25 * data[4] - 16 * data[3] - 9 * data[2] - 4 * data[1];
            if  (left1x1 < data[0])//空间不够，加大箱子
            {
                rel += (((data[0] - left1x1) + 35) / 36);
            }

        return rel;
    }


}
