import java.io.*;
import java.util.*;

class Main{
    public static int n, m;
    public static int[] arr;
    public static int[] dx = {-1,1,2};


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        n = Integer.parseInt(str[0]);
        m = Integer.parseInt(str[1]);
        arr = new int[100001];

        bfs(n);
        System.out.println(arr[m]-1);
    }

    static void bfs(int x) {
        Queue<Integer> q = new LinkedList<>();
        q.add(x);
        arr[x] = 1;

        while (!q.isEmpty()) {
            int temp = q.poll();
            if (temp == m) {
                return;
            }
            int next;
            for (int i = 0; i < 3; i++) {
                if (dx[i] > 1) {
                    next = temp * dx[i];
                } else {
                    next = temp + dx[i];
                }

                if (next < 0 || next > 100000) {
                    continue;
                }else if(arr[next] == 0) {
                    arr[next] = arr[temp] + 1;
                    q.add(next);
                }

            }
        }
    }
}