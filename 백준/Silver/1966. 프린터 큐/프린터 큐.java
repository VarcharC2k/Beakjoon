import java.io.*;
import java.util.*;

class Main {
    public static int t, n, m;

    public static Queue<Print> q;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        t = Integer.parseInt(st.nextToken());

        for (int i = 0; i < t; i++) {
            st = new StringTokenizer(br.readLine());
            n = Integer.parseInt(st.nextToken());
            m = Integer.parseInt(st.nextToken());

            q = new LinkedList();
            st = new StringTokenizer(br.readLine());
            int temp = 0;
            while (st.hasMoreTokens()) {
                if (temp == m) {
                    q.add(new Print(Integer.parseInt(st.nextToken()), true));
                } else {
                    q.add(new Print(Integer.parseInt(st.nextToken()), false));
                }
                temp++;
            }

            int seq = 1;
            Print max = Collections.max(q);
            boolean check = true;
            while (check) {
                Print print = q.peek();
                if (print.num == max.num) {
                    if (print.target) {
                        System.out.println(seq);
                        check = false;
                    } else {
                        q.poll();
                        max = Collections.max(q);
                        seq++;
                    }
                } else {
                    q.add(q.poll());
                }
            }
        }
    }

    static class Print implements Comparable<Print> {
        public int num;
        public boolean target;

        public Print(int num, boolean target) {
            this.num = num;
            this.target = target;
        }

        @Override
        public int compareTo(Print o1) {
            return Integer.compare(this.num, o1.num);
        }
    }
}