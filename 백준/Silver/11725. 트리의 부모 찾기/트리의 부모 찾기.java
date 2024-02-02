import java.io.*;
import java.util.*;

class Main{
    public static int n;
    public static String[] str;
    public static ArrayList<ArrayList<Integer>> arr;
    public static boolean[] visit;
    public static int[] parent;
    public static StringBuilder sb;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr = new ArrayList<>();

        for (int i = 0; i <= n; i++) {
            arr.add(new ArrayList<>());
        }

        for (int i = 1; i < n; i++) {
            str = br.readLine().split(" ");
            int a = Integer.parseInt(str[0]);
            int b = Integer.parseInt(str[1]);

            arr.get(a).add(b);
            arr.get(b).add(a);
        }

        visit = new boolean[n + 1];
        parent = new int[n + 1];

        sb = new StringBuilder();
        bfs(1);
        for (int i = 2; i < parent.length; i++) {
            sb.append(parent[i]).append("\n");
        }
        System.out.println(sb);
    }

    public static void bfs(int node) {
        Queue<Integer> q = new LinkedList<>();
        q.add(node);
        visit[node] = true;

        while (!q.isEmpty()) {
            int temp = q.poll();
            ArrayList<Integer> ary = arr.get(temp);

            for (int i = 0; i < ary.size(); i++) {
                int next = ary.get(i);
                if (!visit[next]) {
                    q.add(next);
                    visit[next] = true;
                    parent[next] = temp;
                }
            }
        }
    }
}