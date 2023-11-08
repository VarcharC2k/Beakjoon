import java.io.*;
import java.util.*;

class Main{
    public static int n,m;
    public static String[] str;
    public static int[] arr;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        str = br.readLine().split(" ");
        n = Integer.parseInt(str[0]);
        m = Integer.parseInt(str[1]);
        str = br.readLine().split(" ");
        arr = new int[str.length + 1];
        arr[0] = 0;

        for (int i = 1; i <= str.length; i++) {
            arr[i] = Integer.parseInt(str[i-1]) + arr[i - 1];
        }

        for (int i = 0; i < m; i++) {
            str = br.readLine().split(" ");
            System.out.println(arr[Integer.parseInt(str[1])] - arr[Integer.parseInt(str[0])-1]);
        }

    }
}