import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

class Main{
    public static int n,m,st, end;
    public static ArrayList<ArrayList<Integer>> arr;
    public static String[] str;
    public static boolean[] visit;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        str = br.readLine().split(" ");
        n = Integer.parseInt(str[0]);
        m = Integer.parseInt(str[1]);
        arr = new ArrayList<>();
        visit = new boolean[n+1];

        for (int i = 0; i <= n; i++) {
            arr.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            str = br.readLine().split(" ");
            st = Integer.parseInt(str[0]);
            end = Integer.parseInt(str[1]);

            arr.get(st).add(end);
            arr.get(end).add(st);
        }

        int cnt = 0;
        for (int i = 1; i <= n; i++) {

            if (!visit[i]) {
                cnt++;
                bfs(i);
            }
        }

        System.out.println(cnt);

    }

    public static void bfs(int node) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(node);
        visit[node] = true;

        while (!q.isEmpty()) {
            int temp = q.poll();

            ArrayList<Integer> ary = arr.get(temp);
            for (int i = 0; i < ary.size(); i++) {
                int next = ary.get(i);
                if (!visit[next]) {
                    visit[next] = true;
                    q.offer(next);
                }
            }
        }
    }

}