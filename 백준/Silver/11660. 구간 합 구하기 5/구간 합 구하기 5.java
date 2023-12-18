import java.io.*;
import java.util.*;

class Main{
    public static int n, m,x,y,xend, yend;
    public static String[] str;
    public static int[][] arr;
    public static StringBuilder sb;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        str = br.readLine().split(" ");
        n = Integer.parseInt(str[0]);
        m = Integer.parseInt(str[1]);
        arr = new int[n+1][n+1];

        for (int i = 1; i <= n; i++) {
            str = br.readLine().split(" ");
            for (int j = 0; j < n; j++) {
                arr[i][j+1] = Integer.parseInt(str[j]) + arr[i][j];
            }
        }

        sb = new StringBuilder();

        for (int i = 0; i < m; i++) {
            str = br.readLine().split(" ");
            x = Integer.parseInt(str[1]);
            y = Integer.parseInt(str[0]);
            xend = Integer.parseInt(str[3]);
            yend = Integer.parseInt(str[2]);

            cal(y, x, yend, xend);
        }

        System.out.println(sb);
    }

    public static void cal(int a, int b, int ae, int be) {
        int temp = 0;

        for (int i = a; i <= ae; i++) {
            temp += arr[i][be] - arr[i][b - 1];
        }
        sb.append(temp).append("\n");
    }

}