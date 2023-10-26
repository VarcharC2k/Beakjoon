import java.io.*;
import java.util.*;

class Main{
    public static int n,result;
    public static int[][] arr, dp;
    public static StringTokenizer st;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr = new int[n][3];
        dp = new int[n][3];
        result = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 3; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        dp[0] = arr[0];
        for (int i = 0; i < 3; i++) {
            result = Math.min(home(n - 1, i),result);
        }
        System.out.println(result);
    }

    public static int home(int a,int b) {
        if (dp[a][b] == 0) {
            switch (b) {
                case 0:
                    dp[a][b] = Math.min(home(a - 1, b + 1) + arr[a][b], home(a - 1, b + 2) + arr[a][b]);
                    break;
                case 1:
                    dp[a][b] = Math.min(home(a - 1, b - 1) + arr[a][b], home(a - 1, b + 1) + arr[a][b]);
                    break;
                case 2:
                    dp[a][b] = Math.min(home(a - 1, b - 2) + arr[a][b], home(a - 1, b - 1) + arr[a][b]);
                    break;
            }
            return dp[a][b];
        }
        return dp[a][b];
    }
}