import java.io.*;
import java.util.*;

class Main{
    public static int n,m,num;
    public static String[] str;
    public static boolean isPrime;
    public static boolean[] prime;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        str = br.readLine().split(" ");

        n = Integer.parseInt(str[0]);
        m = Integer.parseInt(str[1]);
        br.close();

        prime = new boolean[m+1];
        Arrays.fill(prime,true);
        prime[0] = false;
        prime[1] = false;
        prime = getPrime(prime,m);

        for(int i = n; i < prime.length; i++){
            if(prime[i]){
                System.out.println(i);
            }
        }

    }

    public static boolean[] getPrime(boolean[] prime,int n){
        for(int i = 2; i*i <= n; i++){
            if(prime[i]){
                for(int j = i * i; j <= n; j+=i){
                    prime[j] = false;
                }
            }
        }
        return prime;
    }
}