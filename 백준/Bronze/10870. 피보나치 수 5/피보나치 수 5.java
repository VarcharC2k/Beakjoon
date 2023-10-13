import java.io.*;
import java.util.*;

class Main{
    public static int n;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        System.out.println(fibo(n));
    }

    public static int fibo(int a){
        if(a == 0){
            return 0;
        } else if(a == 1){
            return 1;
        }
        return fibo(a-1) + fibo(a-2);
    }
}