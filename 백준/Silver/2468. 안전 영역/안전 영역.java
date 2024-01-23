import java.io.*;
import java.util.*;

class Main{
    public static int n;
    public static int[][] arr;
    public static boolean[][] visit;
    public static String[] str;
    public static int[] dx = {1, -1, 0, 0};
    public static int[] dy = {0, 0, 1, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr = new int[n][n];


        for (int i = 0; i < n; i++) {
            str = br.readLine().split(" ");
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(str[j]);
            }
        }

        int result = 0;
        for (int i = 0; i < 101; i++) {
            result = Math.max(result,maxCnt(i));
        }

        System.out.println(result);
    }

    public static int maxCnt(int water) {
        int cnt = 0;
        visit = new boolean[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (!visit[i][j] && arr[i][j] > water) {
                    bfs(new Resion(i, j),water);
                    cnt++;
                }
            }
        }

        return cnt;
    }

    public static void bfs(Resion node, int water) {
        Queue<Resion> q = new LinkedList<>();
        q.offer(node);
        visit[node.x][node.y] = true;

        while (!q.isEmpty()) {
            Resion temp = q.poll();

            for (int i = 0; i < 4; i++) {
                int nextx = temp.x + dx[i];
                int nexty = temp.y + dy[i];

                if (nextx < 0 || nexty < 0 || nextx >= n || nexty >= n) {
                    continue;
                }

                if (!visit[nextx][nexty] && arr[nextx][nexty] > water) {
                    visit[nextx][nexty] = true;
                    q.offer(new Resion(nextx, nexty));
                }
            }
        }
    }
}

class Resion{
    int x;
    int y;

    public Resion(int x, int y) {
        this.x = x;
        this.y = y;
    }
}