import java.io.*;
import java.util.*;

class Main{
    public static int n,k,result,cnt;
    public static StringTokenizer st;
    public static int[] sorted;
    public static int[] arr;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");

        n = Integer.parseInt(str[0]);
        k = Integer.parseInt(str[1]);
        arr = new int[n];
        st = new StringTokenizer(br.readLine());
        br.close();
        for(int i = 0 ; i < n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        sorted = arr.clone();

        merge_sort(0,arr.length-1);

        if(cnt<k){
            System.out.println(-1);
        } else{
            System.out.println(result);            
        }
    }

    public static void merge_sort(int a, int b) {
        if (a < b) {
            int mid = (a + b) / 2;
            merge_sort(a, mid);
            merge_sort(mid + 1, b);

            int p = a;
            int q = mid + 1;
            int idx = p;

            while (p <= mid || q <= b) {
                cnt++;
                if (q > b || (p <= mid && arr[p] < arr[q])) {
                    sorted[idx] = arr[p++];
                } else {
                    sorted[idx] = arr[q++];
                }
                if (cnt == k) {
                    result = sorted[idx];
                }
                idx++;
            }

            for (int i=a;i<=b;i++) {
                arr[i]=sorted[i];
            }
        }
    }
}