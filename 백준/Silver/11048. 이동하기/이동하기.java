import java.awt.*;
import java.io.*;
import java.util.*;

class Main{
    public static int n, m;
    public static int[][] arr;
    public static Integer[][] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new int[n+1][m+1];
        dp = new Integer[n + 1][m + 1];
        for (int i = 1; i <= n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= m; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        System.out.println(candy(n, m));

    }

    public static int candy(int a, int b) {
        if (a == 0 || b == 0) {
            return 0;
        }

        if (dp[a][b] == null) {
            dp[a][b] = Math.max(Math.max(candy(a - 1,b - 1), candy(a - 1,b)), candy(a,b - 1)) + arr[a][b];
            return dp[a][b];
        }

        return dp[a][b];
    }

}