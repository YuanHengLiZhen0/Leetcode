package 字符串;

public class Z字形输出字符串 {
    public static String convert(String s, int numRows) {
          int n=(s.length()/(numRows*2-2)+1)*numRows;
          char[][]data=new char[numRows][n];
          int i=0,j=0;
          int max=0;
          for(int k=0;k<s.length();k++){
              if(i==numRows-1) {
                  while (i != 0) {
                      data[i][j] = s.charAt(k);
                      k++;
                      i--;
                      j++;

                  }
              }
            data[i][j]=s.charAt(k);
            i++;
            if(j>max)max=j;

          }
          for(int p=0;p<data.length;p++){
              for(int q=0;q<=max;q++){
                  if(data[p][q]=='\u0000') System.out.print(" ");
                  else System.out.print(data[p][q]);
              }
              System.out.println();
          }
          return null;
    }

    public static void main(String[]args){
        System.out.println(convert("PA",4));
    }


}
