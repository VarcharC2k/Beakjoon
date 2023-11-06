import java.io.*;
import java.util.*;

class Main{
    public static int n;
    public static StringBuilder sb;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        System.out.println((int) Math.pow(2, n) - 1);
        sb = new StringBuilder();
        move(n,1,2,3);
        System.out.println(sb);
    }

    public static void move(int a, int st, int mid, int end) {
        if (a == 1) {
            sb.append(st + " " + end).append("\n");
            return;
        }

        move(a - 1, st, end, mid);
        sb.append(st + " " + end).append("\n");
        move(a - 1, mid, st, end);
    }
}