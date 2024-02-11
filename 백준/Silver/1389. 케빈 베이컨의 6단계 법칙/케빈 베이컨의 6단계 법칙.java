    import java.io.*;
    import java.util.*;

    class Main {
        public static int n,m, min, result;
        public static String[] str;
        public static ArrayList<ArrayList<Integer>> arr;

        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            str = br.readLine().split(" ");
            n = Integer.parseInt(str[0]);
            m = Integer.parseInt(str[1]);
            arr = new ArrayList<>();

            for (int i = 0; i <= n; i++) {
                arr.add(new ArrayList<>());
            }

            for (int i = 0; i < m; i++) {
                str = br.readLine().split(" ");
                int st = Integer.parseInt(str[0]);
                int end = Integer.parseInt(str[1]);
                arr.get(st).add(end);
                arr.get(end).add(st);
            }
            min = Integer.MAX_VALUE;
            result = 0;
            for (int i = 1; i <= n; i++) {
                bfs(i);
            }

            System.out.println(result);
        }

        public static void bfs(int node) {
            Queue<Cavin> q = new LinkedList<>();
            q.offer(new Cavin(node, 0));
            int cnt = 0;
            boolean[] visit = new boolean[n + 1];
            visit[node] = true;

            while (!q.isEmpty()) {
                Cavin temp = q.poll();
                for (int next : arr.get(temp.idx)) {
                    if (!visit[next]) {
                        cnt += temp.number + 1;
                        visit[next] = true;
                        q.offer(new Cavin(next, temp.number + 1));
                    }
                }
            }

            if (min > cnt) {
                min = cnt;
                result = node;
            }
        }
    }

    class Cavin {
        int idx;
        int number;

        public Cavin(int idx, int number) {
            this.idx = idx;
            this.number = number;
        }
    }
