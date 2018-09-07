package 美团;



import java.util.Scanner;

public class 最长连续子串 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String s1 = in.nextLine();
        String s2 = in.nextLine();
        System.out.println(getnum(s1,s2));
    }
    public static int getnum(String s1, String s2){
        int num=0;
        int indexofp1=0;
        int indexofp2=0;
        while(indexofp2>=indexofp1&&indexofp1<s2.length()-1){
            for(int i=indexofp1;i<s2.length();i++){
                if(s1.contains(s2.substring(indexofp1, indexofp2+1))&&indexofp2-indexofp1+1<=s1.length()&&indexofp2-indexofp1+1>=num){
                    num = Math.max(num, indexofp2-indexofp1+1);
                }
                indexofp2++;
            }
            indexofp1++;
            indexofp2=indexofp1;
        }
        if(s1.contains(s2.substring(s2.length()-1))&&num==0){
            return 1;
        }
        return num;
    }
}