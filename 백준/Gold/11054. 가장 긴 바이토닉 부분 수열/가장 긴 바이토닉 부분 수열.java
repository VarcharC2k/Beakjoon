import java.io.*;
import java.util.*;

class Main{
    public static int n,result;
    public static int[] arr,seqi,seqd;
    public static StringTokenizer st;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        arr = new int[n];
        seqi = new int[n];
        seqd = new int[n];
        result = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < n; i++) {
            lis(i);
            lds(i);
        }

        for (int i = 0; i < n; i++) {
            result = Math.max(result, seqi[i]+seqd[i]);

        }
        System.out.println(result - 1);
    }

    public static int lis(int n) {
        if (seqi[n] == 0) {
            seqi[n] = 1;

            for (int i = n; i >= 0; i--) {
                if (arr[n] > arr[i]) {
                    seqi[n] = Math.max(seqi[n], lis(i) + 1);
                }
            }
            return seqi[n];
        }
        return seqi[n];
    }

    public static int lds(int n) {
        if (seqd[n] == 0) {
            seqd[n] = 1;

            for (int i = n; i < seqd.length; i++) {
                if (arr[n] > arr[i]) {
                    seqd[n] = Math.max(seqd[n], lds(i) + 1);
                }
            }
            return seqd[n];
        }
        return seqd[n];
    }
}