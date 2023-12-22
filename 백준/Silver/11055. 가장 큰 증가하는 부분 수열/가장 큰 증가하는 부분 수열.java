import java.io.*;
import java.util.*;

class Main{
    public static int n, result;
    public static int[] arr, dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr = new int[n+1];
        dp = new int[n+1];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        dp[1] = arr[1];
        result = dp[1];
        for (int i = 2; i <= n; i++) {
            dp[i] = arr[i];

            for(int j=1; j<i; j++) {
                if(arr[i] > arr[j])
                    dp[i] = Math.max(dp[i], dp[j] + arr[i]);
            }

            result = Math.max(result, dp[i]);
        }

        System.out.println(result);
    }
}