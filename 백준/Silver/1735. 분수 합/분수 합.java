import java.io.*;
import java.util.*;

class Main{
    public static int n,m,o,p, gcdn;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        n = Integer.parseInt(str[0]);
        m = Integer.parseInt(str[1]);
        str = br.readLine().split(" ");
        o = Integer.parseInt(str[0]);
        p = Integer.parseInt(str[1]);
        n = (n*p) + (o*m);
        m *= p;
        gcdn = gcd(n,m);
        System.out.println((n/gcdn) + " " + (m/gcdn));

    }

    public static int gcd(int a, int b){
        if(b == 0){
            return a;
        }
        return gcd(b,a%b);
    }
}