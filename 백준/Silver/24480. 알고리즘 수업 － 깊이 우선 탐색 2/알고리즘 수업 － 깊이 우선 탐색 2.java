import javax.swing.*;
import java.io.*;
import java.util.*;

class Main{
    public static int n,m, r, cnt;
    public static int[] checked;
    public static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    public static StringBuilder sb;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        r = Integer.parseInt(st.nextToken());

        checked = new int[n + 1];

        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<Integer>());
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int fn = Integer.parseInt(st.nextToken());
            int tn = Integer.parseInt(st.nextToken());

            graph.get(fn).add(tn);
            graph.get(tn).add(fn);
        }

        for (ArrayList<Integer> arrayList : graph) {
            Collections.sort(arrayList, Collections.reverseOrder());
        }

        sb = new StringBuilder();
        cnt = 1;
        dfs(r);
        for (int i = 1; i < checked.length; i++) {
            sb.append(checked[i]).append("\n");
        }

        System.out.println(sb);
    }

    public static void dfs(int root) {
        checked[root] = cnt;

        for (int i = 0; i < graph.get(root).size(); i++) {
            int node = graph.get(root).get(i);
            if (checked[node] == 0) {
                cnt++;
                checked[node] = cnt;
                dfs(node);
            }
        }
    }
}