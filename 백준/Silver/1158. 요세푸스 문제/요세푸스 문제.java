import java.io.*;
import java.util.*;

class Main{
    public static int n, m;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        Queue q = new LinkedList();

        for (int i = 1; i <= n; i++) {
            q.add(i);
        }

        StringBuilder sb = new StringBuilder();
        sb.append("<");
        while (!q.isEmpty()) {
            for (int i = 1; i < m; i++) {
                q.add(q.poll());
            }
            sb.append(q.poll()).append(", ");
        }

        sb.replace(sb.length() - 2, sb.length(), "");
        sb.append(">");
        System.out.println(sb);
    }
}