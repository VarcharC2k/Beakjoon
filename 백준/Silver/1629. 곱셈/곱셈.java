import java.io.*;
import java.util.*;

class Main{
    public static long a,b,c;
    public static String[] str;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        str = br.readLine().split(" ");
        a = Long.parseLong(str[0]);
        b = Long.parseLong(str[1]);
        c = Long.parseLong(str[2]);

        System.out.println(cal(a, b));
    }

    public static long cal(long a, long exp) {
        if (exp == 1) {
            return a % c;
        }

        long temp = cal(a, exp / 2);

        if (exp % 2 == 1) {
            return (temp * temp % c) * a % c;
        }

        return temp * temp % c;
    }
}