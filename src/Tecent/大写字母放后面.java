package Tecent;

import java.util.Scanner;

public class 大写字母放后面 {
    /*给定一个大写字母和小写字母的字符串，将
    所有的大写字母放在最后面，保持顺序不变。
   * */
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        String str=s.next();
        char []chs=str.toCharArray();
       System.out.println(f(chs));
    }
    public static String f( char []chs){
        if(chs.length==0||chs==null)return String.valueOf(chs);
        int len=chs.length;
        for(int i=len-1;i>=0;i--){
            if(Character.isUpperCase(chs[i])){
                for(int j=i;j<len;j++){
                    if((j+1<len)&&Character.isLowerCase(chs[j+1])){
                        char ch=chs[j];
                        chs[j]=chs[j+1];
                        chs[j+1]=ch;
                    }else
                        break;

                }
            }
        }
        return String.valueOf(chs);
    }
}
