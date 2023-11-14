import java.io.*;
import java.util.*;

class Main{
    public static long n, result;
    public static int cnt;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Long.parseLong(br.readLine());
        result = 0;
        cnt = 0;
        for (int i = 1; ; i++) {
            if (result > n) {
                break;
            }
            result += i;
            cnt++;
        }
        System.out.println(cnt-1);
    }
}
