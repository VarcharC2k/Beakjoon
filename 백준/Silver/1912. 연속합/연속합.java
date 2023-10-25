import java.io.*;
import java.util.*;

class Main{
    public static int n, max;
    public static int[] arr;
    public static Integer[] dp;
    public static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr = new int[n];
        dp = new Integer[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        max = dp[0] = arr[0];
        cal(n - 1);
        System.out.println(max);
    }

    public static int cal(int a) {
        if (dp[a] == null) {
            dp[a] = Math.max(cal(a - 1) + arr[a], arr[a]);
            max = Math.max(max, dp[a]);
            return dp[a];
        }
        return dp[a];
    }
}