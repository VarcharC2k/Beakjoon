import java.io.*;
import java.util.*;

class Main{
    public static int n,m,r,start, end, cnt;
    public static ArrayList<ArrayList<Integer>> arr;
    public static Integer[] checked;
    public static StringBuilder sb;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        r = Integer.parseInt(st.nextToken());

        arr = new ArrayList<>();
        checked = new Integer[n + 1];
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

        for (int i = 1; i <= n; i++) {
            Collections.sort(arr.get(i));
        }

        sb = new StringBuilder();
        cnt = 1;
        dfs(r);
        sb.append("\n");
        bfs(r);

        System.out.println(sb);
    }

    public static void dfs(int node) {
        checked[node] = node;
        sb.append(node).append(" ");

        for (int i = 0; i < arr.get(node).size(); i++) {
            int temp = arr.get(node).get(i);

            if (checked[temp] == null) {
                dfs(temp);
            }
        }
    }

    public static void bfs(int node) {
        Queue<Integer> q = new LinkedList<>();
        checked = new Integer[n + 1];
        checked[node] = node;
        sb.append(node).append(" ");
        q.add(node);


        while (!q.isEmpty()) {
            int temp = q.poll();

            for (int i = 0; i < arr.get(temp).size(); i++) {
                int next = arr.get(temp).get(i);

                if (checked[next] == null) {
                    q.add(next);
                    checked[next] = next;
                    sb.append(next).append(" ");
                }
            }
        }
    }
}