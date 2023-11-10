import java.io.*;
import java.util.*;

class Main{
    public static int n, result;
    public static Integer[] arr;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr = new Integer[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr, Collections.reverseOrder());
        result = 0;

        for (int i = 0; i < n; i++) {
            result = Math.max(result, arr[i] * (i + 1));
        }

        System.out.println(result);
    }
}