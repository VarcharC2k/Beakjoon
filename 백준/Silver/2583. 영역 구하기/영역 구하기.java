import java.io.*;
import java.util.*;

class Main {
    public static int n,m, k;
    public static String[] str;
    public static boolean[][] arr;
    public static ArrayList<Integer> result = new ArrayList<>();
    public static int[] dx = {1, -1, 0, 0};
    public static int[] dy = {0, 0, 1, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        str = br.readLine().split(" ");
        n = Integer.parseInt(str[0]);
        m = Integer.parseInt(str[1]);
        k = Integer.parseInt(str[2]);

        arr = new boolean[m][n];
        for (int i = 0; i < k; i++) {
            str = br.readLine().split(" ");
            int stx = Integer.parseInt(str[0]);
            int sty = Integer.parseInt(str[1]);
            int endx = Integer.parseInt(str[2]);
            int endy = Integer.parseInt(str[3]);

            for (int x = stx; x < endx; x++) {
                for (int y = sty; y < endy; y++) {
                    if (!arr[x][y]) {
                        arr[x][y] = true;
                    }
                }
            }
        }

        int cnt = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (!arr[i][j]) {
                    bfs(new Map(i, j));
                    cnt++;
                }
            }
        }

        Collections.sort(result);
        StringBuilder sb = new StringBuilder();
        for (int num : result) {
            sb.append(num).append("\n");
        }
        System.out.println(cnt);
        System.out.println(sb);
    }

    public static void bfs(Map node) {
        Queue<Map> q = new LinkedList<>();
        q.offer(node);
        arr[node.x][node.y] = true;
        int cnt = 0;

        while (!q.isEmpty()) {
            Map temp = q.poll();
            for (int i = 0; i < 4; i++) {
                int nextx = temp.x + dx[i];
                int nexty = temp.y + dy[i];
                if(nextx < 0 || nexty < 0|| nextx >= m || nexty >= n) continue;
                if (!arr[nextx][nexty]) {
                    arr[nextx][nexty] = true;
                    q.offer(new Map(nextx, nexty));
                }
            }
            cnt++;
        }
        result.add(cnt);
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
