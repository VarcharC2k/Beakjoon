import java.io.*;
import java.util.*;

class Main{
    public static int n,m;
    public static String[] str;
    public static int[] arr, bt;
    public static boolean[] isVisit;
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        str = br.readLine().split(" ");
        n = Integer.parseInt(str[0]);
        m = Integer.parseInt(str[1]);
        str = br.readLine().split(" ");

        isVisit = new boolean[n];
        arr = new int[n];
        bt = new int[m];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }
        Arrays.sort(arr);
        dfs(0);
        System.out.println(sb);
    }

    public static void dfs(int depth) {
        if (depth == m) {
            for (int num : bt) {
                sb.append(num).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i = 0; i < n; i++) {
            if (!isVisit[i]) {
                bt[depth] = arr[i];
                isVisit[i] = true;
                dfs(depth+1);
                isVisit[i] = false;
            }
        }
    }
}