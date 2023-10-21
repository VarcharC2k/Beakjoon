import java.io.*;
import java.util.*;

class Main{
    public static int n,k,cnt;
    public static String s;
    public static StringTokenizer st;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        n = Integer.parseInt(str[0]);
        k = Integer.parseInt(str[1]);
        Item[] arr = new Item[n];

        for (int i = 0; i < n; i++) {
            str = br.readLine().split(" ");
            arr[i] = new Item(Integer.parseInt(str[0]), Integer.parseInt(str[1]));
        }

        System.out.println(findn(arr,k));

    }

    public static int findn(Item[] items, int c) {
        int l = items.length;
        int[][] dp = new int[n + 1][c + 1];

        for (int i = 1; i <= l; i++) {
            for (int j = 1; j <= c; j++) {
                if (items[i-1].w > j) {
                    dp[i][j] = dp[i - 1][j];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - items[i - 1].w] + items[i - 1].v);
                }
            }
        }

        return dp[n][c];
    }

    public static class Item{
        int w;
        int v;

        public Item(int w, int v) {
            this.w = w;
            this.v = v;
        }

    }
}