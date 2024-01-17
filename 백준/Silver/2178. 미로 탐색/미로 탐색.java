import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.*;

class Main{
    public static int n, m;
    public static int[][] arr;
    public static boolean[][] visited;
    public static String[] str;
    public static int[] dx = {1, -1, 0, 0};
    public static int[] dy = {0, 0, 1, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        str = br.readLine().split(" ");
        n = Integer.parseInt(str[0]);
        m = Integer.parseInt(str[1]);
        arr = new int[n][m];
        visited = new boolean[n][m];
        for (int i = 0; i < n; i++) {
            str = br.readLine().split("");
            for (int j = 0; j < m; j++) {
                arr[i][j] = Integer.parseInt(str[j]);
            }
        }

        bfs(0, 0);
        System.out.println(arr[n-1][m-1]);
    }

    public static void bfs(int x, int y) {
        Queue<Point> q = new LinkedList<>();
        visited[x][y] = true;
        q.add(new Point(x, y));

        while (!q.isEmpty()) {
            Point tempp = q.poll();
            for (int i = 0; i < 4; i++) {
                int nextx = tempp.x + dx[i];
                int nexty = tempp.y + dy[i];

                if (nextx < 0 || nexty < 0 || nextx >= n || nexty >= m) {
                    continue;
                } else {
                    if (arr[nextx][nexty] == 1 && !visited[nextx][nexty]) {
                        q.add(new Point(nextx, nexty));
                        arr[nextx][nexty] = arr[tempp.x][tempp.y] + 1;
                        visited[nextx][nexty] = true;
                    }
                }
            }
        }
    }

}
class Point{
    int x;
    int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
