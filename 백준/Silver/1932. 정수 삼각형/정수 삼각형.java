import java.io.*;
import java.util.*;

class Main{
    public static int n,result;
    public static int[][] arr;
    public static Integer[][] dp;
    public static StringTokenizer st;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr = new int[n][n];
        dp = new Integer[n][n];
        result = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j <= i; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        dp[0][0] = arr[0][0];

        for (int i = 0; i < n; i++) {
            result = Math.max(cal(n - 1, i), result);
        }
        System.out.println(result);
    }
    public static int cal(int a, int b) {
        if (dp[a][b] == null) {
            if (b == 0) {
                dp[a][b] = cal(a-1,b)+ arr[a][b];
            } else if (a == b) {
                dp[a][b] = cal(a - 1,b - 1) + arr[a][b];
            } else {
                dp[a][b] = Math.max(cal(a - 1, b - 1), cal(a - 1, b)) + arr[a][b];
            }
            return dp[a][b];
        }
        return dp[a][b];
    }
}