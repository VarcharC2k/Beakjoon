import java.io.*;
import java.util.*;

class Main{
    public static int a,b,c,result;
    public static int[][][] arr;
    public static StringTokenizer st;
    public static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        arr = new int[51][51][51];

        while (true) {
            st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            c = Integer.parseInt(st.nextToken());
            if (a == -1 && b == -1 && c == -1) {
                break;
            }
            sb.append("w(" + a + ", " + b + ", " + c + ") = " + w(a, b, c)).append("\n");
        }
            System.out.println(sb.toString());
    }

    public static int w(int a, int b, int c) {
        a = check(a);
        b = check(b);
        c = check(c);
        if (arr[a][b][c] == 0) {
            if (a <= 0 || b <= 0 || c <= 0) {
                arr[a][b][c] = 1;
                return 1;
            } else if (a > 20 || b > 20 || c > 20) {
                arr[a][b][c] = w(20, 20, 20);
            } else if (a < b && b < c) {
                arr[a][b][c] = w(a, b, c - 1) + w(a, b - 1, c - 1) - w(a, b - 1, c);
            } else{
                arr[a][b][c] = w(a - 1, b, c) + w(a - 1, b - 1, c) + w(a - 1, b, c - 1) - w(a - 1, b - 1, c - 1);
            }
            return arr[a][b][c];
        } else {
            return arr[a][b][c];
        }
    }

    public static int check(int n) {
        if (n < 0) {
            return 0;
        }
        return n;
    }
}