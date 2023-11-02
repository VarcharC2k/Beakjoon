import java.io.*;
import java.util.*;

class Main {
    public static int n, size;
    public static String[][] star;
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        size = n * 4 - 3;
        star = new String[size][size];
        for (int i = 0; i < size; i++) {
            Arrays.fill(star[i], " ");
        }
        setStar(0, size);

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                sb.append(star[i][j]);
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }

    public static void setStar(int a, int len) {
        if (a > len) {
            return;
        }

        for (int i = a; i < len; i++) {
            star[a][i] = "*";
            star[len - 1][i] = "*";
            star[i][a] = "*";
            star[i][len - 1] = "*";
        }

        setStar(a + 2, len - 2);
    }
}