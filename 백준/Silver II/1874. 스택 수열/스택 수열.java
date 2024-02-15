import java.io.*;
import java.util.*;

class Main{
    public static int n;
    public static StringBuilder sb = new StringBuilder();
    public static Stack<Integer> arr = new Stack<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        int st = 0;
        for (int i = 0; i < n; i++) {
            int temp = Integer.parseInt(br.readLine());

            if (temp > st) {
                for (int j = st + 1; j <= temp; j++) {
                    arr.push(j);
                    sb.append("+").append("\n");
                }
                st = temp;
            }

            if (arr.pop() == temp) {
                sb.append("-").append("\n");
            } else {
                sb = new StringBuilder();
                sb.append("NO");
                break;
            }

        }

        System.out.println(sb);
    }
}