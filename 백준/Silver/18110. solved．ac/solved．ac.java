import java.io.*;
import java.util.*;

class Main{
    public static int n, avg, result, cnt;
    public static Integer[] arr;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        avg = (int) Math.round(n * 0.15);
        arr = new Integer[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);
        result = 0;
        cnt = 0;

        for (int i = avg; i < n - avg; i++) {
            result += arr[i];
            cnt++;
        }

        double avg = (double) result / cnt;
        System.out.println(Math.round(avg));
    }
}