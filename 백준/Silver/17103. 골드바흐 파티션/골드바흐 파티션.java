import java.io.*;
import java.util.*;

class Main{
    public static int n,temp,cnt;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        boolean[] arr= new boolean[1000001];
        Arrays.fill(arr,true);

        arr[0] = arr[1] = false;
        for(int i = 2; i < Math.sqrt(1000001); i++){
            if(arr[i]){
                for(int j = i * i; j < arr.length; j += i){
                    arr[j] = false;
                }
            }
        }

        for(int i = 0; i < n; i++){
            cnt = 0;
            temp = Integer.parseInt(br.readLine());
            for(int j = 2; j <= temp/2; j++){
                if(arr[j] && arr[temp-j]){
                    cnt++;
                }
            }
            System.out.println(cnt);
        }
    }
}