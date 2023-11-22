import java.io.*;
import java.util.*;

class Main{
    public static int n;
    public static String s;
    public static String[] str;
    public static Integer[] arr;
    public static StringBuilder sb;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        s = br.readLine();
        n = Integer.parseInt(br.readLine());
        sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            arr = new Integer[s.length()];
            str = br.readLine().split(" ");
            String c = str[0];
            if (s.charAt(0) == c.charAt(0)) {
                arr[0] = 1;
            } else {
                arr[0] = 0;
            }

            if (Integer.parseInt(str[1]) == 0) {
                sb.append(findChar(Integer.parseInt(str[2]), c.charAt(0))).append("\n");
            } else {
                sb.append(findChar(Integer.parseInt(str[2]), c.charAt(0)) - findChar(Integer.parseInt(str[1]) - 1, c.charAt(0))).append("\n");
            }
        }
        System.out.println(sb);
    }

    public static int findChar(int a, char c) {
        if (arr[a] == null) {
            if (s.charAt(a) == c) {
                arr[a] = findChar(a - 1, c) + 1;
            } else {
                arr[a] = findChar(a - 1, c);
            }
            return arr[a];
        }

        return arr[a];
    }
}