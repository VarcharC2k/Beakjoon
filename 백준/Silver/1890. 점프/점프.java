import java.io.*;
import java.util.*;

class Main{
    public static int n;
    public static String[] str;
    public static int[][] arr;
    public static long[][] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr = new int[n+1][n+1];
        dp = new long[n+1][n+1];

        for (int i = 1; i <= n; i++) {
            str = br.readLine().split(" ");
            for (int j = 1; j <= n; j++) {
                arr[i][j] = Integer.parseInt(str[j-1]);
            }
        }
        dp[1][1] = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                int temp = arr[i][j];
                if (temp == 0) {
                    break;
                }

                if (i + temp <= n) {
                    dp[i + temp][j] += dp[i][j];
                }
                if (j + temp <= n) {
                    dp[i][j + temp] += dp[i][j];
                }

            }
        }

        System.out.println(dp[n][n]);

    }
}