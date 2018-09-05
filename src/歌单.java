
import java.util.Scanner;
/*

小Q有X首长度为A的不同的歌和Y首长度为B的不同的歌，现在小Q想用这些歌组成一个总长度正好为K的歌单，
每首歌最多只能在歌单中出现一次，在不考虑歌单内歌曲的先后顺序的情况下，请问有多少种组成歌单的方法。
例子：
输入
5
2 3 3 3
输出
9
* */
public class 歌单 {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int length = scan.nextInt();
            int A = scan.nextInt();
            int X = scan.nextInt();
            int B = scan.nextInt();
            int Y = scan.nextInt();
            System.out.println(qlist(length, A, X, B, Y));
        }


        //公式C(M,N)=C(M-1,N-1)+C(M-1,N);
        public static long qlist(int length, int A, int X, int B, int Y) {
            long mod = 1000000007;
            // 构建杨辉三角
            int max = 101;
            long[][] tri = new long[max][max];
            tri[0][0] = 1;
            for (int i = 1; i < max; i++) {
                tri[i][0] = 1;
                for (int j = 1; j < max; j++) {
                    tri[i][j] = (tri[i - 1][j - 1] + tri[i - 1][j]) % mod;
                }
            }
            long sum = 0;
            for (int value = 0; value <= length; value++) {
                if (value % A == 0 && (length - value) % B == 0 && value/A <= 100 && (length - value) / B <= 100) {
                    sum += tri[X][value / A] * tri[Y][(length - value) / B] % mod;
                }
            }
            return sum % mod;
        }

}
