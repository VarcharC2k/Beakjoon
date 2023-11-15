import java.io.*;
import java.util.*;

class Main{
    public static int n,m;
    public static int[] arr;
    public static String[] str;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr = new int[n];
        str = br.readLine().split(" ");

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }
        Arrays.sort(arr);

        m = Integer.parseInt(br.readLine());
        str = br.readLine().split(" ");

        for (String s : str) {
            System.out.println(findn(Integer.parseInt(s),0,n-1));
        }

    }

    public static int findn(int a,int st, int end) {
        if (st > end) {
            return 0;
        }
        int mid = (st + end) / 2;

        if (arr[mid] == a) {
            return 1;
        } else if (arr[mid] > a) {
            return findn(a, st, mid - 1);
        } else {
            return findn(a, mid + 1, end);
        }
    }
}