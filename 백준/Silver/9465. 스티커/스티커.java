import java.io.*;
import java.util.*;

class Main{
    public static int n, m;
    public static StringTokenizer st;
    public static int[][] arr;
    public static int[][] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            m = Integer.parseInt(br.readLine());
            arr = new int[2][m+1];
            dp = new int[2][m+1];

            for (int j = 0; j < 2; j++) {
                st = new StringTokenizer(br.readLine());
                for (int k = 1; k <= m; k++) {
                    arr[j][k] = Integer.parseInt(st.nextToken());
                }
            }

            dp[0][1] = arr[0][1];
            dp[1][1] = arr[1][1];
            for (int l = 2; l <= m; l++) {
                dp[0][l] = Math.max(dp[1][l - 1], dp[1][l - 2]) + arr[0][l];
                dp[1][l] = Math.max(dp[0][l - 1], dp[0][l - 2]) + arr[1][l];
            }

            System.out.println(Math.max(dp[0][m], dp[1][m]));
        }
    }
}