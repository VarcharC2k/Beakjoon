import java.io.*;
import java.util.*;

class Main{
    public static int n;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        br.close();
        System.out.println(fac(n));

    }

    public static long fac(int a) {
        if(a <= 1){
            return 1;
        }

        return a * fac(a-1);
    }
}