import java.io.*;
import java.util.*;

class Main{
    public static int n,gcdn;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        for(int i = 0; i < n-1; i++){
            int dis = arr[i+1] - arr[i];
            gcdn = gcd(dis,gcdn);
        }

        int result = (arr[n-1]-arr[0])/gcdn+1-(arr.length);
        System.out.println(result);
    }

    public static int gcd(int a, int b){
        if(b == 0){
            return a;
        }
        return gcd(b, a%b);
    }
}