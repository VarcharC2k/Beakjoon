import java.io.*;
import java.util.*;

class Main{
    public static int n, target, cnt, temp, coin;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        n = Integer.parseInt(str[0]);
        target = Integer.parseInt(str[1]);
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        int temp = arr.length - 1;

        while (temp > -1) {
            if (target >= arr[temp]) {
                coin = target / arr[temp];
                target -= arr[temp] * coin;
                cnt += coin;
                temp--;
            } else {
                temp--;
            }
        }

        System.out.println(cnt);
    }
}