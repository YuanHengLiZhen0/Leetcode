package book;

public class 数字均出现3次 {
    public  static  void main(String[]args){
        int A[]={-2,-2,1,1,-3,1,-3,-3,-4,-2};
        singleNumber(A);
    }
    public static int singleNumber(int[] A) {
        int data[]=new int[32];
        for(int i=0;i<A.length;i++){
            String tmp=   Integer.toBinaryString(A[i]);
            int len=tmp.length();
            int k=31;
            for(int j=len-1;j>=0;j--){
                data[k--]+=Integer.parseInt(String.valueOf(tmp.charAt(j)));
            }
        }
        StringBuilder rel=new StringBuilder();
        for(int i=0;i<32;i++) {
            data[i] %= 3;
            rel.append(data[i]);
        }System.out.println(Integer.parseInt("10000000000000000000000000000011",2));
        return  Integer.parseInt("10000000000000000000000000000011",2);

    }
}
