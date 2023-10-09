import java.io.*;
import java.util.*;

class Main{
    public static int n,last;
    public static StringTokenizer st;
    public static String s;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        Queue<Integer> arr = new LinkedList<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            s = st.nextToken();
            if (s.equals("push")) {
                last = Integer.parseInt(st.nextToken());
                arr.offer(last);
            } else if (s.equals("pop")) {
                if (arr.isEmpty()) {
                    sb.append(-1).append("\n");
                } else {
                    sb.append(arr.poll()).append("\n");
                }
            } else if (s.equals("size")) {
                sb.append(arr.size()).append("\n");
            } else if (s.equals("empty")) {
                if (arr.isEmpty()) {
                    sb.append(1).append("\n");
                } else {
                    sb.append(0).append("\n");
                }
            } else if (s.equals("front")) {
                if (arr.isEmpty()) {
                    sb.append(-1).append("\n");
                } else {
                    sb.append(arr.peek()).append("\n");
                }
            } else {
                if (arr.isEmpty()) {
                    sb.append(-1).append("\n");
                } else {
                    sb.append(last).append("\n");
                }
            }
        }

        System.out.println(sb.toString());
    }
}