import java.io.*;
import java.util.*;

class Main{
    public static int n;
    public static char[][] arr;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        n = Integer.parseInt(br.readLine());
        arr = new char[n][n];

        star(0, 0, n, false);

        for (int i = 0; i < n; i++) {
            bw.write(arr[i]);
            bw.write("\n");
        }

        bw.flush();
        bw.close();

    }

    public static void star(int a, int b, int size, boolean blank) {
        if (blank) {
            for (int i = a; i < a + size; i++) {
                for (int j = b; j < b + size; j++) {
                    arr[i][j] = ' ';
                }
            }
            return;
        }

        if (size == 1) {
            arr[a][b] = '*';
            return;
        }

        int newSize = size / 3;
        int cnt = 0;
        for (int i = a; i < a + size; i += newSize) {
            for (int j = b; j < b + size; j += newSize) {
                cnt++;

                if (cnt == 5) {
                    star(i, j, newSize, true);
                } else {
                    star(i, j, newSize, false);
                }
            }
        }

    }

}