import java.io.*;
import java.util.*;

class Main{
    public static int n, k;
    public static int[] arr;
    public static String[] str;
    public static long max, min, mid;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        str = br.readLine().split(" ");
        k = Integer.parseInt(str[0]);
        n = Integer.parseInt(str[1]);
        arr = new int[k];

        max = Long.MIN_VALUE;
        min = 0;

        for (int i = 0; i < k; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            max = Math.max(arr[i], max);
        }
        max++;

        while (min < max) {
            mid = (min + max) / 2;

            long cnt = 0;

            for (int i = 0; i < k; i++) {
                cnt += arr[i] / mid;
            }

            if (cnt < n) {
                max = mid;
            } else {
                min = mid + 1;
            }
        }

        System.out.println(min - 1);
    }
}