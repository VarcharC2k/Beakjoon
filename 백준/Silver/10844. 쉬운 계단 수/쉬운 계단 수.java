import java.io.*;
import java.util.*;

class Main{
    public static int n;
    public static Long[][] arr;
    public static long result,mod = 1000000000;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr = new Long[n+1][10];

        for (int i = 0; i < 10; i++) {
            arr[1][i] = (long) 1;
        }

        for (int i = 1; i < 10; i++) {
            cal(n, i);
        }

        result = 0;
        for (int i = 1; i < 10; i++) {
            result += arr[n][i];
        }

        System.out.println(result % mod);
    }

    public static long cal(int a, int b) {
        if (a < 0) {
            return 0;
        }
        if (arr[a][b] == null) {
            if (b == 9) {
                arr[a][b] = cal(a - 1, 8) % mod;
            } else if (b == 0) {
                arr[a][b] = cal(a - 1, 1) % mod;
            } else {
                arr[a][b] = (cal(a - 1, b - 1) + cal(a - 1, b + 1)) % mod;
            }
        }
        return arr[a][b];
    }
}