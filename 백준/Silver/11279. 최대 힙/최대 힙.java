import java.io.*;
import java.nio.Buffer;
import java.util.*;

class Main {

    public static int n;
    public static StringBuilder sb;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> d = new PriorityQueue<>(Collections.reverseOrder());
        sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            int m = Integer.parseInt(br.readLine());
            if (m == 0) {
                if (d.isEmpty()) {
                    sb.append(0).append("\n");
                } else {
                    sb.append(d.poll()).append("\n");
                }
            } else {
                d.add(m);
            }
        }

        System.out.println(sb);
    }
}