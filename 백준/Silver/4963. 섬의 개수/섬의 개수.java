import java.io.*;
import java.util.*;

class Main{
    public static int n, m;
    public static int[][] arr;
    public static boolean[][] visit;
    public static String[] str;
    public static StringBuilder sb = new StringBuilder();
    public static int[] dx = {-1, -1, -1, 0, 0, 1, 1, 1};
    public static int[] dy = {-1, 0, 1, -1, 1, -1, 0, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            str = br.readLine().split(" ");
            m = Integer.parseInt(str[0]);
            n = Integer.parseInt(str[1]);
            if(n == 0 && m == 0) break;

            arr = new int[n][m];
            visit = new boolean[n][m];

            for (int i = 0; i < n; i++) {
                str = br.readLine().split(" ");
                for (int j = 0; j < m; j++) {
                    arr[i][j] = Integer.parseInt(str[j]);
                }
            }

            int cnt = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (!visit[i][j] && arr[i][j] == 1) {
                        bfs(new Map(i, j));
                        cnt++;
                    }
                }
            }
            sb.append(cnt).append("\n");

        }

        System.out.println(sb);
    }

    public static void bfs(Map node) {
        Queue<Map> q = new LinkedList<>();
        visit[node.x][node.y] = true;
        q.add(node);

        while (!q.isEmpty()) {
            Map temp = q.poll();

            for (int i = 0; i < 8; i++) {
                int nx = temp.x + dx[i];
                int ny = temp.y + dy[i];

                if(nx < 0 || ny < 0 || nx >= n || ny >= m) continue;

                if (!visit[nx][ny] && arr[nx][ny] == 1) {
                    q.add(new Map(nx, ny));
                    visit[nx][ny] = true;
                }
            }
        }

    }
}

class Map {
    int x;
    int y;

    public Map(int x, int y) {
        this.x = x;
        this.y = y;
    }
}