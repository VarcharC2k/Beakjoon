import java.io.*;
import java.util.*;

class Main{
    public static int n,result;
    public static StringTokenizer st;
    public static int[] arr,seq;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        arr = new int[n];
        seq = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = n-1; i >= 0; i--) {
            lis(i);
        }
        for (int num : seq) {
            result = Math.max(result, num);
        }

        System.out.println(result);
    }

    public static int lis(int n){
        if (seq[n] == 0) {
            seq[n] = 1;

            for (int i = n; i >= 0; i--) {
                if (arr[n] > arr[i]) {
                    seq[n] = Math.max(seq[n], lis(i) + 1);
                }
            }
            return seq[n];
        }
        return seq[n];
    }
}