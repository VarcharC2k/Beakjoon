import java.io.*;
import java.util.*;

class Main{
    public static int n,cnt;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        for(int i = 1; i * i <= n ; i++){
            cnt++;
        }

        System.out.println(cnt);
    }
}