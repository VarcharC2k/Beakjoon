import java.io.*;
import java.util.*;

class Main{
    public static int n,result;
    public static int[] arr;
    public static Integer[] dp;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr = new int[n+1];
        dp = new Integer[n+1];
        result = Integer.MIN_VALUE;
        for(int i = 1; i <= n; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        dp[0] = 0;
        dp[1] = arr[1];
        if (n > 1) {
            dp[2] = arr[1] + arr[2];
        }
        for (int i = 3; i <= n; i++) {
            dp[i] = Math.max(Math.max(dp[i - 3] + arr[i - 1], dp[i - 2]) + arr[i], dp[i - 1]);
        }
        System.out.println(dp[n]);
    }

}