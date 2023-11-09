import java.io.*;
import java.util.*;

class Main {
    public static int n, m;
    public static long result;
    public static String[] str;
    public static int[] arr;
    public static long[] temp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        str = br.readLine().split(" ");
        n = Integer.parseInt(str[0]);
        m = Integer.parseInt(str[1]);
        str = br.readLine().split(" ");
        arr = new int[n];
        temp = new long[n+1];
        result = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }

        temp[0] = arr[0];
        for (int i = 1; i < n; i++) {
            if (i < m) {
                temp[i] = arr[i] + temp[i - 1];
            } else {
                temp[i] = arr[i] + temp[i - 1] - arr[i - m];
            }
        }

        for (int i = m - 1; i < n; i++) {
            result = Math.max(result, temp[i]);
        }

        System.out.println(result);

    }
}