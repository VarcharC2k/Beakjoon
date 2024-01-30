import java.io.*;
import java.rmi.dgc.Lease;
import java.util.*;

class Main{
    public static int n, m;
    public static int[][] arr;
    public static int[] dx = {1, -1, 0, 0};
    public static int[] dy = {0, 0, 1, -1};
    public static String[] str;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        str = br.readLine().split(" ");
        n = Integer.parseInt(str[0]);
        m = Integer.parseInt(str[1]);

        arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            str = br.readLine().split(" ");
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(str[j]);
            }
        }

        int result = bfs();
        if (check()) {
            System.out.println(result-1);
        } else {
            System.out.println(-1);
        }
    }

    public static int bfs() {
        Queue<Map> q = new LinkedList<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == 1) {
                    q.add(new Map(i, j));
                }
            }
        }
        int cnt = 0;

        while (!q.isEmpty()) {
            ArrayList<Map> temp = new ArrayList<>();
            while (true) {
                if (!q.isEmpty()) {
                    temp.add(q.poll());
                } else {
                    break;
                }
            }

            for(Map nMap : temp) {
                for (int i = 0; i < 4; i++) {
                    int ndx = nMap.x + dx[i];
                    int ndy = nMap.y + dy[i];

                    if(ndx < 0 || ndy < 0 || ndx >= m || ndy >=n) continue;

                    if (arr[ndx][ndy] == 0) {
                        arr[ndx][ndy] = 1;
                        q.add(new Map(ndx, ndy));
                    }
                }
            }

            cnt++;
        }

        return cnt;
    }

    public static boolean check() {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == 0) {
                    return false;
                }
            }
        }

        return true;
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