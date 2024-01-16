import java.io.*;
import java.util.*;

class Main{
    public static int t,k,m, n, cnt;
    public static int[][] arr;
    public static boolean[][] checked;
    public static String[] str;
    public static int[] dx = {1, -1, 0, 0};
    public static int[] dy = {0, 0, 1, -1};
    public static StringBuilder sb;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        t = Integer.parseInt(br.readLine());
        sb = new StringBuilder();

        while(t--> 0) {
            str = br.readLine().split(" ");
            n = Integer.parseInt(str[0]);
            m = Integer.parseInt(str[1]);
            k = Integer.parseInt(str[2]);

            arr = new int[n][m];
            checked = new boolean[n][m];

            for (int i = 0; i < k; i++) {
                str = br.readLine().split(" ");
                int x = Integer.parseInt(str[0]);
                int y = Integer.parseInt(str[1]);
                arr[x][y] = 1;
            }

            cnt = 0;

            for (int x = 0; x < n; x++) {
                for (int y = 0; y < m; y++) {
                    if (arr[x][y] == 1 && !checked[x][y]) {
                        cnt++;
                        dfs(x, y);
                    }
                }
            }
            sb.append(cnt).append("\n");

        }
        System.out.println(sb);


    }
    public static void dfs(int x, int y){
        checked[x][y] = true;

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx >= 0 && ny >= 0 && nx < n && ny < m) {
                if (arr[nx][ny] == 1 && !checked[nx][ny]) {
                    dfs(nx,ny);
                }
            }
        }
    }
}
