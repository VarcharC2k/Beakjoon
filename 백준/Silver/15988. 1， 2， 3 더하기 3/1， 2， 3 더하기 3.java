import java.io.*;
import java.util.*;

class Main{
    public static int n,m;
    public static Long[] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        dp = new Long[1000001];
        dp[1] = 1L;
        dp[2] = 2L;
        dp[3] = 4L;

        for (int i = 0; i < n; i++) {
            m = Integer.parseInt(br.readLine());
            System.out.println(cal(m));
        }
    }

    public static long cal(int a) {
        if (dp[a] == null) {
            dp[a] = (cal(a - 3) + cal(a - 2) + cal(a - 1)) % 1000000009;
            return dp[a];
        }

        return dp[a];
    }
}