import java.io.*;
import java.lang.reflect.Array;
import java.util.*;
class Main{
    public static int n,m, r, start, end;
    public static ArrayList<ArrayList<Integer>> arr;
    public static StringTokenizer st;
    public static boolean[] checked;
    public static int[] result;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        r = Integer.parseInt(st.nextToken());
        arr = new ArrayList<>();
        checked = new boolean[n + 1];
        result = new int[n + 1];

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
            Collections.sort(arr.get(i), Collections.reverseOrder());
        }

        bfs(r);

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            sb.append(result[i]).append("\n");
        }
        System.out.println(sb);
    }

    public static void bfs(int node) {
        Queue<Integer> q = new LinkedList<>();
        checked[node] = true;
        int cnt = 1;
        result[node] = cnt++;
        q.add(node);

        while (!q.isEmpty()) {
            int temp = q.poll();

            for (int i = 0; i < arr.get(temp).size(); i++) {
                if (!checked[arr.get(temp).get(i)]) {
                    int next = arr.get(temp).get(i);
                    q.add(next);
                    checked[next] = true;
                    result[next] = cnt++;
                }
            }
        }
    }
}