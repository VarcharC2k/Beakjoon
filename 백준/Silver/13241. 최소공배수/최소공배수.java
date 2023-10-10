import java.io.*;
import java.util.*;

class Main{
    public static long a,b,temp;
    public static String[] str;
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        str = br.readLine().split(" ");
        a = Long.parseLong(str[0]);
        b = Long.parseLong(str[1]);
        
        System.out.println(lcm(a,b));
    }
    
    public static long gcd(long a, long b){
        if(b == 0){
            return a;
        }
        return gcd(b, a % b);
    }
    
    public static long lcm(long a, long b){
        return (a*b) / gcd(a,b);
    }
}