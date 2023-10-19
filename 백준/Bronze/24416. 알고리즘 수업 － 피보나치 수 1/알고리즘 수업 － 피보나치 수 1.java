import java.io.*;
import java.util.*;

class Main{
    public static int n,cnt;
    public static StringBuilder sb = new StringBuilder();
    public static int[] arr;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        br.close();
        arr = new int[n+1];

        sb.append(fib(n));
        fibo(n);
        sb.append(" ").append(cnt);
        System.out.println(sb.toString());
    }

    public static int fib(int n){
        if(n== 1 || n == 2) return 1;
        else return (fib(n-1) + fib(n-2));
    }

    public static int fibo(int n){
        arr[0] = arr[1] = 1;

        for (int i = 2; i < n; i++) {
            cnt++;
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        return arr[n-1];
    }
}