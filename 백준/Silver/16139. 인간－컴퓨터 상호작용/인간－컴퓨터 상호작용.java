import java.io.*;
import java.util.*;

class Main{
    public static int n,st,end;
    public static String s;
    public static String[] str;
    public static int[][] arr;
    public static StringBuilder sb;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        s = br.readLine();
        n = Integer.parseInt(br.readLine());
        sb = new StringBuilder();
        arr = new int[s.length()][26];

        arr[0][s.charAt(0) - 'a']++;

        for (int i = 1; i < s.length(); i++) {
            int tmp = s.charAt(i) - 'a';

            for (int j = 0; j < 26; j++) {
                arr[i][j] = arr[i - 1][j];
            }
            arr[i][tmp]++;
        }

        sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            str = br.readLine().split(" ");
            char c = str[0].charAt(0);
            st = Integer.parseInt(str[1]);
            end = Integer.parseInt(str[2]);

            if (st == 0) {
                sb.append(arr[end][c - 'a']).append("\n");
            } else {
                sb.append(arr[end][c - 'a'] - arr[st - 1][c - 'a']).append("\n");
            }
        }

        System.out.println(sb);
    }

}