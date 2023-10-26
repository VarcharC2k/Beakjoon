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
        for(int i = 1; i <= n; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        dp[0] = arr[0];
        dp[1] = arr[1];

        if (n > 1) {
            dp[2] = arr[1] + arr[2];
        }
        result = stair(n);
        System.out.println(result);
    }

    public static int stair(int n){
        if (dp[n] == null) {
            dp[n] = Math.max(stair(n - 2), stair(n-3) + arr[n-1]) + arr[n];
            return dp[n];
        }
        return dp[n];
    }

}