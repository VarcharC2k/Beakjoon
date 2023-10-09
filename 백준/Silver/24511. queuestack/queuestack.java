import java.io.*;
import java.util.*;

class Main{
    public static int n,k;
    public static String s;
    public static String[] str, std, input;
    public static StringBuilder sb = new StringBuilder();
    public static StringTokenizer st;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        str = br.readLine().split(" ");
        Deque<Integer> arr = new ArrayDeque<>();
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            if (str[i].equals("0")) {
                arr.offerLast(Integer.parseInt(st.nextToken()));
            } else {
                st.nextToken();
            }
        }

        k = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < k; i++) {
            if (arr.isEmpty()) {
                sb.append(st.nextToken()).append(" ");
            } else {
                arr.offerFirst(Integer.parseInt(st.nextToken()));
                sb.append(arr.pollLast()).append(" ");
            }
        }

        System.out.println(sb.toString());
    }
}