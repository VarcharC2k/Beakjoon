import java.io.*;
import java.util.*;

class Main{
    public static int n, cnt;
    public static int[][] arr;
    public static boolean[][] checked;
    public static String[] str;
    public static int[] dx = {1, -1, 0, 0};
    public static int[] dy = {0, 0, 1, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr = new int[n][n];
        checked = new boolean[n][n];
        cnt = 0;
        ArrayList result = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            str = br.readLine().split("");
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(str[j]);
            }
        }

        for (int x = 0; x < n; x++) {
            for (int y = 0; y < n; y++) {
                if (arr[x][y] == 1 && !checked[x][y]) {
                    dfs(x, y);
                    result.add(cnt);
                    cnt = 0;
                }
            }
        }

        Collections.sort(result);
        StringBuilder sb = new StringBuilder();
        sb.append(result.size()).append("\n");
        for (Object o : result) {
            sb.append(o.toString()).append("\n");
        }

        System.out.println(sb);
    }

    public static void dfs(int x, int y) {
        checked[x][y] = true;
        cnt++;

        for (int i = 0; i < 4; i++) {
            int newx = dx[i] + x;
            int newy = dy[i] + y;
            if (newx < 0 || newy < 0 || newx >= n || newy >= n) {
                continue;
            } else {
                if (!checked[newx][newy] && arr[newx][newy] == 1) {
                    dfs(newx,newy);
                }
            }
        }
    }
}