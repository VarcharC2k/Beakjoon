import java.io.*;
import java.util.*;

class Main{
    public static int n,a,b;
    public static StringTokenizer st;
    public static int[][] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());

        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            arr = new int[b+1][a+1];
            System.out.println(bc(b,a));
        }

    }

    public static int bc(int n, int k){
        if(arr[n][k] > 0){
            return arr[n][k];
        }

        if(k == 0|| n == k){
            return arr[n][k] = 1;
        }

        return arr[n][k] = bc(n-1,k-1) + bc(n-1,k);
    }
}