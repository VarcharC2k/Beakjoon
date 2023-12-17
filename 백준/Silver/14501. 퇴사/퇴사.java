import java.io.*;


class Main {
    public static int n;
    public static int[][] arr;
    public static int[] dp;
    public static String[] str;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr = new int[n][2];
        dp = new int[n+1];

        for (int i = 0; i < n; i++) {
            str = br.readLine().split(" ");
            arr[i][0] = Integer.parseInt(str[0]);
            arr[i][1] = Integer.parseInt(str[1]);
        }

        for (int i = 0; i < n; i++) {
            if (i + arr[i][0] <= n) {
                dp[i + arr[i][0]] = Math.max(dp[i + arr[i][0]], dp[i] + arr[i][1]);
            }
            dp[i + 1] = Math.max(dp[i + 1], dp[i]);
        }

        int result = dp[0];
        for (int i : dp) {
            result = Math.max(result, i);
        }

        System.out.println(result);
    }

}
