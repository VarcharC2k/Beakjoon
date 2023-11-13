import java.io.*;
import java.util.*;

class Main{
    public static int n;
    public static Integer[] arr;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr = new Integer[n+1];

        arr[0] = 0;
        arr[1] = 1;
        if (n > 1) {
            arr[2] = 2;
        }

        System.out.println(cal(n));
    }

    public static int cal(int a) {
        if (arr[a] != null) {
            return arr[a];
        }

        arr[a] = (cal(a - 1) + cal(a - 2)) % 15746;
        return arr[a];
    }
}