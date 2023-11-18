import java.io.*;
import java.util.*;

class Main{
    public static int n,m,min,max,mid;
    public static String[] str;
    public static int[] arr;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        str = br.readLine().split(" ");
        n = Integer.parseInt(str[0]);
        m = Integer.parseInt(str[1]);
        str = br.readLine().split(" ");
        arr = new int[n];
        max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(str[i]);
            max = Math.max(arr[i], max);
        }
        min = 0;

        while (min < max) {
            long cnt = 0;

            mid = (min + max) / 2;

            for (int i = 0; i < n; i++) {
                if (arr[i] - mid > 0) {
                    cnt += arr[i] - mid;
                }
            }

            if (cnt < m) {
                max = mid;
            } else {
                min = mid + 1;
            }
        }

        System.out.println(min-1);
    }
}