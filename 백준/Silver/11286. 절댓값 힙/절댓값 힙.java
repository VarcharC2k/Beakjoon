import java.io.*;
import java.nio.Buffer;
import java.util.Comparator;
import java.util.PriorityQueue;

class Main {
    public static int n;
    public static StringBuilder sb;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> arr = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                int a1 = Math.abs(o1);
                int a2 = Math.abs(o2);
                return a1 == a2 ? o1 - o2 : a1 - a2;
            }
        });

        sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            int temp = Integer.parseInt(br.readLine());
            if (temp == 0) {
                if (arr.isEmpty()) {
                    sb.append(0).append("\n");
                } else {
                    sb.append(arr.poll()).append("\n");
                }
            } else {
                arr.add(temp);
            }
        }

        System.out.println(sb);
    }
}
