import java.io.*;
import java.util.*;

class Main{
    public static int n, m, sx,sy,ex, ey;
    public static String[] str;
    public static int[][] arr;
    public static int[] dx = {-1, -1, 1, 1, -2, -2, 2, 2};
    public static int[] dy = {-2, 2, -2, 2, -1, 1, -1, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            m = Integer.parseInt(br.readLine());
            arr = new int[m][m];
            str = br.readLine().split(" ");
            sx = Integer.parseInt(str[0]);
            sy = Integer.parseInt(str[1]);
            str = br.readLine().split(" ");
            ex = Integer.parseInt(str[0]);
            ey = Integer.parseInt(str[1]);

            int result = bfs(sx, sy);
            System.out.println(result);
        }


    }
    public static int bfs(int x, int y){
        Queue<Knight> q = new LinkedList<>();
        q.add(new Knight(x, y));
        arr[x][y] = 1;

        while (!q.isEmpty()) {
            Knight k = q.poll();
            if (k.x == ex && k.y == ey) {
                return arr[k.x][k.y]-1;
                
            }

            for (int i = 0; i < 8; i++) {
                int nx = k.x + dx[i];
                int ny = k.y + dy[i];
                if (check(nx, ny)) {
                    arr[nx][ny] = arr[k.x][k.y] + 1;
                    q.offer(new Knight(nx, ny));
                }
            }
        }
        return -1;
    }

    public static boolean check(int x, int y) {
        if (x < 0 || y < 0 || x >= m || y >= m) {
            return false;
        } else{
            if (arr[x][y] == 0) {
                return true;
            }
        }
        return false;
    }

}
class Knight{
    int x;
    int y;

    public Knight(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
