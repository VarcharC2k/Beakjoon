import java.io.*;
import java.util.*;

class Main{
    public static int n, temp;
    public static long[] arr;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            temp = Integer.parseInt(br.readLine());
            arr = new long[temp];
            System.out.println(tri(temp-1));
        }
    }

    public static long tri(int a) {
        if (arr[a] == 0) {
            if (a < 3) {
                arr[a] = 1;
            } else {
                arr[a] = tri(a - 3) + tri(a - 2);
            }
            return arr[a];
        }
        return arr[a];
    }
}