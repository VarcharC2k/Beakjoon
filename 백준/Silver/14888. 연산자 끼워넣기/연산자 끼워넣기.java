import java.io.*;
import java.util.*;

class Main{
    public static int n,MAX, MIN;
    public static String[] str;
    public static int[] arr, operator;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr = new int[n];
        str = br.readLine().split(" ");

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }

        str = br.readLine().split(" ");
        operator = new int[4];

        for (int i = 0; i < 4; i++) {
            operator[i] = Integer.parseInt(str[i]);
        }

        MAX = Integer.MIN_VALUE;
        MIN = Integer.MAX_VALUE;
        dfs(arr[0],1);
        System.out.println(MAX);
        System.out.println(MIN);
    }

    public static void dfs(int num, int idx) {
        if (idx == n) {
            MAX = Math.max(MAX, num);
            MIN = Math.min(MIN, num);
            return;
        }

        for (int i = 0; i < 4; i++) {
            if (operator[i] > 0) {
                operator[i]--;

                switch (i) {
                    case 0:
                        dfs(num + arr[idx], idx + 1);
                        break;
                    case 1:
                        dfs(num - arr[idx], idx + 1);
                        break;
                    case 2:
                        dfs(num * arr[idx], idx + 1);
                        break;
                    case 3:
                        dfs(num / arr[idx], idx + 1);
                        break;
                }

                operator[i]++;
            }
        }
    }
}