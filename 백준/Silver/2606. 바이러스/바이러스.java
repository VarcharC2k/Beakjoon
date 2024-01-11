import java.io.*;
import java.util.*;

class Main{
    public static int n, m, start, end;
    public static ArrayList<ArrayList<Integer>> arr;
    public static boolean[] checked;
    public static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        m = Integer.parseInt(br.readLine());

        arr = new ArrayList<>();
        checked = new boolean[n + 1];

        for (int i = 0; i <= n; i++) {
            arr.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            start = Integer.parseInt(st.nextToken());
            end = Integer.parseInt(st.nextToken());

            arr.get(start).add(end);
            arr.get(end).add(start);
        }

        bfs(1);
        int cnt = 0;
        for (boolean b : checked) {
            if (b) {
                cnt++;
            }
        }

        System.out.println(cnt-1);
    }

    public static void bfs(int node) {
        Queue<Integer> q = new LinkedList<>();
        checked[node] = true;
        q.add(node);

        while (!q.isEmpty()) {
            int temp = q.poll();

            for (int i = 0; i < arr.get(temp).size(); i++) {
                int next = arr.get(temp).get(i);

                if (!checked[next]) {
                    q.add(next);
                    checked[next] = true;
                }
            }
        }
    }
}