import java.io.*;
import java.nio.Buffer;
import java.util.*;

class Main{
    public static int n,k;
    public static StringBuilder sb = new StringBuilder();
    static boolean[] check;
    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        n = Integer.parseInt(str[0]);
        k = Integer.parseInt(str[1]);

        arr = new int[k];
        check = new boolean[n];
        dfs(0);
        System.out.println(sb.toString());
    }

    public static void dfs(int depth) {
        if (k == depth) {
            for (int num : arr) {
                sb.append(num).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i = 0; i < n; i++) {
            if (!check[i]) {
                check[i] = true;
                arr[depth] = i + 1;
                dfs(depth + 1);
                check[i] = false;
            }
        }
    }

}