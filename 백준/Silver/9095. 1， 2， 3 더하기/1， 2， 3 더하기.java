import java.io.*;
import java.util.*;

class Main{
    public static int n,m;
    public static Integer[] arr;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr = new Integer[12];
        arr[1] = 1;
        arr[2] = 2;
        arr[3] = 4;

        for (int i = 0; i < n; i++) {
            m = Integer.parseInt(br.readLine());
            System.out.println(cal(m));
        }

    }

    public static int cal(int a) {
        if (arr[a] != null) {
            return arr[a];
        }

        arr[a] = cal(a - 1) + cal(a - 2) + cal(a - 3);
        return arr[a];
    }
}